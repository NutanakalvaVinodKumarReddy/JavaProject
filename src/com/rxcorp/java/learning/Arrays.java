package com.rxcorp.java.learning;
/*
Array is an indexed collection of fixed number of homogeneous data type of element which has continuous memory location.
We can store a fixed set of elements in an Array.
These are Java-Index based.
To declare n number of values then we go for Arrays.
Each element in Array is identified with index.
Every Array is an Object. Hence we can create Arrays by using "new" keyword.

**Advantages:
1. Store n number of values with a single variable name.
2. Readability of the code will be improved.

**Dis-advantage:
1. Fixed size of elements
2. Stores only Homogenous DataTypes

Types of Array Declaration:
1. 1-D Array
2. 2-D Array

TODO: https://www.youtube.com/watch?v=HSp0UX9Z8Zw&ab_channel=DurgaSoftwareSolutions -->Part1

 */
public class Arrays {
    public static void main(String[] args){
        int[] a; //This is recommended as the name is clearly separated from type
                 //We should not delcare the size of an array during declaration.
        int []b;
        int c[];

        int[] names = new int[6];
        System.out.println(names.getClass().getName()); //[I

        short[] a1 = new short[6];
        System.out.println(a1.getClass().getName()); //[S

        byte[] a2 = new byte[6];
        System.out.println(a2.getClass().getName()); //[B

        double[] a3 = new double[6];
        System.out.println(a3.getClass().getName()); //[D

        boolean[] a4 = new boolean[6];
        System.out.println(a4.getClass().getName()); //[Z

        String[] students = new String[3];
        students[0] = "AA";
        students[1] = "BB";
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
    }
}
