package com.stackroute;

import java.util.Scanner;

import java.io.IOException;
public class GenerateExceptions {

    public static  void main(String args[]){

        int[] arr = new int[5];

        try {
        arr[6] = 10;

        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }


        try{
            arr[-1] = 0;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        try {
            GenerateExceptions generateExceptions = null;
            generateExceptions.foo("Hello");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

    }

    public void foo(String s) {
        System.out.println(s.toLowerCase());
    }
}
