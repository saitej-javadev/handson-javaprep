package com.saitej.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySummary {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 10, 12, 15, 6, 8, 8, 12, 3, 4};
        // int max = arr[0];
        int min = arr[0];
        int al = arr.length - 1;
        for (int i = 0; i < al; i++) {
          /*  if (arr[i] > max) {
                max = arr[i];
            }*/

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        //     System.out.println("Max: " + max);  // max
        //    System.out.println("min = " + min);


        //    Arrays.stream(arr).max().ifPresent(System.out::println);  // max

        //      Arrays.stream(arr).min().ifPresent(System.out::println);  // min

        //      int sum = Arrays.stream(arr).sum();
//        System.out.println("sum = " + sum);   // sum


        //      Arrays.stream(arr).average().ifPresent(System.out::println);  // average


//        long count = Arrays.stream(arr).count();
        //       System.out.println("count = " + count);// count

/*
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr).sorted().summaryStatistics();
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);*/

     //   Arrays.stream(arr).distinct().forEach(value -> System.out.print(value + " "));
     //   Arrays.sort(arr);

        //     Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // ascending


        Integer[] array = {3, 4, 5, 7, 10, 12, 15, 6, 8, 8, 12, 3, 4};

        Arrays.sort(array, Comparator.reverseOrder());


        Arrays.stream(array).forEach(i -> System.out.print(i + " "));

    }
}
