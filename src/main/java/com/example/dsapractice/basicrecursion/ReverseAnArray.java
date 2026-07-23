package com.example.dsapractice.basicrecursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        reverse(arr, length-1);
    }

    private static void reverse(int[] arr, int length){
        if(length <= arr.length/2) return;

        int temp = arr[length];
        arr[length] = arr[arr.length-1-length];
        arr[arr.length - 1 - length] = temp;
        reverse(arr, length-1);
        System.out.println(Arrays.toString(arr));
    }
}
