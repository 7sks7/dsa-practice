package com.example.dsapractice.arrays;

public class LinearSerach {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1, 2, 3, 4, 5}, 7));
    }

    private static int linearSearch(int[] arr, int target){
        if(arr.length== 0) return 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
