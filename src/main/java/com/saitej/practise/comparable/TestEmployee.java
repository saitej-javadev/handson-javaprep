package com.saitej.practise.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "joe", 2000),
                new Employee(854, "lee", 4000),
                new Employee(352, "bob", 1000),
                new Employee( 100,"sam", 5000)
        );


        System.out.println("Before sorting...........................");
        Collections.sort(empList);
        empList.forEach(System.out::println);
        System.out.println("After sorting...........................");
        empList.forEach(System.out::println);

    }
}
