package com.company.sort;

import java.util.*;
public class BinarySearch {

    public static int solution(int[] arr, int m) {
        int result = -1;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < m) {
                left = mid + 1;
            } else if (m < arr[mid]) {
                right = mid - 1;
            }
            else
                return mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(arr, m));
    }
}
