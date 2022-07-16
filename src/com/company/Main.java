package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var file = new File("helloH.txt");
        System.out.println("File exists: " + file.exists());
// try with resources, below. This makes sure that the FileReader and the BufferedReader are closed no matter what happens
//  with exceptons, etc. FileReader implements the interface Closeable so we are responsible for closing it.
        try(
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader)
                ) {

            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println("File not found\nCaught error... continuing");
        }
        System.out.println("Finishing");


    }

}
