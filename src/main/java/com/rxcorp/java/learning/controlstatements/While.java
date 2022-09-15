package com.rxcorp.java.learning.controlstatements;
/*
Java while loop is used to iterate a part of a programme until the specified Boolean condition is true.
We go for While Loop if the no.of iterations is not fixed.
 */
public class While {
    public static void main(String[] args){
        int age = 30;
        while(age<=50){
            System.out.println("User age is "+ age +" which is less then the benchmark age 50. Proceed furthur");
            age++;
        }
    }
}
