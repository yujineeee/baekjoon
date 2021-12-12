package com.algorithm.lv7;

/*
*
* 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
*
* 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
*
* 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*
* Mississipi ?
* zZa Z
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().toUpperCase().split("");
        Map<String, Integer> alphabets = new HashMap<String, Integer>();
        for (int i = 0; i < word.length; i++) {
            Integer count = alphabets.getOrDefault(word[i], 0) + 1;
            alphabets.put(word[i], count);
        }

        int max = 0;
        String maxKey = "";
        for(String key : alphabets.keySet() ){
            if (alphabets.get(key) >= max) {
                if (max == alphabets.get(key)) {
                    maxKey = "?";
                } else {
                    maxKey = key;
                }
                max = alphabets.get(key);
            }
        }

        System.out.println(maxKey);
        sc.close();
    }
}

//ㅋㅋㅋ.... 음... ;; ㅎㅎ;; alphabets를 배열로 정렬하는 Arrays.sort() 로 하려다가 그렇게하면 키값을 잃어버리게 되어서
// 맵형식으로 풀려고 했는데 썩 좋지 못한(?) 방법 같다...
