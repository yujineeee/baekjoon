package com.algorithm.lv7;


package com.algorithm.lv7;

/*
*
* 크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
*
* 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
* 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
*
* 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
* 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
*
* 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
*
* ljes=njak
* */

import java.util.Scanner;

public class Main {

    private static final String[] CROATIA_WORDS = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        sc.close();

        for (int i = 0; i < CROATIA_WORDS.length; i++) {
            if (inputWord.indexOf(CROATIA_WORDS[i]) > -1) {
                inputWord = inputWord.replaceAll(CROATIA_WORDS[i], "웱");
            }
        }

        System.out.println(inputWord.split("").length);
    }

}

//import java.util.Scanner;
//
//public class Main {
//
//    private static final String[] CROATIA_WORDS = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inputWord = sc.nextLine();
//        sc.close();
//
//        int croatiaCount = 0;
//        for (int i = 0; i < CROATIA_WORDS.length; i++) {
//            if (inputWord.indexOf(CROATIA_WORDS[i]) > -1) {
//                croatiaCount += countMatches(CROATIA_WORDS[i], inputWord);
//                inputWord = inputWord.replaceAll(CROATIA_WORDS[i], "");
//            }
//        }
//
//        if (!inputWord.equals("")) {
//            croatiaCount += inputWord.split("").length;
//        }
//        System.out.println(croatiaCount);
//    }
//
//    public static int countMatches(String searchText, String targetText) {
//        if (!targetText.contains(searchText)) {
//            return 0;
//        }
//
//        int lastIndex = 0;
//        int count = 0;
//
//        while (lastIndex != -1) {
//            lastIndex = targetText.indexOf(searchText, lastIndex);
//
//            if (lastIndex != -1) {
//                count++;
//                lastIndex += searchText.length();
//            }
//        }
//
//        return count;
//    }
//}
