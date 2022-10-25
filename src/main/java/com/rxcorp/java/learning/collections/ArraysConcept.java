package com.rxcorp.java.learning.collections;

/*
@TODO:Arrays can store N number of values with a single variable name.
     :Arrays store fixed length.
     :To use Arrays user should know the size in advance
     :Array values stored in continuous memory using indexes
     :Arrays will store only homogenous dataType.
     :No Underlying Data Structure, So no in-built methods are not available.
     :We cannot specify the size during declaration. Else we will get compile time error.
     :Array is an object since we are using new keyword to create a variable.
 */

public class ArraysConcept {
    public static void main(String[] args) {
/*        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        Reading will become difficult as we are defining n no of variables.
        To overcome this we go for next level concept called Arrays
        Arrays will store n number of values within a single variable.


 */
        //1-D Array example
        int[] x;   //Most recommended
        int y[];
        int[] z;

        //2-D Array example
        int[][] a;
        int[][] b;
        int c[][];

        int[][] d;
        int[] e[];
        int[] f[];

        int[] g, h; //g-1,h-1
        int[] i[], j; //i-2,j-1
        int[] k[], l[]; //k-2,l-2

        int[][] m, n; //m-2,n-2 Space is ignored by the compiler
        int[][] o, p[]; //o-2,p-3 Space is ignored by the compiler
//        int[] []q,[]r; //Compiler time error as we cannot specify dimension for second variable

        int[] aa = new int[2];
        System.out.println(aa.getClass().getName()); //[I

        int[][] aa1 = new int[2][4];
        System.out.println(aa1.getClass().getName()); //[[I

        /*
        For Array corresponding class are available. And these class are part of Java language and available to the programmer level.
         */

        //Array Type and corresponding classes

        int[] a1; //[I
        double[] a2; //[D
        short[] a3; //[S
        byte[] a4; //[B
        boolean[] a5; //[Z

//        int[] c1 = new int[];   -->Compiler will throw error because during declaration size is not required where are during creation size is must and should we have to specify.
        int[] c1 = new int[5];

        for(int i1:c1){
            System.out.println(i1);
        }

        int[] c11 = {10,20,30,40,50};

        int[] c2 = new int[0];      //-->It is legal to have an Array of size "Zero" in java.
//        int[] c3 = new int[-3];     //-->Negative value is allowed and compiler won't throw any exception
                                    //But RunTime it will throw error: NegativeArraySize Exception

//        byte ->short ->int  ->long ->float ->double
//                char ->int


        int[]  stdid = new int[10];
        int[]  stdid1 = new int['a'];

        byte id2 = 10;
        int[]  stdid2 = new int[id2];

        short id3 = 10;
        int[]  stdid3 = new int[id3];

        char id4 = 'c';
        int[]  stdid4 = new int[id4];

        long id5 = 1000;
//        int[] stdi5 = new int[id5];  -->Compile time error

//To specify ArraySize the allowed dataTypes are char, byte, short and int
//If we specify any dataType which is higher than declared dataType we will get an exception


        Object[] college = new Object[3];
        college[0] =1;
        college[1] ="SVTM";
        college[2] =10.20;
        for(Object i11:college){
            System.out.println(i11);
        }
    }
}
