package com.example.dsapractice.arrays;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{1, 2, 3, 4, 5}));
    }

    private static int findLargest(int[] arr){
        if(arr.length <= 1) return -1;
        int max = 0;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
