package homework3;

// Есть массив {a,b,c,d}. С помощью цикла for нужно напечатать на консоль по одной букве по очереди.
public class No1 {
    public static void main(String[] args) {
        char[] massiv = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);

        }
    }
}
