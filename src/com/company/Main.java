package com.company;

public class Main {

    public static void main(String[] args) {
        var s1 = "Welcome to California!";
        System.out.println("Length is " + s1.length());
        int position =   s1.indexOf("for");
        System.out.println(position);
        var sub = s1.substring(11);
        System.out.println(sub);
        String s2 = "Wilkommen        ";
        var len = s2.length();
        System.out.println(len);
        var s3 = s2.trim();
        len = s3.length();
        System.out.println(len);
        System.out.println(s2 +"---");
        System.out.println(s3 +"---");
    }
}
