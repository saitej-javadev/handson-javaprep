package com.saitej.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSecondHighest{
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 13, 10, 9, 15, 32, 23);
        Collections.sort(integers);
      //  System.out.println(integers.get(integers.size() - 2));

        integers.stream().forEach(i-> System.out.print(i+", "));
        integers.sort(Comparator.comparing(Integer::intValue).reversed());
        System.out.println("\nDecending order");
        integers.stream().forEach(i-> System.out.print(i+", "));

    }
}
