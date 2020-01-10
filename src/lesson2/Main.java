package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 4;
        if (a == b && b == c) {
            System.out.println("Это равносторонний треугольник");
        }
        if ((b == c && a != b) || (a == c && b != c) || (a == b && b != c)) {
            System.out.println("Это равнобедренный треугольник");
        }

        if (a != b || b != c || c != a) {
            System.out.println("Это разносторонний треугольник");
        }
    }

}
