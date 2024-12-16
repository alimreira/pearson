package com.example.pearsonFive.methodRef;

public class Note {

    /*
    * 1.Method reference is use to refer a method (custom or predefined) used in the course of implementing
    *  a functional interface.
    *
    * 2.Is it a compact and easy to use form of Lambda expression
    * You can replace a lambda expression with a method reference
    *
    * 3.Yes, a method reference must match the return type and parameter count of the functional
    * method in the functional interface.
     *
    * 4.There are basically 4 types of method references:
    *
    * Method reference to static method : Class::StaticMethodName
    * Method reference to an instance method of a particular object::instanceMethodName
    * Method to an instance method of an arbitrary object of specific type  Class::instanceMethodName
    * Method reference to a constructor className::new
    *
    *
    * 5.Method Ref vs Lambda, the difference:
    * Method References: A method reference replaces a lambda expression and directly points to a method
    * that must match the functional interface's method signature in terms of return type and parameters.
    Methods Inside Lambda Bodies: Methods used inside the body of a lambda expression are just part of the
* lambda's implementation logic. They do not have to match the functional interface's functional method
* because the lambda expression as a whole is what matches the interface's functional method.
    *
    * */
}
