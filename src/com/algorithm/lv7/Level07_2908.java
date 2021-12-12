package com.algorithm.lv7;

/*
* 상근이의 동생 상수는 수학을 정말 못한다.
* 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
* 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
* 예를 들어, 734와 893을 칠판에 적었다면,
* 상수는 이 수를 437과 398로 읽는다.
* 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
*
*
* 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
*
* 첫째 줄에 상수의 대답을 출력한다.
* */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().trim().split(" ");
        sc.close();
        int[] newNumbers = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            String newNumber = "";
            for (int j = 2; j >= 0; j--) {
                newNumber += numbers[i].split("")[j];
            }

            newNumbers[i] = Integer.parseInt(newNumber);
        }

        if (newNumbers[0] > newNumbers[1]) {
            System.out.println(newNumbers[0]);
        } else {
            System.out.println(newNumbers[1]);
        }
    }
}


//??? 모르겟어요..