package com.company;

public class Main {

    public static void main(String[] args) {

        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        for (var month:months) {
            System.out.println(month);
        }
    }
}
