public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);     // b = 0;
//        int c = calculator.devide.apply(a, b);       // c = 3 / 0, из-за деления на 0 возникает ошибка
        int d = calculator.devideWorking.apply(a, b);  // при y == 0, ответ 0

        calculator.println.accept(d);
    }
}