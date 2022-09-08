package com.rxcorp.java.learning.oops;
/*
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
Inheritance represents IS-A relationship also known as parent-child relationship.
Uses of Inheritance: 1. Method overriding
                     2. Code reusability

Types of Inheritance:
1. Single (class Parent <- class Child)
2. Multi (class Parent <- class Child1 <- class Child2)
3. Hierarchichal (class Parent <- class Child1
                  class Parent <- class Child2)
4. Multiple (class Parent1  class Paraten2
                          <- class Child2)
 */

public class Inheritance {
    public static void main(String[] args) {
        Vechile vobj = new Vechile();
        System.out.println("Vechile class variable " + vobj.noOfWheels);
        System.out.println("Vechile class method " + vobj.noOfSeats());

        Bus bobj = new Bus();
        System.out.println("Bus class variable wheels " + bobj.noOfWheels);
        System.out.println("Bus class method seats " + bobj.noOfSeats());
        System.out.println("Bus class method mirrors " + bobj.noOfMirrors());
        System.out.println("Bus class method gears " + bobj.noOfGears());

     }
}


class Vechile {    //-->Super class/Parent class
    int noOfWheels = 2;

    int noOfSeats() {
        return 4;
    }
    int noOfMirrors() {
        return 6;
    }
}

class Bus extends Vechile {    //-->Sub class/child class (Single Level inheritance)
    int noOfWheels = 4;

    int noOfSeats() {
        return 15;
    }

    int noOfGears() {
        return 4;
    }
}
