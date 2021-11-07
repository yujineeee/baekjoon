package com.algorithm.lv3;



/*
*
* 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*
* * */
import java.util.Scanner;
public class Level11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        int max = sc.nextInt();
        for (int i = 0; i < totalCount; i++) {
            int a = sc.nextInt();
            if (a < max) {
                System.out.print(a + " ");
            }
        }
        sc.close();
    }
}
