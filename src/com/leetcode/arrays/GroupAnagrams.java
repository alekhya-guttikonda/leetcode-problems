package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
    String[] strs = {"eat","tea","tqn","ate","nat","bat"};
     ArrayList res = groupAnagrams(strs);
    System.out.println(res.toString());

    }

    public static ArrayList groupAnagrams(String[] strs) {
            
            HashMap<String, List<String>> hm  = new HashMap<>();

            for (String word: strs) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
                
                if(!hm.containsKey(sortedString)) {
                    hm.put(sortedString, new ArrayList<>());
                }
                hm.get(sortedString).add(word);
            }

        return new ArrayList<>(hm.values());
    }


}
