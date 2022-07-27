package com.company;

import com.company.model.ClothingItem;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem();
        item.setType("Shirt");
        item.setSize("m");
        item.setPrice(9.79);
        item.setQuantity(4);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s will cost %s",
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
