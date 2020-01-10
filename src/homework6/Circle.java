package homework6;


public class Circle {

    private double r;


    public void setR(double r) {
        this.r = r;

    }

    public double perimetr() {

        return this.r * Math.PI;

    }

    public double ploshad() {
        return Math.PI * this.r * this.r;

    }

}
