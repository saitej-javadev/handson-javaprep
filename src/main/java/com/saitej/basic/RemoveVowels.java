package com.saitej.basic;

public class RemoveVowels {
    public static void main(String[] args) {
        removeVowels("Eye of the Tiger");
    }

    private static void removeVowels(String str) {
        String s = str.replaceAll("[aeiou]", "");
        System.out.println("s = " + s);

    }
}

