package com.saitej.basic;

public class SumInString {

    public static void main(String[] args) {
        String str = "232#@343$#$#4";
        int sum =0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                sum = sum + Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println(sum);
    }
}
