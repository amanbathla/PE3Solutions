package com.stackroute;

import java.util.Scanner;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

//Write a program that will generate exceptions of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.

public class GenerateExceptions {

    //Function to Generate exceptions

    public static  void main(String args[]){


        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();

        System.out.println(items.stream()
                .filter( item -> item.startsWith("o"))
                .count());

items.stream().filter(item -> item.endsWith("e")).collect(Collectors.joining());

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
