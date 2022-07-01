package com.company;


public class Main {

    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);
        System.out.println("Did the run config work?");

        // String result2 = 10 + 20;  // Error
        var result2 = 10 + 20;
        System.out.println(result2);  // not a concatenated string. An added number
        String result3 = "10" + "20";
        System.out.println(result3);
        System.out.println("Conversion needs at least one string.");

        int intVal = 42;
        var fromInt = Integer.toString(intVal);
        System.out.println(fromInt);

        boolean boolVal = true;
        var fromBool = Boolean.toString(boolVal);
        System.out.println(fromBool);
        System.out.println(boolVal);

        long longVal = 10000000;
        var fromLong = Long.toString(longVal);
        System.out.println(fromLong);
        System.out.println(longVal);


    }
}