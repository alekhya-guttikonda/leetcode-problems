package com.leetcode.arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {7,1,2,3,5};
       System.out.println(getmissingNumber(nums)); 
    }

    public static int getmissingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i : nums) {
            if(nums[i+1] != nums[i] +1){
                return nums[i] +1;
            }
        }
return 0;
    }
}
