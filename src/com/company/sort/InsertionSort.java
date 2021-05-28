package com.company.sort;

import java.util.Scanner;

public class InsertionSort {

    public static int[] solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0 ; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                }else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result = solution(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
