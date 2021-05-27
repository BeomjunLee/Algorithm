package com.company.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class KakaoDoll {
    /**
     * 카카오 인형 뽑기
     */
    public static int solution(int[][] arr, int[] moves) {
        Stack<Integer> stack = new Stack();

        int result = 0;
        for (int i = 0; i < moves.length; i++) {
            int k = moves[i] - 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][k] != 0) {
                    if (!stack.isEmpty() && stack.peek() == arr[j][k]) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(arr[j][k]);
                    }
                    arr[j][k] = 0;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int move = scan.nextInt();
        int[] moves = new int[move];
        for (int i = 0; i < move; i++) {
            moves[i] = scan.nextInt();
        }

        int result = solution(arr, moves);
        System.out.println(result);
    }
}
