package com.example.dsapractice.sorting.part1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(new int[]{5, 4, 1, 3, 2});
    }

    private static void bubbleSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
        boolean isSorted = true;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }

            if(isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
