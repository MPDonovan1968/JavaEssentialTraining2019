package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var myShirt = new Shirt(
                ClothingSize.L,
                19.99,
                3);

        displayItemDetails(myShirt);

        var myNewHat = new Hat(
                ClothingSize.XL,
                12.89,
                1
        );
        displayItemDetails(myNewHat);
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