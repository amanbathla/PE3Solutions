package com.stackroute;

import java.util.Date;

//Write a java program to calculate first and last date of a week.
//Output:
//First Date of Week: Mon 24/07/2017
//Last date of the week: Sun 30/07/2017

public class FirstAndLAstDayOfWeek {

    //Function to find first and last day of the week

 public  String findLastDate(int dd,int mm,int yyyy){

     int lastDay = dd + 6;
     int month = mm;
     int year = yyyy;

     if(lastDay > 30)
         lastDay = lastDay - 30;     //calculating lastDay if lastDay is on next month

     if(lastDay < 7){                // calculating month if lastDay is on next year
         month++;
         if (month > 12)
             month = month - 12;
     }

     if(month < mm)                  // checking if lastDay is on next year then increasing year
         year++;

     return "SUN "+lastDay+"/"+month+"/"+year;
 }

}
