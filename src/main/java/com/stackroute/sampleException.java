package com.stackroute;

import java.io.IOException;
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
