package com.algorithm.lv7;

/*
*
* N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
*
* 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
*
* */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] numbers = sc.next().split("");
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
        sc.close();

    }
}
}

//맞긴했는데 문제 오류가 아닌지..? 두번쨰 들어오는 숫자 n개가 일의 자리인지 십의 자리인지 따로 나오지 않았음..?

