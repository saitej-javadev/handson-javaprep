package com.saitej.practise.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "joe", 2000),
                new Employee(854, "lee", 4000),
                new Employee(352, "bob", 1000),
                new Employee(102, "sam", 5000),
                new Employee(105, "ari", 3000),
                new Employee(120, "max", 6000),
                new Employee(150, "jay", 8000)
        );

        Consumer print = System.out::println;

        // (1)  make name to upper case and print all employees

          /*  empList.stream().map(
              e ->{
                  e.setName( e.getName().toUpperCase());
                  return e;
                  }
                         ).forEach(print);*/


        //(2)  make name to upper case and print names

        /* empList.stream().map(e->e.getName().toUpperCase()).forEach(print);*/

        //(3) make name to upper whose name starts with j and print the employees

        /*empList.stream().filter(e-> e.getName().startsWith("j")).map(e->{
            e.setName(e.getName().toUpperCase());
            return e;
        }).forEach(print);

                                      */
        // (4) print employees whose salary less than 5000
       /* empList.stream().filter(e->e.getSalary()<5000).forEach(print);*/


        // (5) increment salary to employees whose salary is less than 5000 and print them

    /*  empList.stream().filter(e->e.getSalary()<5000).map(e->{
          e.setSalary(e.getSalary()+2000);
          return e;
      }).forEach(print);*/

    // (6) print the maximum and minimum salary employees

        /*Employee employee = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee);*/

       /* Employee employee1 = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee1);*/


  // (7) count the total number of employees
       /* System.out.println(empList.size());
        System.out.println(empList.stream().count());*/

        // (8) count the emloyees whose salary below 5000;

       /* long count = empList.stream().filter(e -> e.getSalary() < 5000).count();
        System.out.println(count);
*/

      // (8) sort employees
    /*   empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(print); // ascending order*/

       /* empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(print); // descending order
*/


    }

}
