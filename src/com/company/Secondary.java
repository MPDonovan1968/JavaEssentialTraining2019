package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.HashMap;
import java.util.Currency;
import java.util.Map;

public class Secondary {

    public static void main(String[] args){
        var doubleValue = 10000000.53;
        System.out.println(doubleValue);
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Your Salary is: $" +numF.format(doubleValue) +  " per millennia");

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("As a formatted integer: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("As a formatted integer: " + intF.format(doubleValue));

        var locale = Locale.getDefault();
        System.out.println(locale);
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Now is " + localFormatter.format(doubleValue));

        locale = new Locale("fr", "FR");
        System.out.println(locale);
        localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Now is " + localFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("First (late) attempt: " + currencyFormatter.format(doubleValue));
        Currency currency = Currency.getInstance(locale);
        String symbol = currency.getSymbol(locale);
        System.out.println("In de the money looks like: " + currencyFormatter.format(doubleValue) + symbol);

        Map<Currency, Locale> map = getCurrencyLocaleMap();
        locale = new Locale("EN","GB");
        currency = Currency.getInstance(locale);
        symbol = currency.getSymbol(map.get(currency));
        System.out.println("For country GB, currency symbol is " + symbol);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(doubleValue));
        System.out.println("India: "  + india.format(doubleValue));
        System.out.println("China: "  + china.format(doubleValue));
        System.out.println("France: " + france.format(doubleValue));
        System.out.println("France: " + france.format(doubleValue) + " " + france.getCurrency().getSymbol(Locale.FRANCE));

        var df = new DecimalFormat("₽ 00.00");
        System.out.println(df.format(120));

    }

    public static Map<Currency, Locale> getCurrencyLocaleMap() {
        Map<Currency, Locale> map = new HashMap<>();
        for (Locale locale : Locale.getAvailableLocales()) {
            try {
                Currency currency = Currency.getInstance(locale);
                map.put(currency, locale);
            }
            catch (Exception e){
                // skip strange locale
            }
        }
        return map;
    }

}
