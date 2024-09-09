package mid_2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Map<String ,String > dictionary = new HashMap<>();
        System.out.println("==단어 입력 단계==");

        Scanner scanner = new Scanner(System.in);
        String key = "";
        String value = "";



        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            key = scanner.next();
            if(key.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            value = scanner.next();
            dictionary.put(key, value);
        }

        System.out.println();

        System.out.println("==단어 검색 단계==");


        while (true) {
            System.out.print("영어 단어를 검색하세요 (종료는 'q'): ");
            String target = scanner.next();
            if (target.equals("q")) {
                break;
            }
            if (dictionary.containsKey(target)) {
                String result = dictionary.get(target);
                System.out.println(target + "의 뜻: " + result);
            } else {
                System.out.println(target + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
