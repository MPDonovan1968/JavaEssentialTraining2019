package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, ClothingItem> items = new HashMap<>();

        items.put("Shirt", new Shirt(
                ClothingSize.L,
                19.99,
                3));

        items.put("Hat", new Hat(
                ClothingSize.M,
                29.99,
                1));

        var anItem = items.get("Hat");
        displayItemDetails(anItem);
        anItem =  items.get("Shirt");
        displayItemDetails(anItem);

        System.out.println("\nor loop:\n");

        var keys = items.keySet();
        for (String key: keys
             ) {
            displayItemDetails(items.get(key));
        }


    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}