package com.rxcorp.java.learning;
/*
Variables are container for storing data values
In Java, there are different types of variables
1/ String - stores text, such as "Hello". String values are surrounded by double quotes
2/ int - stores integers (whole numbers), without decimals, such as 123 or -123
3/ float - stores floating point numbers, with decimals, such as 19.99 or -19.99
4/ char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
5/ boolean - stores values with two states: true or false

ToDo 1: Primitive DataTypes
        byte, short, int, long, boolean, char, double, float
     2: Non-primitive DataTypes
        Arrays, Classes, Interfaces

Note: Always use descriptive names for more understandable and maintainability

ToDo:Declaration:
    (i)   dataType variableName = value;
    (ii)  dataType variableName1,variableName2,..variableNamen;
          variableName1,variableName2,..variableNamen = 10;
    (iii) dataType variableName1 = value1,variableName2 = value2,..variableNamen= valuen;

ToDo:Website:
https://www.w3schools.com/java/java_variables.asp
 */
public class VaraiablesAndDataTypes{
    public static void main(String[] args) {
        int id = 2;
        String name = "Vinod";
        float money =  10.10f;
        double marks = 98.99;
        char grade = 'A';
        boolean pass = true;
        String newvariable = id + name;
        System.out.println("*************Print statement for variables*************");
        System.out.println("id is : " + id);
        System.out.println("name is : " + name);
        System.out.println("money is : " + money);
        System.out.println("marks is : " + marks);
        System.out.println("grade is : " + grade);
        System.out.println("ispass is : " + pass);
        System.out.println("ispass is : " + newvariable);

        System.out.println("***********Assign value to multiple variables");
        int x = 5, y = 10, z= 10;
        int a, b, c;
        a = b = c = 10;
        System.out.println(a);
        System.out.println(a + b);
        System.out.println(a + b + c);

        System.out.println(x);
        System.out.println(x + y);
        System.out.println(x + y + z);

    }
}