package lesson3;

// вывести гласные
public class Main2 {
    public static void main(String[] args) {
        char[] chars = {'q', 'd', 'f', 'e', 'p', 'o', 'a', 'x', '5', 'a', '\''};

        for (char currentElement : chars) {
            if (currentElement == 'a' || currentElement == 'o' || currentElement == 'e') {
                System.out.println(currentElement);

            }
        }
    }
}

