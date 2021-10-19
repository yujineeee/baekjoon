package com.algorithm.lv1;

import java.util.Scanner;
public class Level05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.print(a+b);
    }
}

/*
* 입력 받는 법 까먹어서 찾아봄.... 큰일..
*
* Scanner 클래스 -
*
* // scanner클래스를 사용하면 IOException을 선언하지 않아도 된다.
* // 그러나 open - close 타입이라 사용 후에는 close로 리소스 반환을 해야 leak이 발생하지 않는다.
출처: https://nowonbun.tistory.com/459 [명월 일지]
* */