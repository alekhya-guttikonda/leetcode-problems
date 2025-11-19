package com.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*

* Get the indices from an array
* which matches the target where target is
* sum of two values in an array
* */
public class TwoSum {
    public static void main(String[] args) {
        int target = 18;
        int[] nums = {2, 7, 11, 15};
      //  System.out.println(Arrays.toString(getIndices(nums, target)));
                System.out.println(Arrays.toString(getIndicesPair(nums, target)));

        
    }

    public static int[] getIndices(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[j] + nums[i]) {
                    indices[0] = i;
                    indices[1] = j;

                }
            }
        }
        return indices;
    }

    public static int[] getIndicesPair(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
           
            if (hm.containsKey(target - nums[i])) {
                return new int[] { hm.get(target - nums[i]), i };
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    } 
}
