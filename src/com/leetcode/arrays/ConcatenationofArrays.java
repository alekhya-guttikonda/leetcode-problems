package com.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationofArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       
        concatArrays(nums);
    }

    public static void concatArrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*nums.length];
        int i =0;
        while( i < nums.length) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
            i++;
        }

        System.out.println(Arrays.toString(ans));

    }


}
