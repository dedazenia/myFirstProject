package homework1;

public class Triangle {
    public static void main(String[] args) {
        double a = 13;
        double b = 14;
        double c = 15;

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);

    }

}
