package com.company.twoPointers;

import java.util.Scanner;

public class MaxLengthSequenceNumber {
    /**
     * 6. 최대 길이 연속부분수열
     * 설명
     * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
     * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
     * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
     * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
     * 이며 그 길이는 8입니다.
     *
     * 입력
     * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
     * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
     *
     * 출력
     * 첫 줄에 최대 길이를 출력하세요.
     *
     * 예시 입력 1
     * 14 2
     * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
     * 예시 출력 1
     * 8
     */
    public static int solution(int num1, int num2, int[] arr) {
        int result = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < num1; right++) {
            if (arr[right] == 0)
                count++;
            while (count > num2) {
                if(arr[left] == 0) count--;
                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int[] arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr[i] = scan.nextInt();
        }

        int result = solution(num1, num2, arr);
        System.out.println(result);
    }
}
