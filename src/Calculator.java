import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя!");
            return 0;
        }
    };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Predicate<Integer> isPositive = x -> x > 0;
    protected Consumer<Boolean> printlnd = System.out::println;
        Consumer<Integer> println = System.out::println;



}

