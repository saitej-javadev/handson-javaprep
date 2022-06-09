package com.saitej.practise.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "joe", 2000),
                new Employee(854, "lee", 4000),
                new Employee(352, "bob", 1000),
                new Employee(100, "sam", 5000)
        );


        System.out.println("Before sorting...........................");



        //Type: 1 (Using Anonymous class )

      /*  Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getId()<e2.getId()){
                    return -1;
                }else if (e1.getId()>e2.getId())
                    return 1;
                return 0;
            }
        });*/

        //Type: 2 (Using new Comparator class )


      //  Collections.sort(empList,new SalComparator());


        //Type: 3 using Lambda expression

      //Collections.sort(empList,(o1, o2) -> o1.getName().compareTo(o2.getName()));// ascending order
      //  Collections.sort(empList,(o1, o2) -> o2.getName().compareTo(o1.getName()));


        //Type: 4 using Comparator.comparing()
    //  Collections.sort(empList,Comparator.comparing(Employee::getName));

   //     empList.sort(Comparator.comparing(employee -> employee.getId()));

     //   empList.sort(Comparator.comparing(Employee::getSal));

      //  empList.sort(new SalComparator());

        empList.sort((o1, o2) -> o1.getSal()<o2.getSal()?1:o1.getSal()>o2.getSal()?-1:0);












        empList.forEach(System.out::println);
        System.out.println("After sorting...........................");
        empList.forEach(System.out::println);

    }
}
