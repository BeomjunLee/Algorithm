package com.company.sort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DuplicateCheck {

    public static String solution(int[] arr) {
        String result = "U";
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (queue.contains(arr[i])) {
                result = "D";
                return result;
            }
            queue.offer(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        String result = solution(arr);
        System.out.println(result);
    }
}
