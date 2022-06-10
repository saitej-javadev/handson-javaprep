package com.saitej.practise.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IntStream {

    public static void main(String[] args) {

        Consumer<Integer> print = System.out::println;

        List<Integer> intList = Arrays.asList(3, 4, 2, 6, 7, 4, 9, 8, 5, 11, 13, 15);

        // second highest in the list
        //   intList.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().ifPresent(print);

        // print top 3
        //  intList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(print);

        // print bottom 3
        //  intList.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(print);

        //   intList.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(print); // max number in list

       /* System.out.println("Max: " +
                intList.stream().mapToInt(Integer::intValue).max().getAsInt()   // max
        );*/

        //  intList.stream().filter(i->i%2==0).sorted().forEach(print); // even numbers in list


        //   intList.stream().filter(i->i%2!=0).sorted().forEach(print);// odd numbers in list


       /* intList.stream()
                .sorted(Comparator.comparingInt(Integer::intValue)
                        .reversed()).forEach(i-> System.out.print(i+" "));// descending order*/


     /*   System.out.println("Sum: "  +
                intList.stream().mapToInt(Integer::intValue).sum()
        ); // sum
*/


      /*  IntSummaryStatistics collect = intList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("collect = " + collect);*/


        /*double asDouble = intList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("asDouble = " + asDouble);   // average*/


        //  intList.stream().limit(5).sorted().forEach(print); //  limit

        //  intList.stream().filter(i->i%2==0).map(j->j*2).forEach(print);  // multiply with 2 for even numbers

    }
}
