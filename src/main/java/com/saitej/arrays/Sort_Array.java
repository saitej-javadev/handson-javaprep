package com.saitej.arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] a = {3, 4, 4, 5, 2, 3, 12, 15, 8, 6, 5, 7, 10, 12, 15, 6, 8};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {          //compare outer loop object with inner loop
                    int tmp = a[i];               // if greater than swapping.
                    a[i] = a[j];            // Swaping code here.
                    a[j] = tmp;

                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

}