package com.saitej.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 10, 12, 15, 6, 8};

        Arrays.sort(arr);

        System.out.println("Second Highest: " + arr[arr.length-2]);


        Integer[] array = {3, 4, 5, 7, 10, 12, 15, 6, 8};
        Arrays.sort(array, Collections.reverseOrder());

        Arrays.stream(array).limit(2).skip(1).forEach(integer -> System.out.print("Second Highest: "+ integer+ " "));


    }
}
