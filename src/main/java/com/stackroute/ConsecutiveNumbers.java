package com.stackroute;

//Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//assume the digits are a string and use split()
//Input: 98,96,95,94,93
//Output: 98,96,95,94,93 non consecutive numbers
//Input: 54,53,52,51,50,49,48
//Output : 54,53,52,51,50,49,48 are consecutive numbers
//Input: 1,2,3,4,5,6,6
//Output: 1,2,3,4,5,6,6 non consecutive numbers

public class ConsecutiveNumbers {



    //Functionn for consecutive numbers

    public Boolean consecutiveNumbers(String numbers){
        boolean consecutive = false, increase = false ,decrease = false;
        String[] num = numbers.split(" ");
        if(Integer.valueOf(num[0]) > Integer.valueOf(num[1]))
            decrease = true;
        if(Integer.valueOf(num[0]) < Integer.valueOf(num[1]))
            increase = true;

        for (int i=0; i<num.length - 1; i++){

            if((Integer.valueOf(num[i]) != Integer.valueOf(num[i+1]) + 1) && decrease){
                consecutive = false;
                break;
            }
            if((Integer.valueOf(num[i]) != Integer.valueOf(num[i+1]) - 1) && increase){
                consecutive = false;
                break;
            }
            else
                consecutive = true;
        }
        return consecutive;
    }
}
