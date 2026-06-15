package com.array;

import java.sql.SQLOutput;

public class ArayInsertionDSA {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 98, 43};

        int indexpos = 2;
        int element = 100;

        //creating new array
        int[] newArray = new int[arr.length + 1];

//copy pasting in new array
        for (int i = 0; i < indexpos; i++) {
            newArray[i] = arr[i];
        }
//inserting
        newArray[indexpos] = element;

        //traverse
        for (int a : newArray) {
            System.out.println(a);
        }

        //copy rest element
        for(int i = indexpos; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        for (int ar : newArray)
        {
            System.out.println(ar);
        }
    }
}

