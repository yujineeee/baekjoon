package com.algorithm.lv5;

//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
import java.util.*;
public class Level01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[count-1]);

        sc.close();
    }
}

/*
* sort로 넣었떠니 메모리를 너무 많이 잡아먹는다..! 아래와 같은 형식으로 정석(?) 대로 푸는게 더 좋은 것 같다
*
* //System.setIn(new FileInputStream("solveProblem/res/Main_bj_10818_최소최대.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int num = 0;
        int sign = 1;

        for (int c : br.readLine().getBytes()) {
            if(c == ' ') {
                num *= sign;
                min = Math.min(min, num);
                max = Math.max(max, num);
                num = 0;
                sign = 1;
            }else if(c == '-') {
                sign = -1;
            }else if('0' <= c && c <= '9') {
                num = num * 10 + (c - '0');
            }
        }

        num *= sign;
        min = Math.min(min, num);
        max = Math.max(max, num);

        System.out.println(min + " " + max);

        br.close();
    }
* */