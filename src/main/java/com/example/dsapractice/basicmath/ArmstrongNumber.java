package com.example.dsapractice.basicmath;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstring(153));
    }

    private static boolean isArmstring(int number){
        if(number>= 0 && number < 10) return true;
        int temp = number;
        int count = 0;
        int res = 0;
        while (temp != 0){
            count++;
            temp /= 10;
        }
        temp = number;
        while (temp != 0){
            int digit = temp % 10;
            int result = (int) Math.pow(digit, count);
            res += result;
            temp /= 10;
        }
        return res == number;
    }
}
