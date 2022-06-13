package com.saitej.arrays;

public class Remove_Duplicates_In_Array {

    public static void main(String[] args) {
        int [] a = {1,1,2,2,3,4,4,5};
        int[] temp = new int[a.length];
        int len = a.length-1;
        int j=0;
        for (int i = 0; i <len ; i++) {
            if (a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j] = a[len];
        j++;
        for (int i = 0; i <j ; i++) {
            System.out.print(temp[i]+ " ");

        }

    }
}
