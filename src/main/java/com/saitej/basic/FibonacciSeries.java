package com.saitej.basic;

public class FibonacciSeries {

    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int count) {
         int n1=0,n2=1,n3;
        for (int j = 0; j <count ; j++) {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3 + " ");
        }
    }
}
