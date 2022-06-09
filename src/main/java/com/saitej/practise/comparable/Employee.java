package com.saitej.practise.comparable;

import java.util.Comparator;

public class Employee  implements Comparable<Employee> {

    private int id;
    private String name;
    private double sal;

    public Employee() {
    }

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }


    @Override
    public int compareTo(Employee emp) {

        //  Type: 1 (using traditional)

      /*  if (this.getId()<emp.getId()){
            return -1;
        }else if (this.getId()>emp.getId())
            return 1;
        return 0;*/                      // ascending order

       /* if (this.getId()<emp.getId()){
            return 1;
        }else if (this.getId()>emp.getId())
            return -1;
        return 0;                   // descending order
    }*/

        //  Type: 2 ( using conditional Operator)

       // return this.getSal() < emp.getSal() ? 1 : this.getSal() > emp.getSal() ? -1 : 0; // descending order
       // return this.getSal() < emp.getSal() ? -1 : this.getSal() > emp.getSal() ? 1 : 0;  // ascending order


        //  Type: 3 (using Integer.compare(int x ,int y) method)


     //   return Integer.compare(this.getId(),emp.getId()); // ascending order  // only for int
      //  return Integer.compare(emp.getId(),this.getId());


        //  Type: 4 (using compareTo(String str) from String class)

      //  return this.getName().compareTo(emp.getName()); // ascending order   // only for String
        return  emp.getName().compareTo(this.getName()); // descending order



    }
}
