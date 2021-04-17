package com.company.string;

import java.util.Scanner;

public class Palindrome {
    /**
     * 설명
     *
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
     *
     * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     *
     * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
     *
     * 알파벳 이외의 문자들의 무시합니다.
     *
     * 입력
     * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
     *
     * 출력
     * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
     *
     * found time study yduts emit dnuof
     */
    public static String solution(String str) {
        String result = "NO";
        char[] originalChars = str.toCharArray();
        char[] reverseChars = new StringBuilder(str).reverse().toString().toCharArray();
        StringBuilder originalStr = new StringBuilder();
        StringBuilder reverseStr = new StringBuilder();
        for (int i = 0; i < originalChars.length; i++) {
            if(Character.isAlphabetic(originalChars[i]))
                originalStr.append(originalChars[i]);
            if(Character.isAlphabetic(reverseChars[i]))
                reverseStr.append(reverseChars[i]);
        }

        if(originalStr.toString().equalsIgnoreCase(reverseStr.toString()))
            result = "YES";
        return result;
    }

    public static String solution2(String str) {
        String result = "NO";
        String original = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(original).reverse().toString();
        if(original.equals(reverse))
            result = "YES";
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = solution2(str);
        System.out.println(result);
    }
}
