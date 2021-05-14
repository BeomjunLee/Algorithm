package com.company.hash;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
    /**
     * 설명
     * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     *
     * 입력
     * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     *
     * 출력
     * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     *
     * 예시 입력 1
     * bacaAacba
     * abc
     * 예시 출력 1
     * 3
     * 힌트
     * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
     */
    public static int solution(String str1, String str2) {
        char[] words = str1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int result = 0;
        int str2Length = str2.toCharArray().length;
        for (int i = 0; i < str2Length - 1; i++)
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        for (char c : str2.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        int left = 0;
        for (int right = str2Length - 1; right < words.length; right++) {
            map.put(words[right], map.getOrDefault(words[right], 0) + 1);
            if(map.equals(map2))
                result++;
            map.put(words[left], map.get(words[left]) - 1);
            if(map.get(words[left]) == 0) map.remove(words[left]);
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int result = solution(str1, str2);
        System.out.println(result);
    }
}
