package com.algorithm.lv3;



/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * */
import java.util.Scanner;

public class Level07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trialCount = sc.nextInt();
        for (int i = 0;i<trialCount ;i++){
            int count = sc.nextInt() + sc.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + count);
        }
        sc.close();
    }
}