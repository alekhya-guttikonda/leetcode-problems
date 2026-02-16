 package com.leetcode.recursion;

public class PrintName {

    public static void main(String[] args) {

        recursionSum(0, 3);
        // printNameNTimes("leo" , 0, 5);
        // print1toN(5, 1);
        //printNto1(5);
        //printNto1BackTrack(5, 1);
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

     public static void printNto1(int n) { 
        if(n == 0) {
            return;
        } else {
            System.out.println(n);
            n = n - 1;     
            printNto1(n);
        }
    }

    public static void print1toNBackTrack(int n, int i) {
        if(i < 1) {
            return;
        } else {   
            print1toNBackTrack(n, i-1);
            System.out.println(i);
        }
    }

    public static void printNto1BackTrack(int n, int i) { 
        if(i > n) {
            return;
        } else {
            
            printNto1BackTrack(n, i + 1);
             System.out.println(i);
        }
    }

    public static void recursionSum(int sum, int i) {
        
        if(i < 1) {
            System.out.println(sum);
            return;
        } else {
           
           recursionSum(sum + i, i-1);
           //System.out.println(sum);
        
        }
    }



}