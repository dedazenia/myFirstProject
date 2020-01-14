package lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(1200);
            System.out.println("Успех");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Неверный возраст указан");
        }
        System.out.println("Конец");

    }
}
