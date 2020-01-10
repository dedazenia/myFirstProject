package homework3;

//Есть массив {a,b,c,d}. Нужно его "перевернуть задом наперед". По итогу получится другой массив.
// И после этого, напечатать второй массив на консоль для демонстрации.
public class No22 {
    public static void main(String[] args) {

        char[] massiv = {'a', 'b', 'c', 'd'};

        for (int i = massiv.length - 1; i >= 0; i--) {

            System.out.print(massiv[i]);
        }
    }
}