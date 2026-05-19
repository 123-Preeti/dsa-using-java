package com.recursion;

import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){

        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = gcd(num1, num2);
        System.out.println("answer: "+ ans);
    }
}
