package com.algorithm.lv3;


/*
*
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.* * */
import java.io.*;
public class Level05 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());
            br.close();
            for (int i = 1; i<=number;i++) {
                System.out.println(i);
            }
        } catch (IOException e) {
            //exception
        }

    }
}

//2:30
