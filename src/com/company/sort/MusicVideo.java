package com.company.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    private static int solution(int m, int[] arr) {
        int result = 0;
        int left = Arrays.stream(arr).max().getAsInt(), right = Arrays.stream(arr).sum();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isThreeDVD(arr, mid, m)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static boolean isThreeDVD(int[] arr, int mid, int m) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                count++;
                sum = arr[i];
            }else
                sum+=arr[i];
        }
        if(count <= m)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(m, arr));
    }
}
