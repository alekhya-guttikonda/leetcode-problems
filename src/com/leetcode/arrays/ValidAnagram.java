package com.leetcode.arrays;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
       System.out.println(isAnagram("abcb", "anbc"));
    }

    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        if(s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {     
                hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0) + 1);
                hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0) + 1);   
        }

        return hm1.equals(hm2);
    }
}
