package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 대문자 변환
//        System.out.println("대문자 변환: " + map(words, (s) -> s.toUpperCase()));
        System.out.println("대문자 변환 결과: " + map(words, String::toUpperCase));

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        System.out.println("특수문자 데코 결과: " + map(words, (s) -> "***" + s + "***"));

    }

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();

        for (String s : list) {
            result.add(func.apply(s));
        }

        return result;
    }

}
