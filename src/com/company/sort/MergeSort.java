package com.company.sort;

import java.util.Arrays;

public class MergeSort {

//    public static void mergeSort(int[] arr) {
//        int[] sort = new int[arr.length];
//        mergeSort(arr, sort, 0, arr.length - 1);
//    }
//
//    public static void mergeSort(int[] arr, int[] sort, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(arr, sort, left, mid);
//            mergeSort(arr, sort, mid + 1, right);
//            merge(arr, sort, left, mid, right);
//        }
//    }
//
//    public static void merge(int[] arr, int[] sort, int left, int mid, int right) {
//        int part1 = left;
//        int part2 = mid + 1;
//        int index = left;
//
//        for (int i = left; i <= right ; i++) {
//            sort[i] = arr[i];
//        }
//
//        while (part1 <= mid && part2 <= right) {
//            if (sort[part1] < sort[part2]) {
//                arr[index] = sort[part1];
//                part1++;
//            } else {
//                arr[index] = sort[part2];
//                part2++;
//            }
//            index++;
//        }
//
//        if (part1 > mid) {
//            for (int i = part2; i <= right; i++) {
//                arr[index] = sort[part2];
//                index++;
//            }
//        }else{
//            for (int i = part1; i <= mid ; i++) {
//                arr[index] = sort[part1];
//                index++;
//            }
//        }
//    }

    public static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];

        mergeSort(arr, tmp, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid + 1, right);

            merge(arr, tmp, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] tmp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tmp[i] = arr[i];
        }

        int part1 = left;
        int part2 = mid + 1;
        int index = left;

        while (part1 <= mid && part2 <= right) {
            if (tmp[part1] < tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        if (part1 > mid) {
            for (int i = part2; i <= right; i++) {
                arr[index] = tmp[part2];
                index++;
            }
        } else {
            for (int i = part1; i <= mid; i++) {
                arr[index] = tmp[part1];
                index++;
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 5, 8, 2, 6, 3};
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
        System.out.println("");
        mergeSort(arr);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}
