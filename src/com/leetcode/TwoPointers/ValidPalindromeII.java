package com.leetcode.TwoPointers;

import java.util.Arrays;

public class ValidPalindromeII {
    public static void main(String[] args) {

int[] nums = {-4,-1,0,3,10};
        int[] numSq = new int[nums.length];
        int count = 0;
        for(int num: nums) {


           numSq[count] = num*num;
           count++;
        }
        System.out.println(Arrays.toString(numSq));

    }

    
}
