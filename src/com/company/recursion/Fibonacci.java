package com.company.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

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
