package com.saitej.basic;

public class CountCharsInString {
    public static void main(String[] args) {
      String str= "AAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaBBBBBBBBBBBBBBBBBBBBBBBBBbbbbbbbbbbbb";
        long counta = str.chars().filter(value -> value == 'a').count();
        long countA = str.chars().filter(value -> value == 'A').count();
        long countB = str.chars().filter(value -> value == 'B').count();

        System.out.println("counta = " + counta);
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);


    }

}

