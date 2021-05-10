package com.company.twoPointers;

import java.util.Scanner;

public class CombineArrays {
    /**
     * 1. 두 배열 합치기
     * 설명
     * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
     * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
     * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
     * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
     *
     * 출력
     * 오름차순으로 정렬된 배열을 출력합니다.
     *
     * 예시 입력 1
     * 3
     * 1 3 5
     * 5
     * 2 3 6 7 9
     * 예시 출력 1
     * 1 2 3 3 5 6 7 9
     */

    public static int[] solution(int num1, int[] arr1, int num2, int[] arr2) {
        int[] result = new int[num1 + num2];
        int p1 = 0;
        int p2 = 0;
        int i = 0;

        while (p1 < num1 && p2 < num2) {
            if (arr1[p1] < arr2[p2]) {
                result[i] = arr1[p1];
                p1++;
            }else{
                result[i] = arr2[p2];
                p2++;
            }
            i++;
        }
        if (p1 >= num1) {
            for (int j = p2; j < num2; j++) {
                result[i] = arr2[j];
                i++;
            }
        }else{
            for (int j = p1; j < num1; j++) {
                result[i] = arr1[j];
                i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = scan.nextInt();
        }

        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = scan.nextInt();
        }

        int[] result = solution(num1, arr1, num2, arr2);
        for (int i : result) {
        System.out.print(i + " ");
        }
    }
}
