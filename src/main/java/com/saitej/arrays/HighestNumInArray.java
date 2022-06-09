package com.saitej.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class HighestNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,51,2,9,4,6};
        int max = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i]>max)
            {
                max= arr[i];
            }

        }
        System.out.println(max);

      /*  int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("max = " + max);
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("min = " + min);*/
       
    

    }
}
