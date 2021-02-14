package com.company.recursion;

import java.util.Scanner;

/**
 * 팩토리얼(!)은 다음과 같이 정의된다.
 *
 * n!=n×(n−1)×(n−2)×⋯×2×1
 * 즉, 5!=5×4×3×2×1=120 이다.
 *
 * n이 입력되면 n!의 값을 출력하시오.
 *
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 */
public class Factorial {

    //5! = 5 * 4 * 3 * 2 * 1         =>       n! = n * (n-1) * (n-2) * (n-3) ....    다음 올 식이 0이 아닐 때 까지
    public static int factorial(int n) {
        if(n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("입력하세요: ");
        n = scan.nextInt();

        System.out.println(n+"! : " + factorial(n));
    }
}
