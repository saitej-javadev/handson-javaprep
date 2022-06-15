package com.saitej.basic;

 interface ATM{
    public void transfer();
}

class SBI implements ATM{

    @Override
    public void transfer() {
        System.out.println("Money transferred from SBI");
    }
}

class PNB implements ATM{

    @Override
    public void transfer() {
        System.out.println("Money transferred from PNB");
    }
}

class Canara implements ATM{

    @Override
    public void transfer() {
        System.out.println("Money transferred from Canara");
    }
}


public class Test_MethodOverriding{
    public static void main(String[] args) {
        ATM atm = new SBI();
        atm.transfer();
    }
}
