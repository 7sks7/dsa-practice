package com.example.dsapractice.sorting.part2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            // If element <= pivot
            if(arr[j]<=pivot){
                // Increment i and swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i+1;
    }

}
