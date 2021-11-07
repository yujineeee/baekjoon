package com.algorithm.lv3;

import java.util.Scanner;
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
public class Level08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trialCount = sc.nextInt();
        for (int i = 0; i < trialCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+a+" + "+ b +" = "+(a+b));
        }
        sc.close();
    }
}