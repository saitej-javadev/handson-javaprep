package com.saitej.basic;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Java Programming";
        // using rev variable
       /* String rev = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            rev = rev+str.charAt(i);
        }

        System.out.println("The reverse of a string : " + rev);*/


        //using for loop
      /*  for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i) + "");
        }*/


        //using StringBuffer class
        /*  System.out.println(new StringBuffer(str).reverse());*/

        // using StringBuilder class
        /*   System.out.println(new StringBuilder(str).reverse());*/

        // using toCharArray() method class
     /*   char[] chars = str.toCharArray();

        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]+ "");

        }*/

        // using split method
        String[] split = str.split("");

        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i] + "");

        }

    }
}
