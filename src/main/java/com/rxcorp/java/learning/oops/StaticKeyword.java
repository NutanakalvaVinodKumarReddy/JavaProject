package com.rxcorp.java.learning.oops;

/*
    @TODO:Memory Management
          Things that are Common through out the programme then we make them as static.
          Objects will take memory in Heap area.

 */

class StaticKeyword {
    String name = "AA";
    int id = 100;
    static String college = "SVTM";

    public static void main(String[] args) {
        System.out.println(StaticKeyword.college);
        NewStaticClass obj= new NewStaticClass();
        obj.m2();

    }

    void m1(){
        System.out.println("1000");
    }
}

class NewStaticClass{

    void m2(){
        StaticKeyword obj = new StaticKeyword();
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(StaticKeyword.college);
        obj.m1();
    }


}


