package com.leetcode.arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 1,-1, 8};
       
        System.out.println( firstMissingPositiveNumber(nums));
    }

    public static Integer firstMissingPositiveNumber(int[] nums) {


        var missingNum = 1;

        Arrays.sort(nums);
        
         for (int num : nums) {
            if (num > 0 && missingNum == num) {
                missingNum++;
            }
        }
        return missingNum;

    }
}
