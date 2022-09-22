package com.rxcorp.java.learning.oops;

/*
@TODO:Public -> Any variable or member can be accessed with in a class or outside a class or within a package or outside package.
             -> A keyword public should be used then only the members can be accessed. Else Compile will thrown an error.
             YouTube: https://www.youtube.com/watch?v=hNrzG-iDODE&ab_channel=DurgaSoftwareSolutions
             -> Highly recommended modifier for Method is Public.

@TODO:Default -> Default members can be accessed within a Package.
              -> It is also known as package level access.

@TODO:Private -> Private members can be accessed within a Class.
              -> Highly recommended modifier for variable is Private.

 */

public class Modifiers {

    public String carName = "Benz";
    int price = 300000;
    private int mileage = 30;

    public void add() {
        System.out.println(2 + 4);
        System.out.println(carName);
        System.out.println(price);
        System.out.println(mileage);
    }

    void sub() {                                     //default
        System.out.println(4 - 2);
        System.out.println(carName);
        System.out.println(price);
        System.out.println(mileage);
    }
}


