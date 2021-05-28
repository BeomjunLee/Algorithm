package com.company.sort;

import java.util.Scanner;

public class BubbleSort {

    public static int[] solution(int[] arr) {
        int length = arr.length;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < length; i++) {
                if(i + 1 == length)
                    break;
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
            length--;
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
