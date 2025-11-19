package com.leetcode.arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] values = {"flower", "flow", "flight"};
        System.out.println(findPrefix(values));
    }

    public static String findLongestCommonPrefix(String[] values) {

        String prefix = values[0];

        for (int i = 0; i < values.length; i++) {
            //for each string compare prefix if it is equal return it else reduce the prefix
            while (values[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                 if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;

    }

    public static String findPrefix(String[] values) {

        for (int i = 0; i < values.length; i++) {
            for (String string : values) {
                if(i == string.length() || string.charAt(i) != values[0].charAt(i)) {
                    return string.substring(0, i);
                }
            }
        }

        return values[0];

    }


}
