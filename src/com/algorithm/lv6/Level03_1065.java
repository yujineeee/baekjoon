package com.algorithm;

/*
*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
* 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
* N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
*
* 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
*
* 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
* */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int count = 0;
        for(int i = 1; i <= number; i++) {
            if (isHansu(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isHansu(int number) {
        String[] numbers = (number+"").split("");
        if (numbers.length <= 2) {
            return true;
        }

        boolean result = true;
        int sequence = Integer.parseInt(numbers[numbers.length - 1]) - Integer.parseInt(numbers[numbers.length - 2]);
        for (int i = 0; i < numbers.length; i++) {
            if (i+1 > numbers.length -1) {
                break;
            }

            if (Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i+1]) != (sequence * -1)) {
                result = false;
                break;
            }
        }

        return result;
    }
}

//억지로 맞추긴했는데 정말더럽다..