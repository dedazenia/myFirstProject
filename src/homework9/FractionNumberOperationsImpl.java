package homework9;

public class FractionNumberOperationsImpl implements FractionNumberOperation {

    private FractionNumber a;
    private FractionNumber b;





    public FractionNumberOperationsImpl() {
    }

    public FractionNumberOperationsImpl(FractionNumber a, FractionNumber b) {
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
