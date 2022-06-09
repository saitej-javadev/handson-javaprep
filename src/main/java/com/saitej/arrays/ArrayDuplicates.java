package com.saitej.arrays;


import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 3, 4, 1, 1};

        // Using Arrays.stream.distinct() method
       /* int [] arr = Arrays.stream(a).distinct().sorted().toArray();
        for (int i:arr) {
            System.out.print(i + " ");
        }*/

        int j = 0;
        int n = a.length - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[n];
        j++;
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");

        }
    }
}

