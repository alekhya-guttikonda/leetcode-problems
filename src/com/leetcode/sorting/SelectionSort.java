package com.leetcode.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 19, 23, 1, 45};
        sortElements(arr);
    }

    public static void sortElements(int[] arr) {

        for(int i=0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i; j < arr.length - 1; j++) {
               
                if(arr[j] < arr[min]) {
                  min = j;
                }
            }
       
            swap(arr,i, min);
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int[] arr, int i, int j) {
         var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }

}
