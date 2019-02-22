package com.stackroute;



//Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//words in console
//Input:
//India
//United States
//Germany
//Egypt
//czechoslovakia
//Output:
//Place Name without Vowels:0 Ind
//Place Name without Vowels:1 Untd Stts

public class RemoveVowels {

    //Remove vowels from the String

    public String[] stringwithoutvowels(String arr[]){
        String[] resultString = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            resultString[i] = arr[i].replaceAll("[aeiou]", "");
        }
        return resultString;
    }
}
