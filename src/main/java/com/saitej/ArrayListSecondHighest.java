package com.saitej;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSecondHighest{
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 13, 10, 9, 15, 32, 23);
        Collections.sort(integers);
        System.out.println(integers.get(integers.size() - 2));
    }
}
