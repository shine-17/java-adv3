package functional;

import java.util.function.Function;

public class SideEffectMain3 {

    public static void main(String[] args) {

        Function<Integer, Integer> func = x -> x * 2;
        int x = 10;
        Integer result = func.apply(x);

        // 부수 효과(Side Effect)
        // 출력ㅇ느 별도로 처리해 순수성 유지
        System.out.println("x = " + x + ", result = " + result);
    }
}
