package com.saitej.basic;

public class PalindromeString {
    public static void main(String[] args) {
            String str = "tenet";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev.equals(str)?"Palindrome":"Not a Palindrome");
    }
}
