package com.rxcorp.java.learning.interviewquestions;
/*
Q.Write a programme to print Fibonacci series?
 */
public class FibonacciSeries {
    public static void main(String[] args){
        int a = 0, b = 1 ,count = 20, n;
        System.out.println(a);
        System.out.println(b);
        for(int i =2;i<20;++i) {
            n = a + b;
            a = b;
            b = n;
            System.out.println(n);
        }
    }
}
