package com.recursion;

//print 1 to 5
public class Print {
    public static void main(String[] args) {
        Print(1);
    }

    static void Print(int n) {
        //base condition
        if (n == 6) {
            return;
        }
        System.out.println("Print  " + n);
        Print(n + 1);
    }
}

