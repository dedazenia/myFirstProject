package homework3;

//Есть массив чисел (задайте его сами).
//Задача - посчитать и напечатать на консоль сумму всех четных цифр внутри этого массива.
public class No3 {
    public static void main(String[] args) {
        int[] massiv = {2, 3, 1, 8, 5};
        int summa = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0)
                summa = summa + massiv[i];

        }
        System.out.println(summa);


    }
}
