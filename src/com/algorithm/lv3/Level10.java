package com.algorithm.lv3;

/*
*
* 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
* */
import java.util.Scanner;
public class Level10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starCount = sc.nextInt();
        sc.close();
        for (int i = 1; i <= starCount; i++) {
            for (int j = 0; j < starCount - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

