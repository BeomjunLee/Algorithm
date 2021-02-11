package com.company.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    static int data[] = new int[200];

    //피보나치 수열
    public static int fibonacci(int n) {
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        data[n] =  fibonacci(n - 1) + fibonacci(n - 2);
        return data[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("입력하세요: ");
        n = scan.nextInt();
        System.out.println(n+"번째의 수는 : " + fibonacci(n) % 10009);
        Arrays.stream(data).iterator();


    }
}
