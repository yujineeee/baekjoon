package com.algorithm.lv1;


/*
* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
*
* 첫째 줄에 다음 세 가지 중 하나를 출력한다.

A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*
*
* */
import java.util.Scanner;
public class Level01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] statment = sc.nextLine().split(" ");
        int a = Integer.parseInt(statment[0]);
        int b = Integer.parseInt(statment[1]);

        if (a > b) {
            System.out.println(">");
        } else {
            System.out.println(a == b ? "==" : "<");
        }

        sc.close();
    }

    //1. 스캐너로 스트링 받아오기 next(), nextLine()
    //2. int 비교 Integer 비교 차이점


    /*
    * import java.util.*;
    * class Main{public static void main(String[]z)
    *   {Scanner s=new Scanner(System.in);
    * int a=s.nextInt(),b=s.nextInt();
    * System.out.print(a>b?">":a<b?"<":"==");}}
    *
    * 걍 이렇게 - 로 해두 되고 nextInt()이런식으로 하면 띄어쓰기도 그냥 받아와지는구나;;
    * */
}
