package lambda.ex3;

import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx2 {
    public static void main(String[] args) {

        List<Integer> list = List.of(-3, -2, -1, 1, 2, 3, 5);

        System.out.println("원본 리스트: " + list);
        System.out.println("음수만: " + filter(list, (num) -> num < 0));
        System.out.println("짝수만: " + filter(list, (num) -> num % 2 == 0));

    }

    private static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (predicate.test(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
