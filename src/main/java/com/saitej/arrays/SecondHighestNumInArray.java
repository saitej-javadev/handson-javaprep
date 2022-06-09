package com.saitej.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondHighestNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,51,2,9,41,6};

        Arrays.sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");

        }

        int arrLength = arr.length;
        System.out.println("\n" + arr[arrLength-2]);
    }
}
