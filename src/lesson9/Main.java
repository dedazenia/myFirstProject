package lesson9;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(3, 4);
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(1, 3);
        System.out.println("Первое число " + fractionNumber1 + " = " + fractionNumber1.value());
        System.out.println("Второе число " + fractionNumber2 + " = " + fractionNumber2.value());

        FractionNumberOperationImpl FractionNumberOperationImpl = new FractionNumberOperationImpl(fractionNumber1, fractionNumber2);

        System.out.println("Сумма " + FractionNumberOperationImpl.add(fractionNumber1, fractionNumber2));

        System.out.println("Разность " + FractionNumberOperationImpl.sub(fractionNumber1, fractionNumber2));

        System.out.println("Результат деления " + FractionNumberOperationImpl.div(fractionNumber1, fractionNumber2));

        System.out.println("Произведение " + FractionNumberOperationImpl.mul(fractionNumber1, fractionNumber2));


    }
}
