package com.company.array;

import java.util.Scanner;

public class BigNum {
    /**
     * 설명
     *
     * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     *
     * (첫 번째 수는 무조건 출력한다)
     *
     * 입력
     * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     *
     * 출력
     * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     *
     * 예시 입력 1
     * 6
     * 7 3 9 5 6 12
     *
     * 예시 출력 1
     * 7 9 6 12
     */
    public static String solution(int[] num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length; i++) {
            if(i == 0){
                sb.append(num[i]);
                sb.append(" ");
            }
            else if(num[i-1] < num[i]){
                sb.append(num[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        String result = solution(num);
        System.out.println(result);
    }
}
