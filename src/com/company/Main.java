package com.company;

import com.company.model.*;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        String[] colors = new String[3];
        colors[0] = "fuschia";
        colors[1] = "lavender";
        colors[2] = "salmon";
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);

        }

        ClothingItem[] items = {
                new Shirt(
                        ClothingSize.L,
                        19.99,
                        3),
                new Hat(
                        ClothingSize.M,
                        29.99,
                        1),
                new Pants(ClothingSize.M,
                            49.99,
                2)

        };

        for (ClothingItem item : items
             ) {
            displayItemDetails(item);
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