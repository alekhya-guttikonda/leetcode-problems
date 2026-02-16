package com.leetcode.TwoPointers;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }

    public static boolean isPalindrome(String str) {

        int l=0; 
        int r = str.length() -1;

        while(l<r) {
            while(l<r && !Character.isLetterOrDigit(str.charAt(l))) {
                l++;
            }
             
            while(l<r && !Character.isLetterOrDigit(str.charAt(r))) {
                r--;
            }

            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++; r--;

        }
        return true;

    }

    

}
