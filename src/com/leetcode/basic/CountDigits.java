package com.leetcode.basic;

public class CountDigits {
    public static void main(String[] args) {
        long n = 123344;

        int count = 0;

        while(n > 0) {
            n = n/10;
            count++;
        }

        System.out.println(count);
    }

}
