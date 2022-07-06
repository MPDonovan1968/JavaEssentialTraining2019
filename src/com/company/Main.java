package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");

        double result = addValues(i1, i2);
        System.out.println("The sum is " + result);

        double resultOfFour = addValues(i1, i2, i1, i2);
        System.out.println("The sum of four is " + resultOfFour);

        double resultOfMany = addValues(i1, i2, i1, i2, 22, 34);
        System.out.println("The sum of Many is " + resultOfMany);

        double resultLast = addValues(55, 12, 8);
        System.out.println("Last result is: "+ resultLast);

    }

    private static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2) {
        System.out.println("First Add Values");
        return i1 + i2;
    }

    private static double addValues(int i1, int i2, int i3, int i4) {
        System.out.println("Values with four");
        return i1 + i2 + i3 + i4;
    }

    private static double addValues(int... values) {
        System.out.println("Indeterminate number of values");
        int res = 0;
        for (var value: values
             ) {
            res += value;
        }
        return res;
    }


}
