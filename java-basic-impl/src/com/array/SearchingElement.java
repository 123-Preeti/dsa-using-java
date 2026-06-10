package com.array;

public class SearchingElement {

    public static void main(String[] args) {

        int a[] = {12, 34, 56, 7, 89, 4};

        int i = searchIndex(a, 56);

        if (i == -1) {
            System.out.println("value dne");
        } else {
            System.out.println(i);
        }
    }

    public static int searchIndex(int a[], int val) {

        if (a.length == 0) {
            return -1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                return i;
            }
        }

        return -1;
    }
}