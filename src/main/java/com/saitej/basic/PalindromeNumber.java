package com.saitej.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num =121;
        int r=0,sum=0,temp;
        temp = num;

        while(num>0){
            r = num%10;
            sum = r+sum*10;
            num = num/10;
        }

        System.out.println(temp==sum?"Palindrome":"not a palindrome");
    }
}
