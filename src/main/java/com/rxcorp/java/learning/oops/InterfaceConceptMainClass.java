package com.rxcorp.java.learning.oops;

/*
@TODO: Any service requirement specification(SRS)
       Any contract b/w client and service provider
       Every method inside interface is public and abstract by default.
    Rule1: If we do not declare access modifier in implementing class then we get compile time error
    Rule2: We should declare implementation for every method in the interface when implementing interface
           Else if we don;t want to implement then we should declare class as abstract.
 */

public class InterfaceConceptMainClass implements CollegeApp {         //Implements is the keyword used to implement interface
    public static void main(String[] args) {

        InterfaceConceptMainClass obj = new InterfaceConceptMainClass();
        obj.attendance();
        obj.studInfo();
        obj.staffInfo();

        InterfaceConceptClass2 obj1 = new InterfaceConceptClass2();
        obj1.attendance();
        obj1.studInfo();
        obj1.staffInfo();

    }


    public void attendance() {
        System.out.println("80%");

    }

    public void studInfo() {
        System.out.println("100");
    }

    public void staffInfo() {
        System.out.println("20");
    }
}

interface CollegeApp {                  //Interface is the keyword used to specify an interface
    public void attendance();           //Abstract Method even though we have not specified but by default all methods in interface are abstract

    void studInfo();                    //Abstract Method even though we have not specified but by default all methods in interface are abstract

    abstract public void staffInfo();   //Abstract Method even though we have not specified but by default all methods in interface are abstract
//    void fee(){
//                                      //We cannot have a implemented method inside an interface.
//    }

}

abstract class InterfaceConceptClass1 implements CollegeApp{
                                        // Even though we don't implement abstract methods we are going to declare class as abstract.
                                        // If we don't implement then the child is responsible to provide the implementation.
}

class InterfaceConceptClass2 extends InterfaceConceptClass1{
    @Override
    public void attendance() {
        System.out.println("After Implementation ->80%");
    }
    @Override
    public void studInfo() {
        System.out.println("After Implementation ->100");
    }
    @Override
    public void staffInfo() {
        System.out.println("After Implementation ->30");
    }
}