package com.company.twoPointers;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatedArrays {

    /**
     * 설명
     * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
     * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
     * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
     *
     * 출력
     * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
     *
     * 예시 입력 1
     * 5
     * 1 3 9 5 2
     * 5
     * 3 2 5 7 8
     * 예시 출력 1
     * 2 3 5
     */

    public static List<Integer> solution(int num1, int[] arr1, int num2, int[] arr2) {
        Set<Integer> arrList = new HashSet<>();
        Arrays.stream(arr1).forEach(a -> arrList.add(a));

        List<Integer> result = new ArrayList<>();
        Arrays.stream(arr2).filter(a -> !arrList.add(a)).forEach(a -> result.add(a));

        return result.stream().sorted().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = scan.nextInt();
        }

        int num2 = scan.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = scan.nextInt();
        }

        List<Integer> result = solution(num1, arr1, num2, arr2);
        for (int i : result) {
        System.out.print(i + " ");
        }
    }
}
