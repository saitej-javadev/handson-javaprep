package com.saitej.strings;

public class StringDefaultMethods {
    public static void main(String[] args) {
     //   String str = "Java";
     //   System.out.println(str.charAt(0));

       String str = "Google";
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,4));
        String replace = str.replace("o", "a");
        System.out.println("replace = " + replace);
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.startsWith("go"));
        System.out.println(str.endsWith("le"));
        System.out.println(str.compareTo("Amazon"));

    }
}
