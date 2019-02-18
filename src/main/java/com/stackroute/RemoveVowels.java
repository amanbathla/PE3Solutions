package com.stackroute;

public class RemoveVowels {

    public String[] stringwithoutvowels(String arr[]){
        String[] resultString = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            resultString[i] = arr[i].replaceAll("[aeiou]", "");
        }
        return resultString;
    }
}
