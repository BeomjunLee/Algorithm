package com.company.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 두 수를 거꾸로 출력하기..
 *
 * 세 수를 거꾸로 출력하기...
 *
 * 이런 문제들은 쉽게 풀 수 있었다.
 *
 * 이번에는 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.
 */
public class reversePrint {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int dataSize;
        dataSize = scan.nextInt();

        for (int i = 0; i < dataSize; i++) {
            stack.push(scan.nextInt());
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
