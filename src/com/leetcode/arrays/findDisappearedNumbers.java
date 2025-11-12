package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4, 6, 5, 9};
        findMissingNumbers(nums);
    }

    public static void findMissingNumbers(int[] nums) {
        
    
        HashSet<Integer> set = new HashSet<>();
        ArrayList list = new ArrayList<>();

        for (Integer integer : nums) {
            set.add(integer);   
        }

        
for (int i = 1; i <= nums.length; i++) {
    if (!set.contains(i)) {
        list.add(i);
    }
}
    System.out.println(list);

    }
}
