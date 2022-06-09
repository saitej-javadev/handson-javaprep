package com.saitej.practise.comparator;

import java.util.Comparator;

public class SalComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.getSal()<o2.getSal()?1:o1.getSal()>o2.getSal()?-1:0;
    }
}
