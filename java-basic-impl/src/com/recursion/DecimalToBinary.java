package com.recursion;

public class DecimalToBinary {
    static void binary(int n){

        if(n == 0) return ;

        binary(n / 2);
        System.out.println(n % 2);
    }
    public static void main(String[] args){
        binary(10);
    }
}
