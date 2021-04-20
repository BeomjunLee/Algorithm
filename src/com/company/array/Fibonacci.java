package com.company.array;

import java.util.Scanner;

public class Fibonacci {
    /**
     * 설명
     * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     *
     * 입력
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     *
     * 출력
     * 첫 줄에 피보나치 수열을 출력합니다.
     *
     * 예시 입력 1
     * 10
     *
     * 예시 출력 1
     * 1 1 2 3 5 8 13 21 34 55
     */
    public static int[] solution(int num) {
        int[] result = new int[num];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < num; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] result = solution(num);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
