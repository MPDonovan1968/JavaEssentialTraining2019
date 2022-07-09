package com.company;

public class Main {

    public static void main(String[] args) {

        String s = null;

        try {
            var sub = s.substring(1);
        } catch (Exception e) {
            System.out.println("there was an error");
            e.printStackTrace();
//            'Process finished with exit code 0'
//            Uncomment line below and:
//            'Process finished with exit code 1'
            throw new RuntimeException(e);

        }
        System.out.println("Continuing...");

    }
}
