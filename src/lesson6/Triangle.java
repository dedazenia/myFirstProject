package lesson6;

public class Triangle {
    // 1- переменные
    private int a;
    private int b;
    private int c;
    private String color;

//    2- конструкторы


    //   3- Методы
    public void setColor(String newColor) {
        color = newColor;
    }

    public void setA(int a) {

        this.a = a;
    }


    public void setB(int b) {

        this.b = b;
    }

    public void setC(int c) {

        this.c = c;
    }
    public void print () {
        System.out.printf("Треугольник со сторонами: %d, %d, %d", this.a, this.b, this.c);
        System.out.println();

    }

    public int perimetr () {
        return this.a + this.b + this.c;


    }

}
