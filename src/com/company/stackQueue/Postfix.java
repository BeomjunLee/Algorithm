package com.company.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    /**
     * 후위 연산자 문제
     */
    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (char c : str.toCharArray()) {
            switch (c) {
                case '+':
                    int left = stack.pop();
                    int right = stack.pop();
                    result = left + right;
                    stack.push(result);
                    break;
                case '-':
                    left = stack.pop();
                    right = stack.pop();
                    if(left > right)
                        result = left - right;
                    else
                        result = right - left;
                    stack.push(result);
                    break;
                case '*':
                    left = stack.pop();
                    right = stack.pop();
                    result = left * right;
                    stack.push(result);
                    break;
                case '/':
                    left = stack.pop();
                    right = stack.pop();
                    if(left > right)
                        result = left / right;
                    else
                        result = right / left;
                    stack.push(result);
                    break;
            }
            if (c != '+' && c != '-' && c != '*' && c != '/') {
                stack.push(Integer.parseInt(String.valueOf(c)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}
