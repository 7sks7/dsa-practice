package com.example.dsapractice.arrays.easy;

public class CountMaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        System.out.println(countMaxConsecutive(prices));
    }

    private static int countMaxConsecutive(int[] arr){
        if(arr.length == 0) return -1;
        if(arr.length == 1) return 1;
        int maxCount = 0;
        int count = 0;
        for(int i:arr){
            if(i == 1){
                count++;
            }else{
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
