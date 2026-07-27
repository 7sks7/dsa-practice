package com.example.dsapractice.arrays.easy;

public class FIndTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findBruteforce(arr));
    }

    private static int findBruteforce(int[] arr){
        int length = arr.length+1;
        for(int i=1; i<=length; i++){
            boolean isFound = false;
            for(int j = 0; j<length-1; j++){
                if(arr[j] == i){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                return i;
            }
        }
        return -1;
    }

    private static int findOptimal(int[] arr){
        int actualSum = 0;
        int expectedSum = 0;
        int length = arr.length+1;
        for(int i:arr){
            actualSum+=i;
        }
        expectedSum = length * (length+1)/2;

        return expectedSum-actualSum;
    }
}
