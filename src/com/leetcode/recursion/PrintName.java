 package com.leetcode.recursion;

public class PrintName {

    public static void main(String[] args) {

        
        printNameNTimes("leo" , 0, 5);
        print1toN(5, 1);
    }

    public static void printNameNTimes(String name, int i, int count) {
       
       if(i == count) {
           return; 
       } else {
         System.out.println(name);
            i++;
            printNameNTimes(name, i, count);
       }
    }

    public static void print1toN(int n, int count) {
        if(count > n) {
            return;
        } else {
            System.out.println(count);
            count = count+1;
            print1toN(n, count);
        }
    }
}