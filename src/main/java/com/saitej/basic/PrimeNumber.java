package com.saitej.basic;

public class PrimeNumber {

    public static void main(String[] args) {
        checkPrime(32);
    }

    private static void checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime==true?"prime number":"Not a prime number");
    }
}
