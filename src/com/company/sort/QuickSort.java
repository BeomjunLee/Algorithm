package com.company.sort;

import java.util.Arrays;

public class QuickSort {

//    public static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int pivot = partition(arr, left, right);
//
//            quickSort(arr, left, pivot - 1);
//            quickSort(arr, pivot + 1, right);
//        }
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int pivot = arr[right];
//        int i = left - 1;
//
//        for (int j = left; j < right; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, right);
//        return i + 1;
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }


    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 5, 8, 2, 6, 3};
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
        System.out.println("");
        quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}
