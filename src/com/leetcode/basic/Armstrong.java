package com.leetcode.basic;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int armstrong = 0;
        while(num > 0) {
            int digit = num % 10;
            armstrong = (int) (armstrong + Math.pow(digit, 3));
            num = num/10;

        }
        System.out.println(armstrong);

        
    }

}
