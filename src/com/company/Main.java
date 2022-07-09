package com.company;

public class Main {

    public static void main(String[] args) {

//        String s = null;
        String s = "";

        try {
            var sub = s.substring(1);
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("index out of bounds error " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Some other kind of exception");
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
