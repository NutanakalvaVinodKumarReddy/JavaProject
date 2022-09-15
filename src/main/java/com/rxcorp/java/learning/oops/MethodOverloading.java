package com.rxcorp.java.learning.oops;

/*
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
Advantage of method overloading increases the readability of the program.
 */

class MethodOverloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(10, 20);
        obj.add(10, 20, 30);

        Substraction.sub(10, 20);
        Substraction.sub(10, 20, 30);

        System.out.println("Multiplication" + multiply(10, 20));
        System.out.println("Multiplication" + multiply(10, 20, 30));

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class Addition {
    void add(int a, int b) {
        System.out.println("Addition" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition" + (a + b + c));
    }
}

class Substraction {
    public static void sub(int a, int b) {
        System.out.println("Substraction" + (a - b));
    }

    public static void sub(int a, int b, int c) {
        System.out.println("Substraction" + (a - b - c));
    }
}
