package com.rxcorp.java.learning.interviewquestions;
/*
Q. Seperate AlphaNumeric characters from a given String?
 */

public class SeperateAlphaNumeric {
    public static void main(String[] args){
        String str = "Alpha124XG";
        alphaNumericSeperator(str);
    }

    public static void alphaNumericSeperator(String str){
        String numerics = str.replaceAll("[^0-9]","");
        String alphbets = str.replaceAll("[0-9]","");
        System.out.println(numerics);
        System.out.println(alphbets);
    }

}
