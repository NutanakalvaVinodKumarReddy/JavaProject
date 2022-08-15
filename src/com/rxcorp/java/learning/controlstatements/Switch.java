package com.rxcorp.java.learning.controlstatements;
/*
It is like if-else-if ladder statement.
ToDo: Points to remember
    1. There can be N number of case values for a switch expression
    2. Case value must of unique. In case of duplicate it will throw compile time error.
    3. Each case statement can have a break statement which is optional

 */
public class Switch {
public static void main(String[] args) {
    int age = 30;
    switch (age){
        case (20):
                System.out.println("Age is less than 20");
                break;
        case (30):
                System.out.println("Age is equal to 30");
                break;
        case (40):
                System.out.println("Age is greater than 30");
                break;
        default: System.out.println("Given age is wrong");
    }
}
}
