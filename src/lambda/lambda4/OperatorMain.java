package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {
    public static void main(String[] args) {
        // UnaryOperator
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;

        System.out.println("square1.apply(5) = " + square1.apply(5));
        System.out.println("square2.apply(5) = " + square2.apply(5));

        BiFunction<Integer, Integer, Integer> addition1 = (a, b) -> a + b;
        BinaryOperator<Integer> addition2 = (a, b) -> a + b;

        System.out.println("addition1.apply(5) = " + addition1.apply(5, 5));
        System.out.println("addition2.apply(5) = " + addition2.apply(5, 5));
    }
}
