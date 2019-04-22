package com.company;

public class Main {

    public static void main(String[] args) {

        String s = "welcome";
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }

        System.out.println();
        for (int i = letters.length-1; i >-1; i--) {
            System.out.print(letters[i]);
        }

        //Strings are immutable in Java. That means they can't be changed.
        //If you modify a String the Java compiler actually creates an entirely new
        //copy and discards the first. This is inefficient.
        //StringBuilder is for modifying strings. It is similar to StringBuffer
        //which is for multi-threaded applications
        //and not as frequently used.
        System.out.println();
        String output = new StringBuilder(s).reverse().toString();
        System.out.println(output);
    }
}
