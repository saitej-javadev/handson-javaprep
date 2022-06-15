package com.saitej.basic;

// If a class has multiple method with same name different parameters it is called method overloading

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        int integers = mo.add(2, 3);
        System.out.println("integers = " + integers);
        int integers2 = mo.add(5, 6, 7);
        System.out.println("integers2 = " + integers2);
        double doubles = mo.add(10.3, 23.3);
        String str = mo.add("Spring", "Boot");
        System.out.println("str = " + str);
    }

    public String add(String s, String s1) {
        return s.concat(s1);
    }

    public double add(double v, double v1) {
        return v + v1;
    }

    public int add(int i, int i1) {
        return i + i1;
    }

    public int add(int i, int i1, int i2) {
        return i + i1 + i2;
    }
}


class Test{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        String str = mo.add("Proxima Centauri", "Centauri");
        System.out.println("str = " + str);
    }
}
