package com.rxcorp.java.learning.oops;

import java.util.Locale;

public class StringFunctions {
    public static void main(String[] args) {

        String college1 = "Srinivas";
        String college2 = "Gnanambica";

        //Length: To get the length of a String
        System.out.println(college1.length());
        System.out.println(college2.length());

        //Lowercase: To make lower case of a String
        System.out.println(college1.toLowerCase());
        System.out.println(college2.toLowerCase());

        //Uppercase: To make upper case of a String
        System.out.println(college1.toUpperCase());
        System.out.println(college2.toUpperCase());

        //concat: For concatenating two strings
        System.out.println(college1.concat(college2));
        System.out.println(college1.concat(college1));

        //equals : Object to object comparison
        System.out.println(college1.equals(college2));
        System.out.println(college2.equals(college2));

        //equals : String value to value comparison
        System.out.println(college1.equalsIgnoreCase (college2));
        System.out.println(college1.equalsIgnoreCase (college1));

        //substring: Getting a part of String
        System.out.println(college1.substring(2));
        System.out.println(college2.substring(1,5));

        //replace: Replacing a value from a String
        System.out.println(college1.replaceAll("vas","vasa College"));
        System.out.println(college2.replaceAll("bica","bica College"));

    }
}
