package com.leetcode.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
          int[] arr = {4, 19, 23, 1, 45, 1, 89, 45, 21, 3, 2, 1};
        sortBubbleElements(arr, 0, arr.length - 1);
    }

    public static void sortBubbleElements(int[] arr, int low, int high) {
        int n = arr.length;
        int didSwap = 0;
        for(int i = n-1; i >=0; i--) {
            for(int j=0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    didSwap = 1;
                }

            }

            if(didSwap == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
}
