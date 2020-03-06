package com.javaLearning;

public class NumberPalindrome {
    public static void main(String[] args){
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if(originalNumber == reverse) {
            return true;
        }
        return false;
    }
}