package lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    private FractionNumberImpl a;
    private FractionNumberImpl b;

    public FractionNumberOperationImpl() {
    }

    public FractionNumberOperationImpl(FractionNumberImpl a, FractionNumberImpl b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int dividend = a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend();
        int divisor = a.getDivisor() * b.getDivisor();
        return new FractionNumberImpl(dividend, divisor);
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int dividend = a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend();
        int divisor = a.getDivisor() * b.getDivisor();
        return new FractionNumberImpl(dividend, divisor);
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int dividend = a.getDividend() * b.getDividend();
        int divisor = a.getDivisor() * b.getDivisor();
        return new FractionNumberImpl(dividend, divisor);
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int dividend = a.getDividend() * b.getDivisor();
        int divisor = a.getDivisor() * b.getDividend();
        return new FractionNumberImpl(dividend, divisor);
    }
}
