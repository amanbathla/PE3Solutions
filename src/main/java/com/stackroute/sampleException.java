package com.stackroute;

import java.io.IOException;

//Create a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a String argument.
//b. Catch the exception inside a catch clause and print the String argument.
//c. Add a finally clause and print a message to prove you were there.

public class sampleException {

    public static  void main(String args[]){

        try{
            int num = 50/0;
        }
        catch(ArithmeticException ex){
            System.out.println("Error:Not divide by zero");

        }
        finally {
            System.out.println("This is finaly block");
        }

    }
}
