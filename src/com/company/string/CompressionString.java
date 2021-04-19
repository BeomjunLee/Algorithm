package com.company.string;

import java.util.Scanner;

public class CompressionString {
    /**
     * 설명
     *
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     *
     * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     *
     * 단 반복횟수가 1인 경우 생략합니다.
     *
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 줄에 압축된 문자열을 출력한다.
     *
     * 예시 입력 1
     *
     * KKHSSSSSSSE
     *
     * 예시 출력 1
     *
     * K2HS7E
     */
    public static String solution(String str) {
            char tmp = str.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < str.length(); i++) {
                //다음 글자와 같은 경우 (count 위주)
                if(tmp == str.charAt(i)) {
                    count++;    //count + 1

                    //마지막 글자인 경우
                    if(i == str.length() - 1) {
                        sb.append(tmp);     //전에 있던 글자를 append
                        sb.append(count);   //count 도 append
                    }
                }
                //다음 글자와 다른 경우 (StringBuilder 에 기록 위주)
                if(tmp != str.charAt(i)){
                    sb.append(tmp);         //전에 있던 글자를 append
                    tmp = str.charAt(i);    //tmp 를 다음 글자로 교체(다음 비교 진행을 위해)

                    //count 가 1이 아닌경우 (반복된 글자가 여러개 카운팅 된 경우)
                    if(count != 1){
                        sb.append(count); //기록 해야하므로 count 기록
                        count = 1;        //기록 했으니 count 1로 초기화
                    }

                    //마지막 글자인 경우 어차피 다른 글자이므로 마지막 글자를 append
                    if(i == str.length() - 1)
                        sb.append(str.charAt(i));
                }
            }
            return sb.toString();
    }

    public static String solution2(String str) {
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = solution(str);
        System.out.println(result);
    }
}
