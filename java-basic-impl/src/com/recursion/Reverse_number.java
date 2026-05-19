package com.recursion;

import java.util.Scanner;
//
//public class Reverse_number {
//    static int reverse(int n){
//        //base case
//        if(n < 10){
//            return n;
//        }
//        //digit count
//        int digits = (int)Math.log10(n);
//
//        //last digit
//        int last = n % 10;
//
//        //reverse recursively
//        return last * (int)Math.pow(10, digits) + reverse(n/ 10);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(reverse(num));
//    }
//}

//============OR====================

class Reverse_number {

    static int reverse(int n) {
        int divisor = 1;

        // Find divisor manually
        while (n / divisor >= 10) {
            divisor *= 10;
        }

        return helper(n, divisor);
    }

    static int helper(int n, int divisor) {

        // Base case
        if (n < 10)
            return n;

        int last = n % 10;
        int first = n / divisor;
        int middle = (n % divisor) / 10;

        return last * divisor
                + reverse(middle) * 10
                + first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }
}