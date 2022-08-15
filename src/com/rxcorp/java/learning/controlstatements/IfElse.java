
package com.rxcorp.java.learning.controlstatements;
/*
If else statement is used to test a condition. It checks boolean condition:true/false.
ToDo: Types of if statements
    1.if statement
    2.if-else statement
    3.if-else-if statement
    4.nested if statement
 */
public class IfElse {
    public static void main(String[] args) {
        int age = 30;
        if(age == 30) {
            System.out.println("User age is as per standards i.e:"+ age);
        }

//(iii) : if-else-if statement
        if(age == 30) {
            System.out.println("User age is as per standards i.e:"+ age);
        }
        else {
            System.out.println("User age is not as per standards i.e:"+ age);
        }

//(iii) : if-else-if statement
        if(age == 30) {
            System.out.println("User age is as per standards i.e:"+ age);
        }
        else if((age > 30)) {
            System.out.println("User age is greater than 30 i.e "+ age);
        }
        else if((age < 30)) {
            System.out.println("User age is less than 30 i.e "+ age);
        }
    }
}
