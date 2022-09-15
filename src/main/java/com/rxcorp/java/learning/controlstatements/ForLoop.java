package com.rxcorp.java.learning.controlstatements;
/*
The Java for loop is used to iterate a part of the program several times.
If the number of iteration is fixed, it is recommended to use for loop.
 */

public class ForLoop {
    public static void main(String[] args){
        int age = 20;
        for(int i = 0; i <=age;i++ ) {
            if(i%2 ==0) {
                System.out.println(i);
            }

        }
    }

}
