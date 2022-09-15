package com.rxcorp.java.learning.interviewquestions;
/*
Panlindrome is when a given string is reversed it will still give the same string
Ex:radar , level
 */

public class Palindrome {
    public static void main(String[] args) {
        String str = "Radar";
        String str1 = "";
        int strLen = str.length();
        System.out.println("given str length" + str.length());
        for (int i = 1; i <= strLen; i++) {
            System.out.println(i);
            str1 = str1 + str.charAt(strLen - i);
        }
        //==doesn't compares the Strings value - it compares object references.
        if (str.toLowerCase() == str1.toLowerCase()) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is NOT a Palindrome");
        }

        //1. Using equalsIgnoreCase method
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is NOT a Palindrome");
        }

        //2. Using Equals method
        if (str.toLowerCase().equals(str1.toLowerCase())) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is NOT a Palindrome");
        }

    }
}
