package com.rxcorp.java.learning.controlstatements;
import com.rxcorp.java.learning.oops.Modifiers;
import com.rxcorp.java.learning.oops.ProtectedModifier1;



public class Modifier1 extends ProtectedModifier1 {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        obj.add();
        System.out.println(obj.carName);
//        System.out.println(price);        --->Default member cannot access outside a package
//        System.out.println(mileage);      --->Private member cannot access outside a package

//        obj.sub()                         --->Since the method is not public it cannot be accessed
//                                          --->Default members cannot be accessed outside a package

        ProtectedModifier1 obj1 = new ProtectedModifier1();
//        obj1.m2();                        --->We cannot access this method outside a package as it is protected

        Modifier1 obj2 = new Modifier1();
        obj2.m2();                       // --->Using child class we can access members outside a pacakge
    }
}
