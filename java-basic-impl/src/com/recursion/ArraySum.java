package com.recursion;

import java.util.Scanner;

public class ArraySum {
    static int sum(int[] arr, int i){

        if(i == arr.length) return 0;

        return arr[i] + sum(arr, i+1);
    }
    public static void main(String[] args){
//        int[] arr ={1,2,3,4,5,7};
//        System.out.println("sum is: " + sum( arr, 2));

        Scanner sc = new Scanner(System.in);

        //size input
        System.out.println("Enter size");
        int n = sc.nextInt();

        //array creation
    }
}
