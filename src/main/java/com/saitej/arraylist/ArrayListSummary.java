package com.saitej.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListSummary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21, 3, 4, 3, 6, 4, 8, 9, 5, 72, 9, 8, 6, 5);

       /* System.out.println("Elements in the list: ");
        list.stream().forEach(i -> System.out.print(i + ", "));

        System.out.println("\nMax element in the list: ");
        list.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        System.out.println("\nMin element in the list: ");
        list.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        System.out.println("Ascending order: ");
        Collections.sort(list);
        list.stream().forEach(i -> System.out.print(i + ", "));

        System.out.println("\nDescending order: ");
        Collections.sort(list, Collections.reverseOrder());
        list.stream().forEach(i -> System.out.print(i + ", "));

        System.out.println("\nSecondHighest :");
        list.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .limit(2)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
*/
  //      System.out.println("Distinct elements: ");
  //      list.stream().distinct().forEach(i -> System.out.print(i + ", "));

  //      list.stream().collect(Collectors.toSet());

  /*      HashSet<Object> hs = new HashSet<>(list);
        hs.stream().forEach(i -> System.out.print(i + ", "));*/


       /* ArrayList<Integer> newList = new ArrayList<>();
        for (Integer i:list) {
            if (!newList.contains(i)){
                newList.add(i);
            }
        }

        newList.stream().forEach(i -> System.out.print(i + ", "));*/

        long count = list.stream().count();

        int sum = list.stream().mapToInt(Integer::intValue).sum();

          list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);

    }
}
