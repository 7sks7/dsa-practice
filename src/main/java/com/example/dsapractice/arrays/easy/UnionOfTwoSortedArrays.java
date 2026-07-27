package com.example.dsapractice.arrays.easy;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};
        unionOptimal(arr1, arr2);
    }

    private static void unionBruteforceMap(int[] arr1, int[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;

        List<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for(int i=0;i<length1;i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
        }
        for(int i=0;i<length2;i++){
            freq.put(arr2[i], freq.getOrDefault(arr1[i], 0)+1);
        }
        for(int key: freq.keySet()){
            list.add(key);
        }
        System.out.println(list);
    }

    private static void unionBruteforceSet(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }

    private static void unionOptimal(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;

        while (left< arr1.length && right<arr2.length){
            if(arr1[left]<arr2[right]){
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[left]){
                    list.add(arr1[left]);
                }
                left++;
            }else if(arr1[left]>arr2[right]){
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[right]){
                    list.add(arr2[right]);
                }
                right++;
            }else{
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[left]) {
                    list.add(arr1[left]);
                }
                left++;
                right++;
            }
        }

        while (left<arr1.length){
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[left]) {
                list.add(arr1[left]);
            }
            left++;
        }

        while (right<arr2.length){
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[right]) {
                list.add(arr2[right]);
            }
            right++;
        }

        System.out.println(list);
    }
}
