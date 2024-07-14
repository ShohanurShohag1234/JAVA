

package com.mycompany.stringoop;


public class Stringoop {


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String concatenated = str1 + " " + str2;
        // Alternatively: String concatenated = str1.concat(" ").concat(str2);

        int length = str1.length();

        String substring = str1.substring(2);

        String uppercase = str1.toUpperCase();

        String lowercase = str2.toLowerCase();

        boolean areEqual = str1.equals(str2);

        int comparison = str1.compareTo(str2);

        System.out.println("Concatenated: " + concatenated);
        System.out.println("Length of str1: " + length);
        System.out.println("Substring: " + substring);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Are equal: " + areEqual);
        System.out.println("Comparison: " + comparison);
    }
}

