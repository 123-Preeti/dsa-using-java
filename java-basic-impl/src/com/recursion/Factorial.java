package com.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fact = sc.nextInt();

        int ans = factorial(fact);

        System.out.println("Factorial of " + fact + " is " + ans);
    }

    static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }
}