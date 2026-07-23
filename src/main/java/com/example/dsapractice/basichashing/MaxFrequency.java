package com.example.dsapractice.basichashing;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        System.out.println(maxFrequencyOptimal(new int[]{10,5,10,15,10,5}));
    }

    private static int maxFrequency(int[] arr){
        int maxFreq = 0;
        int maxFreqEle = arr[0];
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
            if(count>maxFreq) {
                maxFreq = count;
                maxFreqEle = arr[i];
            }
        }
        return maxFreqEle;
    }

    private static int maxFrequencyOptimal(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int maxFreq = 0;
        int maxFreqEle = arr[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxFreqEle = entry.getKey();
            }
        }
        return maxFreqEle;
    }
}
