package com.example.dsapractice.arrays;

import java.util.Arrays;

public class LeftRotateTheArrayByKplaces {
    public static void main(String[] args) {
        int[] arr = rotateOptimal(new int[]{1, 2, 3, 4, 5, 6, 7}, 2, "right");
        System.out.println(Arrays.toString(arr));
    }

    //Space Complexity: O(k)
    private static void rotateLeftBruteForce(int[] arr, int numberOfRotation){
        if(arr.length == 0 || numberOfRotation == 0) return;
        int length = arr.length;
        numberOfRotation = numberOfRotation & length;
        int[] newArray = new int[arr.length];
        int index = 0;
        for(int i=arr.length-numberOfRotation; i<arr.length; i++){
            newArray[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
        for(int i=0; i<arr.length-numberOfRotation; i++){
            newArray[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static void rotateRightBruteForce(int[] arr, int numberOfRotation){
        if(arr.length == 0 || numberOfRotation == 0) return;
        int length = arr.length;
        numberOfRotation = numberOfRotation & length;
        int[] newArray = new int[arr.length];
        int index = arr.length-numberOfRotation;
        for(int i=0; i<numberOfRotation; i++){
            newArray[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
        index = 0;
        for(int i=numberOfRotation; i<arr.length; i++){
            newArray[index++] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    //space complexity is 0(1)
    private static int[] rotateOptimal(int[] arr, int numberOfRotation, String direction){
        int length = arr.length;
        if(length == 0 || numberOfRotation == 0) return arr;
        numberOfRotation = numberOfRotation & length;
        if(direction.equals("right")){
            // Step 1: reverse entire array
            reverseArray(arr, 0, length-1);
            // Step 2: reverse first k elements
            reverseArray(arr, 0, numberOfRotation-1);
            // Step 3: reverse remaining n-k elements
            reverseArray(arr, numberOfRotation, length-1);
        }else if(direction.equals("left")){
            // Step 1: reverse first k elements
            reverseArray(arr, 0, numberOfRotation - 1);
            // Step 2: reverse remaining n-k elements
            reverseArray(arr, numberOfRotation, length - 1);
            // Step 3: reverse entire array
            reverseArray(arr, 0, length - 1);
        }
        return arr;
    }

    private static void reverseArray(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
    }
}
