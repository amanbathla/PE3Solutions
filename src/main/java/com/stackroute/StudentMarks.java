package com.stackroute;

import java.io.*;
import java.util.Scanner;

//Create a class called StudentMarks, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//grades of each of the students and saves them in an int array called stuGrades. Your program shall
//check that the grade is between 0 and 100 else has to trow an error message.

public class StudentMarks {


    //Boolean function to check if the grade is in integer or not

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
           int checkGrade = Integer.parseInt(s);

             if(checkGrade > 100 || checkGrade < 0){
               return false;
              }
             else{
                 return true;
             }


        } catch(NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false

    }
}
