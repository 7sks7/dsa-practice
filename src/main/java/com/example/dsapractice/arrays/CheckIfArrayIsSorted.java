package com.example.dsapractice.arrays;

public class CheckIfArrayIsSorted{
    public static void main(String[] args) {
        System.out.println(isSortedOptimal(new int[]{1, 3, 2, 4}));
    }

    private static boolean isSortedBruteforce(int[] arr){
        if(arr.length == 0 || arr.length == 1) return true;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSortedOptimal(int[] arr){
        if(arr.length == 0 || arr.length == 1) return true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
