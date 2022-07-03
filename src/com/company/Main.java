package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.Month;
public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        var monthNumber = scanner.nextInt();

        String message;
        if(monthNumber < 1 || monthNumber > 12){
            message = "Month not valid";
        } else if (monthNumber <= 3) {
            message = "Quarter one";
        } else if (monthNumber <= 6) {
            message = "Quarter two";
        } else if (monthNumber <= 9) {
            message = "Quarter three";
        } else {
            message = "Quarter four";
        }
        Month month = Month.of(monthNumber);
        var strMonth = "";
        strMonth = month.toString();
        strMonth = strMonth.toLowerCase();
        var myMonth = strMonth.substring(0,1).toUpperCase() + strMonth.substring(1);
        System.out.println(myMonth + " is in this quarter: " + message);

        var now = LocalDateTime.now();
        var newMonthNumber = now.getMonthValue();

        if(newMonthNumber <= 3) {
            message = "Quarter one";
        } else if (newMonthNumber <= 6) {
            message = "Quarter two";
        } else if (monthNumber <= 9) {
            message = "Quarter three";
        } else {
            message = "Quarter four";
        }

        month = Month.of(newMonthNumber);
        strMonth = month.toString();
        strMonth = strMonth.toLowerCase();
        myMonth = strMonth.substring(0,1).toUpperCase() + strMonth.substring(1);
        System.out.println("\n\nWe are currently inthe month of: " + myMonth + " which is in this quarter: "
                + message  + "\n");

    }
}
