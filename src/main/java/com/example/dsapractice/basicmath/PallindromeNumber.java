package com.example.dsapractice.basicmath;

public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPallindrome(4554));
    }

    private static boolean isPallindrome(int number){
        if (number < 0) {
            return false;
        }
        if (number < 10) {
            return true;
        }
        int temp = number;
        int result = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            result = result * 10 + lastDigit;
            temp /= 10;
        }
        return number == result;
    }
}
