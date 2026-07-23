package com.example.dsapractice.basichashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        countFrequencyOptimal(new int[]{10,5,10,15,10,5});
    }

    private static void countFrequency(int[] arr){
        boolean[] isVisited = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(isVisited[i]) continue;
            int count = 1;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    private static void countFrequencyOptimal(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
