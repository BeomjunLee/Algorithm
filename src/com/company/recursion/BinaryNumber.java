package com.company.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
 *
 * 예)
 *
 * 10    ----->  1010
 *
 * 0    ----->  0
 *
 * 1    ----->  1
 *
 * 2    ----->  10
 *
 * 1024    ----->  10000000000
 *
 * 이 문제는 반복문을 이용하여 풀 수 없습니다.
 */
public class BinaryNumber {

    static List<Integer> arr = new ArrayList<>();   //2진수 저장할 List
    static StringBuffer sb = new StringBuffer();    //출력해주기 위해 문자열 저장

    //2진수 변환
    public static void binary(int n) {
        arr.add(n % 2);
        if(n / 2 == 0) return;
        binary(n / 2);
    }
    
    //출력
    public static void printBinary(int n) {
        if(n == 0) return;
        sb.append(arr.get(n - 1));
        printBinary(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("입력하세요: ");
        n = scan.nextInt();
        binary(n);
        printBinary(arr.size());
        System.out.println(sb);
    }
}
