package com.saitej.basic;

public class FinalizeMethodDemo {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method is executed");
    }

    public static void main(String[] args) throws Throwable {
        FinalizeMethodDemo obj = new FinalizeMethodDemo();

        obj = null;

        System.gc();
        System.out.println("end");
    }
}
