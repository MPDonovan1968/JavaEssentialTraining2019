package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";
        if(s1 == s2){
            System.out.println("Equals");
        }else{
            System.out.println("no equals");
        }
        String s3 = new String("Hey there.");
        String s4 = new String("Hey there.");
        if(s3 == s4){
            System.out.println("Equals");
        }else{
            System.out.println("no equals");
        }
        if(s3.equals(s4)){
            System.out.println("Equals");
        }else{
            System.out.println("Does not equal");
        }
        String s5 = new String("HEllO");
        String s6 = new String("hello");
        if(s5.equalsIgnoreCase(s6)){
            System.out.println("S5 and 6 Equals");
        }else{
            System.out.println("s5 and 6 - Does not equal");
        }

    }
}
