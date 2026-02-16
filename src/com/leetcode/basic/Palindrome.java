package com.leetcode.basic;

public class Palindrome {

    public static void main(String[] args) {
        
        int num = 121;
        int n = num;

        int rev = 0;

        while(n > 0) {
            int digit = n%10;
            rev = rev *10 + digit;
            n = n/10;
        }

        if(num == rev)
        System.out.println(true + "" + num + " " + rev);
        else 
        System.out.println(num + " " + rev);
    }

}
