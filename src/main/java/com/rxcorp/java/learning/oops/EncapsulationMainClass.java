package com.rxcorp.java.learning.oops;
/*
@TODO: Encapsulation : The process of grouping data members(variables + methods) into a single unit.
                     : Data hiding + Abstraction
                     In Encapsulation the variables of a class will be hidden from other classes and can only be accessed through the methods of their current class.
                     Providing public setter and getter  methods to modify  and view the variable values
                     Security
                     Enhancement
                     Maintainability
                 It increases the code like for every private variable we have to provide getter and setter methods.
                 Performance will be issue.

 */

public class EncapsulationMainClass {
    public static void main(String[] args) {
        BankAccountDetails obj = new BankAccountDetails();
        obj.setBalance(100, 110101, "SBI");
        System.out.println(obj.getBalance());


    }

}

class BankAccountDetails {
    private double balance;
    int accNumber = 110101;
    String bankName = "SBI";

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int depositamount, int accNo, String bnknm) {
        if (accNo == accNumber & bankName.equalsIgnoreCase(bnknm)) {
            this.balance = balance + depositamount;
        } else {
            this.balance = -1;
        }

    }
}