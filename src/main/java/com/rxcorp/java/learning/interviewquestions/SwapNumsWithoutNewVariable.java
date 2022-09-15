package com.rxcorp.java.learning.interviewquestions;

public class SwapNumsWithoutNewVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Value of a Before swapping " + a);
        System.out.println("Value of b Before swapping " + b);
        b = b - a;
        a = a + b;
        System.out.println(a);
        System.out.println(b);

        System.out.println("Value of a After swapping " + a);
        System.out.println("Value of b After swapping " + b);

    }
}
