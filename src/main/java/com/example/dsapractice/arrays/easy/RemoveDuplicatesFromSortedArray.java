package com.example.dsapractice.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesOptimal(new int[]{0, 0, 3, 3, 5, 6}));
    }

    //only return distinct number counts
    private static int removeDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }

        }
        return count;
    }

    private static int removeDuplicatesBruteForce(int[] arr){
        if(arr.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for(int i: arr){
            if(!set.contains(i)){
                set.add(i);
                arr[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return index;
    }

    private static int removeDuplicatesOptimal(int[] arr){
        if(arr.length==0) return 0;
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
}
