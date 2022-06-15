package com.saitej.basic;

public class Inheritance {
    String str = "Java";
    public void code(){
        System.out.println("Inheritance.code");
    }
}

class Driver extends  Inheritance{
    public static void main(String[] args) {
      Driver driver = new Driver();
      driver.code();
        System.out.println(driver.str);
    }
}
