package com.company;

import com.company.model.ClothingItem;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        var item = new ClothingItem();
        item.setType("Shirt");
        item.setSize("M");
        item.setPrice(19.99);
        item.setQuantity(3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order will cost %s",
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);


        var myOtherItem = new ClothingItem("Trousers", "XXL", 19.99, 2);
        var totalPriceTwo = myOtherItem.getPrice() * myOtherItem.getQuantity();
        output = String.format("Your %s order will cost %s",
                myOtherItem.getType(),
                formatter.format(totalPrice));
        System.out.println(output);

    }
}