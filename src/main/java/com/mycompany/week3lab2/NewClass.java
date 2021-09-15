package com.mycompany.week3lab2;

public class NewClass {
    
    int getArraySum(int[] arr){
        int sm=0;
        for(int i=0; i<arr.length; i++)
            sm+=arr[i];
        return sm;
    }
    
    public static void main(String[] args){
        NewClass nc = new NewClass();
        int[] b={3,6,7,1};
        int z= nc.getArraySum(b);
        System.out.println("The array sum is "+ z);
               
    }
}
