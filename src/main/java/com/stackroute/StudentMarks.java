package com.stackroute;

import java.io.*;
import java.util.Scanner;

public class StudentMarks {


    public Boolean isGradeCorrect(String[] arrGrades,int noOfStudents){

        Boolean isgradeCorrect = false;

     int finalGrades[] = new int[noOfStudents];

        if(arrGrades.length != noOfStudents){
            return null;
        }
        for(int i= 0;i<arrGrades.length;i++){
            if(!isInteger(arrGrades[i])){
               isgradeCorrect = false;
            }
            else{
                isgradeCorrect = true;
            }

        }
       return isgradeCorrect;
    }

//check for an integer
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
