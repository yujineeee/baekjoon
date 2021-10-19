package com.algorithm.lv1;

import java.util.Scanner;

/*
*
* Q: (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
* (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*
*
* 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
* 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
*
*
* * */
public class Level11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int a_multiple_one = a * (b%10);
        int a_multiple_ten = a * ((b%100)/10);
        int a_multiple_hundred = a * (b/100);

        System.out.println(a_multiple_one);
        System.out.println(a_multiple_ten);
        System.out.println(a_multiple_hundred);
        System.out.println(a_multiple_one + (a_multiple_ten*10) + (a_multiple_hundred*100));

        sc.close();
    }
}

/*
* 어려웠따......... 충격.. ㅋㅋㅋㅋㅋ
* 일의 자리 십의 자리 백의 자리 구하기... ㅋㅋㅋㅋㅋ
*
* 제일 짧은 코딩 (다른 분꺼)
* import java.util.*;interface Main{static void main(String[]z){Scanner s=new Scanner(System.in);int a=s.nextInt(),b=s.nextInt();System.out.print(b%10*a+" "+b/10%10*a+" "+b/100*a+" "+a*b);}}
*
* 마지막에 그냥 a*b해도 되는구나.. 굳이 안더하구;;ㅎㅎ
* */
