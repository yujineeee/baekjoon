package com.algorithm.lv1;

import java.util.Scanner;

public class Level06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.print(a-b);
    }
}

/*
* 다른 사람이 짠 소스
* import java.util.*;class Main{public static void main(String[]t){Scanner x=new Scanner(System.in);System.out.print(x.nextInt()-x.nextInt());}}
*
* */