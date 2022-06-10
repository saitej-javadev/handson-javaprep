package com.saitej.practise.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StringStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Joe", "Jay", "", null, null, "", "Leo", "Sam", "San", "Bob", "Jack", "John", "Rocky");

        Consumer<String> print = System.out::println;

        // print strings length less than 3
        //  list.stream().filter( s->s !=null).filter(s->s.length()>3).forEach(print);

        // print strings which are not null and empty
        //  List<String> collect = list.stream().filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());
        //   System.out.println("collect = " + collect);

        //   list.stream().findAny().ifPresent(print);
        //   list.stream().findFirst().ifPresent(print);


        List<String> list1 = Arrays.asList("Joe", "Jay", "", "", "Leo", "Sam", "San", "Bob", "Jack", "John", "Rocky");

        // print string starts with J
        // list1.stream().filter(s->s.startsWith("J")).forEach(print);

        // list1.stream().sorted().forEach(print); // ascending order

        // list1.stream().sorted(Comparator.reverseOrder()).forEach(print);  // descending order

       list1.stream().map(String::toUpperCase).forEach(print);
    }
}
