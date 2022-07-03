package com.company;

import java.util.Scanner;

public class classChallenge {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        var flOne = scanner.nextDouble();
        System.out.print("Please enter a number: ");
        var flTwo = scanner.nextDouble();
        var divisor = flOne / flTwo;
        System.out.println(divisor);
    }
}
