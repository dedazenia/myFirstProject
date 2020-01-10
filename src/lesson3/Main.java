package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] massiv = {2, 6, 4, 8, 5};

        System.out.println(massiv[0]); // выведение массива построчно
        System.out.println(massiv[1]);
        System.out.println(massiv[2]);
        System.out.println(massiv[3]);
        System.out.println(massiv[4]);

        System.out.println();

        for (int i=0; i <=4; i++){
            System.out.println(massiv[i]); // выведение массива через цикл
        }

    }
}
