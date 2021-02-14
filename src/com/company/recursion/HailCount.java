package com.company.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 콜라츠의 추측, 3n+1 문제, 우박수 문제라고 불리는 이 문제는 다음과 같다.
 *
 * 1, 어떤 자연수 n이 입력되면,
 *
 * 2. n이 홀수이면 3n+1을 하고,
 *
 * 3. n이 짝수이면 n2를 한다.
 *
 * 4. 이 n이 1이 될때까지 2 3과정을 반복한다.
 *
 * 예를 들어 5는 5 → 16 → 8 → 4 → 2 → 1 이 된다.
 *
 * 이 처럼 어떤 자연수 n이 입력되면 위 알고리즘에 의해 1이 되는 과정을 모두 출력하시오.
 *
 * 이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
 *
 * [우박수 (3n + 1)]
 */
public class HailCount {

    /**
     * 우박 수 (3n + 1) 구하기
     * @param n 입력 값
     */
    public static void hailCount(int n) {
        System.out.println(n);  //n출력
        if(n == 1) return;
        if(n % 2 == 1) n = 3 * n + 1;
        else n = n / 2;
        hailCount(n);
    }

    static List<Integer> data = new ArrayList<>();  //우박수를 저장할 List
    /**
     * 우박 수 (3n + 1) 역순으로 구하기
     *
     * @param n 입력 값
     */
    public static void hailCountReverse(int n) {
        data.add(n);
        if(n == 1) return;
        if(n % 2 == 1) n = 3 * n + 1;
        else n = n / 2;
        hailCountReverse(n);
    }

    /**
     * 우박 수 역순으로 출력
     * @param n List 사이즈
     */
    public static void printHailCountReverse(int n) {
        if(n == 0) return;
        System.out.println(data.get(n - 1));    //n - 1번째부터 출력
        printHailCountReverse(n - 1);   //n을 1씩 줄여서 재귀
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("입력하세요: ");
        n = scan.nextInt();
        hailCount(n);
        //////////////////
        System.out.println("==================");
        hailCountReverse(n);
        printHailCountReverse(data.size());
    }

}
