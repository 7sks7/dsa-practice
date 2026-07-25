package com.example.dsapractice.arrays;

import java.util.Arrays;

public class LeftRotateTheArrayByOne {
    public static void main(String[] args) {
        rotateArrayOptimal(new int[]{1, 2, 3, 4, 5});
    }

    private static void rotateArrayBruteForce(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=1; i<arr.length; i++){
            newArr[i-1] = arr[i];
        }
        newArr[arr.length-1] = arr[0];
        System.out.println(Arrays.toString(newArr));
    }

    private static void rotateArrayOptimal(int[] arr){
        int ele = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = ele;
        System.out.println(Arrays.toString(arr));
    }
}
