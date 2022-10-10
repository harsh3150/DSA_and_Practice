package com.harsh.DSA_and_Practice.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Before sorting:");
        int arr[] = {4, 5, 9, 12, 9, 22, 45, 7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int []arr){

        for(int i = 0; i<arr.length; i++){

            for(int j = 1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    swap(j-1, j, arr);
                }
            }

        }
    }

    private static void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
