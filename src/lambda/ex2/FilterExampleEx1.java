package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleEx1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(-3, -2, -1, 1, 2, 3, 5);

        List<Integer> negatives = filter(list, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });

        List<Integer> evens = filter(list, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });

        System.out.println("원본 리스트: " + list);
        System.out.println("음수만: " + negatives);
        System.out.println("짝수만: " + evens);

    }

    private static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (predicate.test(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
