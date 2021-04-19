package com.company.string;

import java.util.Scanner;

public class ReverseString2 {
    /**
     * 설명
     *
     * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     *
     * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
     *
     * 출력
     * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
     */
    public static String solution(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] result = str.toCharArray();
        while (left < right) {
            if (!Character.isAlphabetic(result[left]))
                left++;
            else if (!Character.isAlphabetic(result[right]))
                right--;
            else {
                char tmp = result[left];
                result[left] = result[right];
                result[right] = tmp;
                left++;
                right--;
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = solution(str);
        System.out.println(result);
    }
}
