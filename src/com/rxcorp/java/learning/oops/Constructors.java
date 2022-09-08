package com.rxcorp.java.learning.oops;


public class Constructors {
    public static void main(String[] args) {
        Constructor1 obj = new Constructor1();
        obj.display();

        Constructor2 obj1 = new Constructor2(10, "AP");

    }
}

class Constructor1 {
    int id;
    String name;

    void display() {
        System.out.println("id" + id + "name" + name);
    }
}

class Constructor2 {
    int age;
    String state;

     Constructor2(int i, String j) {
        age = i;
        state = j;
        System.out.println(age);
        System.out.println(state);
    }


}