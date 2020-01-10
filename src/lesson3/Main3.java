package lesson3;

public class Main3 {
    public static void main(String[] args) {
        String text = "qwerty hskke ksjh asdfghj";
        System.out.println(text.length()); // выводит длину

        String[] slova = text.split(" ");

        for (int i = slova.length - 1; i >=0; i--){
            System.out.println(slova[i]);
        }

    }
}
