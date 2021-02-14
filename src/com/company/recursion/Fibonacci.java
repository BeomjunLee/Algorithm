package com.company.recursion;

import java.util.Scanner;

/**
 * 피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
 *
 * 첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.
 *
 *
 *
 * 1,1,2,3,5,8,13…
 *
 *
 * 자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
 *
 * 단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.
 *
 * ※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.
 */
public class Fibonacci {

    static long data[] = new long[201];

    //피보나치 수열
    public static int fibonacci(int n) {
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    //피보나치 메모이제이션
    public static long fibonacciArr(int n) {
        if(data[n] != 0) return data[n];
        if(n == 1 || n == 2) return data[n] = 1;
        return data[n] = fibonacciArr(n - 1) + fibonacciArr(n - 2)  % 10009;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("입력하세요: ");
        n = scan.nextInt();
        System.out.println(n+"번째의 수는 : " + fibonacciArr(n) % 10009);
    }
}
