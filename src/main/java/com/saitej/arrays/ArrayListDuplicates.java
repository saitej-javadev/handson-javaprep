package com.saitej.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDuplicates {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 4, 5, 3, 7, 7, 5, 4, 3, 9, 7, 3, 2);
        // using distinct() method
       /* List<Integer> collect = integerList.stream().distinct().collect(Collectors.toList());
        System.out.print(collect);*/


       //using Collections.toSet() method
       /* Set<Integer> collect = integerList.stream().collect(Collectors.toSet());
        System.out.println(collect);*/

       //using Set class
       /* HashSet<Object> hs = new HashSet<>(integerList);
        System.out.println(hs);*/


       //using new arrayList
        ArrayList<Object> newList = new ArrayList<>();
        for (int list:integerList){
            if(!newList.contains(list)){
               newList.add(list);
            }
        }
        System.out.println(newList);

    }
}
