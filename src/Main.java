public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c;
        try {
            c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException var6) {
            System.out.println("Делить на ноль нельзя!");
        }

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