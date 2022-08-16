package com.rxcorp.java.learning.interviewquestions;
/*
Q.How to reverse a given string?
 */
public class ReverseString {
    public static void main(String[] args){
        String name = "ServiceNow";
        String reverseName = "";
        int strLen = name.length();
        for(int i = 1; i<=strLen;i++){
            reverseName = reverseName + name.charAt(strLen -i);
        }
        System.out.println(reverseName);
    }
}
