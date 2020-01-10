package homework3;

public class No4 {
    public static void main(String[] args) {
        String password = "jdhjfk3xme"; // проверяем пароль - 8 символов мин, букв+цифр,
        if (password.length() < 8) {
            System.out.println("Пароль меньше 7 символов не принимается");
            return;
        }
        boolean havingNumber = false; // проверка что содержит цифры
        for (int i = 0; i < 10; i++) {
            if (password.indexOf("" + i) != -1) { // ""+i - это конвертация int в стринг
                havingNumber = true;
                break;
            }

        }
        System.out.println(havingNumber);

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        if (!hasUppercase) System.out.println("Нужно добавить ЗАГЛАВНУЮ букву в пароль");
        if (!hasLowercase) System.out.println("Нужно добавить строчную букву в пароль");

    }


}