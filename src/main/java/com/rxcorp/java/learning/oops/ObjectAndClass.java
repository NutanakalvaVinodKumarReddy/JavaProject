package com.rxcorp.java.learning.oops;

/*
ToDo: Object
    1.An entity which has state and behaviour is known as object
        State: Represent the data of an object
        Behaviour: Represent the functionality
    Example: Pen is an object. Name is Reynolds,color is white known as state.
            It is used for writing, so here the behaviour is writing.

ToDO: Class
    A group of objects which have common properties.It is an logical entity.
 */
public class ObjectAndClass {
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println(obj.age);
        System.out.println(obj.name);
        obj.collegeInfo();

        // Example to illustrate scope of default member
        Modifiers obj1 = new Modifiers();
        obj1.add();
        obj1.sub();
    }

}
class Student{
    String name = "Vinod";
    int age = 30;

   public void collegeInfo() {
        System.out.println("SVTM");
    }

}
