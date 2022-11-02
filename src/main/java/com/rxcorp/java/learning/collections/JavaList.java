package com.rxcorp.java.learning.collections;

import java.util.ArrayList;
import java.util.List;

/*
@TODO: List in java store the values in order
     : Allows duplicates
 */
public class JavaList {
    public static void main(String[] args) {

        ArrayList<String> id = new ArrayList<String>();
        id.add("100");
        id.add("200");
        id.add("300");
        id.add("400");
        System.out.println(id.size());
        for(int i = 0; i<= id.size()-1;i++){
            System.out.println("Id value at index "+ i +" is " +id.get(i));
        }
        id.toArray().toString();
        id.remove(2);
    }
}
