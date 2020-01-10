package homework6;

public class Main {

    public static void main(String[] args) {

        Circle circ1 = new Circle();
        circ1.setR(10);

        System.out.println();
        System.out.println("Длина окружности - " + circ1.perimetr());
        System.out.println("Площадь руга - " + circ1.ploshad());
        System.out.println();



        Square square1= new Square();
        square1.setA(10);
        square1.setB(7);

        System.out.println("Периметр прямоугольника - " + square1.perimetr());
        System.out.println("Площадь прямоугольника - "+ square1.ploshad());
        System.out.println();

        Romb romb1= new Romb ();
        romb1.setA(8);
        romb1.setH(5);

        System.out.println("Периметр ромба - "+ romb1.perimetr());
        System.out.println("площадь ромба - "+ romb1.ploshad());
        System.out.println();



    }
}
