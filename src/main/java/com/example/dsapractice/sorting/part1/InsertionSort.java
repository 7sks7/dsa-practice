package com.example.dsapractice.sorting.part1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(new int[]{5, 4, 1, 3, 2});
    }

    private static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key; //to insert key at correct position
        }
        System.out.println(Arrays.toString(arr));
    }

}
