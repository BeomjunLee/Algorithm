package com.company.recursion;

import java.util.Scanner;

/**
 * 1. 정부 1부터 n까지 출력하는 재귀함수를 설계하시오.
 * 2. 정수 n부터 1까지 출력하는 재귀함수를 설계하시오.
 *
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 */
public class OneToN {

    //1 ~ n 까지 출력
    // 1, 2, 3, 4, 5 ....   n까지 출력
    static int i = 1;
    public static void printOneToN(int n) {
        System.out.println(i);
        i++;
        if(n == 1) return;
        printOneToN(n - 1);
    }
    
    //n ~ 1 까지 출력
    public static void printNtoOne(int n) {
        System.out.println(n);
        if(n == 1) return;
        printNtoOne(n - 1);
    }

    //1 ~ n 까지 합
    public static int sum(int n) {
        if(n == 1) return 1;
        return n + sum(n - 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        int n = scan.nextInt();
        printNtoOne(n);
        System.out.println("=======");
        printOneToN(n);
        System.out.println("=======");
        System.out.println(n+"까지의 합:"+sum(n));
    }
}
