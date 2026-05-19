package com.recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("fib :" + fib(num));
    }
}
