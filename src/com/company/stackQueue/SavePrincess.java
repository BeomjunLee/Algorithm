package com.company.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

    public static int solution(int n, int k) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i <= k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        result = queue.poll();
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solution(a, b));
    }
}
