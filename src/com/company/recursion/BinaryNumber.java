package com.company.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
