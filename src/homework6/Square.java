package homework6;

public class Square {
    private int a;
    private int b;


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {

        this.b = b;
    }

    public int perimetr() {

        return 2 * this.a + 2 * this.b;
    }

    public int ploshad() {

        return this.a * this.b;
    }
}
