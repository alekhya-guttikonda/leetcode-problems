package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class CotainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3, 7, 1};
        isDuplicate(nums);
        System.out.println(isDuplicate(nums));
    }

    public static boolean isDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList list = new ArrayList<>();
        for (int i : nums) {
           if(hm.containsKey(i) && hm.getOrDefault(i, 1) >= 1) {
            return true;
           } else {
            hm.put(i, 1);
           }
        }
        return false;
    }
}
