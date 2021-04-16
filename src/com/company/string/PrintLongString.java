package com.company.string;

import java.util.Scanner;

public class PrintLongString {
    /**
     * 설명
     *
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     *
     * 문장속의 각 단어는 공백으로 구분됩니다.
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
     *
     * 단어를 답으로 합니다.
     */
    public static String solution(String str) {
        String[] words = str.split(" ");
        int min = 0;
        String result = "";
        for (String word : words) {
            int length = word.length();
            if (length > min) {
                min = length;
                result = word;
            }
        }
        return result;
    }
    public static String solution2(String str) {
        String result = "";
        int min = 0;
        int split;
        while ((split = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, split);
            int length = tmp.length();
            if (length > min) {
                min = length;
                result = tmp;
            }
            str = str.substring(split + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = solution(str);
        System.out.println(result);
    }
}
