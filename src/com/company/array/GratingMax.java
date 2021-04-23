package com.company.array;

import java.util.Scanner;

public class GratingMax {
    /**
     * 설명
     * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
     * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
     *
     * 입력
     * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     *
     * 출력
     * 최대합을 출력합니다.
     *
     * 예시 입력 1
     * 5
     * 10 13 10 12 15
     * 12 39 30 23 11
     * 11 25 50 53 15
     * 19 27 29 37 27
     * 19 13 30 13 19
     * 예시 출력 1
     * 155
     */
    public static int solution(int num, int[][] arr) {
        int sum = 0;
        int sum2 = 0;
        int max = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum);
            max = Math.max(max, sum2);
            sum = 0;
            sum2 = 0;
        }

        int j = num - 1;
        for (int i = 0; i < num; i++) {
            sum += arr[i][i];
            if(j >= 0) {
                sum2 += arr[i][j];
            }
            j--;
        }
        max = Math.max(max, sum);
        max = Math.max(max, sum2);

        return max;
    }
    //0 4, 1 3, 2 2, 3 1, 4 0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int result = solution(num, arr);
        System.out.print(result);
    }
}
