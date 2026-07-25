package com.example.dsapractice.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(findSecondSmallest(new int[]{1, 2, 3, 4, 5}));
    }
    private static int findSecondLargest(int[] arr){
        if(arr.length < 2) return -1;
        int max = 0;
        int secondMax = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    private static int findSecondSmallest(int[] arr){
        if(arr.length < 2) return -1;
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<small){
                secondSmall = small;
                small = arr[i];
            }
            else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
}
