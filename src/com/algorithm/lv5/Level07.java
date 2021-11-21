package com.algorithm.lv5;

/*
*
* 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
*  점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
*
* 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
*
* */
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int studentCount = sc.nextInt();
            double scores[] = new double[studentCount];
            double sum = 0;
            for (int j = 0; j < studentCount; j++) {
                double score = sc.nextDouble();
                scores[j] = score;
                sum += score;
            }
            double average = sum/studentCount;
            int count = 0;
            for (int j = 0; j < studentCount; j++) {
                if (scores[j] > average) {
                    count++;
                }
            }
            double rate = ((double) count / studentCount) * 100;
            System.out.println(String.format("%.3f", rate)+"%");
        }
        sc.close();
    }
}
