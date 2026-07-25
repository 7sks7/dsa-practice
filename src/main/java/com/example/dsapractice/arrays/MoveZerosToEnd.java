package com.example.dsapractice.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        moveZerosToFirstBruteForce(new int[]{1 ,0 ,2 ,3 ,0 ,4 ,0 ,1});
    }

    private static void moveZerosToFirstBruteForce(int[] arr){
        int index = arr.length-1;

        //move all the non-zero elements backward
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                arr[index--] = arr[i];
            }
        }

        //Fill the remaining with zeros
        while(index >= 0){
            arr[index--] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToFirstOptimal(int[] arr){
        int index = arr.length-1;
        for(int i= arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEndBruteForce(int[] arr){
        int index = 0;

        //move all the non-zero elements forward
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }

        //Fill the remaining with zeros
        while(index < arr.length){
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEndOptimal(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
