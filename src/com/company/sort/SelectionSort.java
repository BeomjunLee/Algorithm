package com.company.sort;

import java.util.Scanner;

public class SelectionSort {


    public static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index])
                    index = j;
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
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
