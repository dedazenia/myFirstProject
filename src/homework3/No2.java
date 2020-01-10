package homework3;
//Есть массив {a,b,c,d}. Нужно его "перевернуть задом наперед". По итогу получится другой массив.
// И после этого, напечатать второй массив на консоль для демонстрации.
public class No2 {
    public static void main(String[] args) {

        char[] massiv = {'a', 'b', 'c', 'd'};

        char inverse;

        for (int i = 0; i < massiv.length / 2; i++) {
            inverse = massiv[massiv.length - i - 1];
            massiv[massiv.length - i - 1] = massiv[i];
            massiv[i] = inverse;
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]);
        }
    }
}
