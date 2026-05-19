package com.recursion;

import java.util.Scanner;

public class Sum {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = sum(num);
        System.out.println("sum :" + ans);
    }

}


