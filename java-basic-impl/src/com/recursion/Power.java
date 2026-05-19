package com.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();

        System.out.println("Enter power :");
        int pow = sc.nextInt();

        int ans = power(base, pow);
        System.out.println("Answer : " + ans);

    }

    static int power(int a, int b) {
        //base condition
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        return a * power(a, b - 1);
    }
}
