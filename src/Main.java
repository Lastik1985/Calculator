public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c;


        c = calc.devide.apply(100, 20);
        calc.println.accept(c);
        c = calc.multiply.apply(5, 5);
        calc.println.accept(c);
        c = calc.pow.apply(11);
        calc.println.accept(c);
        c = calc.abs.apply(10);
        calc.println.accept(c);
        boolean d = calc.isPositive.test(25);
        calc.printlnd.accept(d);
    }
}