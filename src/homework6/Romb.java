package homework6;

public class Romb {
    private double a;
    private double h;

    public void setA(double a) {
        this.a = a;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double perimetr() {
        return a * 4;
    }

    public double ploshad() {
        return a * h;
    }


}
