package com.company.recursion;

import java.util.Scanner;

/**
 * 시작수(a)와 마지막 수(b)가 입력되면
 *
 * a부터 b까지의 모든 홀수를 출력하시오.
 *
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 */
public class FindOdd {
    
    //a부터 b까지 홀수 찾기
    public static void printOdd(int a, int b) {
        if(a > b) return;
        if(a % 2 == 1) System.out.println(a);   //2로 나누었을 때 1이면 홀수
        printOdd(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 수를 입력하세요 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        printOdd(a, b);
    }
}
