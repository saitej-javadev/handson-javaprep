package com.saitej.arrays;

public class Sort_And_RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {8, 3, 3, 7, 6, 7, 5, 1, 9, 4, 3, 6, 7, 5, 1, 1, 2, 3, 4, 5};
        // find array length
        int al = a.length;
        System.out.println("Before sorting ");
        for (int arr : a) {
            System.out.print(arr + ", ");
        }
        // sort the array
        for (int i = 0; i < al; i++) {
            for (int j = 0; j < al; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println();
        System.out.println("After sorting ");
        for (int arr : a) {
            System.out.print(arr + ", ");
        }
        System.out.println();
        System.out.println("After removing duplicates");
        int j = 0;
        for (int i = 0; i < al - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[al - 1];
        for (int i = 0; i < j + 1; i++) {
            System.out.print(a[i] + ", ");

        }
    }
}
