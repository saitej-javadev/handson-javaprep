package com.saitej.basic;

public class CountCharsInString {
    public static void main(String[] args) {
      String str= "AAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaBBBBBBBBBBBBBBBBBBBBBBBBBbbbbbbbbbbbb";
        long count = str.chars().filter(value -> value == 'a').count();
        System.out.println("count = " + count);


    }

}

