package com.company.array;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class test {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tol, x0, x, a1, a2, intol = 1;
        int i1 = 1;

        System.out.print("허용 오차를 입력하세요:");
        tol = scan.nextDouble();
        System.out.print("초기 추측근을 입력하세요(-3<x<3):");
        x0 = scan.nextDouble();

        while (abs(intol) > tol) {
            a1 = 2 * pow(x0, 3) + 3 * pow(x0, 2) + x0 + 1;
            a2 = 6 * pow(x0, 2) + 6 * x0 + 1;
            x = x0 - a1 / a2;
            intol = x - x0;
            x0 = x;
            System.out.printf("f(x%d):%f     f'(x%d):%f     x%d값:%f     오차값:%f\n", i1-1, a1,i1-1,a2,i1,x,abs(intol));
            i1++;
        }

        System.out.printf("-----------------------------------------------------\n");
        System.out.printf("%d회 반복 >>> 근의 근사값:%f 오차값: %f\n", i1-1, x0, intol);
        System.out.printf("-----------------------------------------------------");
    }
}
