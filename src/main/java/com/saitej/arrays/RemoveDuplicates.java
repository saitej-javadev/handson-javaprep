package com.saitej.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {3, 4, 4, 5, 2, 3, 12, 15, 8, 6, 5, 7, 10, 12, 15, 6, 8};
        int n = a.length - 1;
        Arrays.sort(a);
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[n];
       // j++;
        for (int i = 0; i < j+1; i++) {
            System.out.print(a[i] + " ");
        }
       /* System.out.println();
        // Using Hashset class
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(a[i]);
        }

        System.out.println(hs);*/
    }


}


