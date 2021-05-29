package com.company.sort;

import java.util.*;

public class LeastRecentlyUsed {

    public static Queue<Integer> solution(int s, int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (queue.contains(arr[i])) {
                queue.remove(arr[i]);
            }
            else if (queue.size() == s) {
                queue.poll();
            }
            queue.offer(arr[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Queue<Integer> queue = solution(s, arr);
        arr = new int[s];
        for (int i = s - 1; i >= 0; i--) {
            arr[i] = queue.poll();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
