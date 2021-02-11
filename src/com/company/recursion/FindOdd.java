package com.company.recursion;

import java.util.Scanner;

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
