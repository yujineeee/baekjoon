package com.algorithm.lv1;

import java.util.Scanner;

public class Level08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.print(a/b);
        sc.close();
    }
}

/*
* 형변환 문제..? double이 맞나? 더 효율 좋은 뭐가 있나?
* */