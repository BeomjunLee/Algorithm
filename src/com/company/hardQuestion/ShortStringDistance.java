package com.company.hardQuestion;

import java.util.Scanner;

public class ShortStringDistance {
    /**
     * [String 단원]
     * 설명
     *
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     *
     * 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     *
     * 예시 입력 1
     *
     * teachermode e
     *
     * 예시 출력 1
     *
     * 1 0 1 2 1 0 1 2 2 1 0
     */
    public static int[] solution(String str, char word) {
        int[] result = new int[str.length()];
        int p = 1000;
        //알파벳 e가 아니면 1증가해서 기입
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != word) {
                p++;
            }
            else{
                p = 0;
            }
            result[i] = p;
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) != word) {
                p++;
                result[i] = Math.min(p, result[i]);
            }
            else{
                p = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char word = scan.next().charAt(0);
        int[] result = solution(str, word);
        for(int r : result)
            System.out.print(r + " ");
    }
}
