package homework9;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(1, 5);
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(3, 10);
        System.out.println(fractionNumber1 + "=" + fractionNumber2.value());
        System.out.println(fractionNumber1.toString());
        FractionNumber a = new FractionNumberImpl(1, 3);
        FractionNumber b = new FractionNumberImpl(2, 4);

        FractionNumberOperation fractionNumberOperation = new FractionNumberOperationsImpl(a, b);
        FractionNumberOperationsImpl fractionNumberOperations2 = new FractionNumberOperationsImpl(fractionNumber1, fractionNumber2);
        System.out.println(fractionNumberOperation.sub(a, b) + "");
        System.out.println(fractionNumberOperation.add(a, b) + "");
        System.out.println(fractionNumberOperation.div(a, b) + "");
        System.out.println(fractionNumberOperation.mul(a, b) + "");
        System.out.println(fractionNumberOperation.sub(fractionNumber1, fractionNumber2) + "");
        System.out.println();
        System.out.println();
        System.out.println(fractionNumberOperations2.add(fractionNumber1,fractionNumber2) + "");


    }
}
