package com.company.sort;

import java.util.*;
import java.util.stream.Collectors;

public class MisChief {
    public static List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            tmp.add(arr[i]);
        }
        List<Integer> collect = tmp.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != collect.get(i))
                result.add(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        List<Integer> result = solution(arr);
        for(int i : result)
            System.out.print(i + " ");
    }
}
