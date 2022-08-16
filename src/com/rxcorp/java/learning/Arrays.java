package com.rxcorp.java.learning;
/*
Array is a collection of similar data type of element which has continous memory location.
We can store a fixed set of elements in an Array.
These are Java-Index based.
 */
public class Arrays {
    public static void main(String[] args){
        int arr1[] = new int[5];
        arr1[0] =1001;
        arr1[1] =1005;
        arr1[2] =1002;
        arr1[3] =1003;
        arr1[4] =1004;
        for(int i = 0; i<=arr1.length -1;i++){
            System.out.println(arr1[i]);
        }

        String arr2[] = {"Apple","Banana","Orange"};

        for(int i = 0; i<=arr2.length-1;i++){
            System.out.println(arr2[i]);
        }


    }
}
