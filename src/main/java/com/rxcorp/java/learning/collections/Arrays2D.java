package com.rxcorp.java.learning.collections;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;

        System.out.println(a.length);
        for(int i = 0; i<= a.length-1;i++){
            for(int j = 0; j<=a.length-1; j++){
                System.out.println(a[i][j]);
            }
        }

        //Way2 of declaring the array
        int[][] b = {{1,2},{3,4}};
        b[0][0] = 20;
        b[0][1] = 20;


        System.out.println(b.length);
        for(int i = 0; i<= b.length-1;i++){
            for(int j = 0; j<=b.length-1; j++){
                System.out.println(b[i][j]);
            }
        }

    }
}
