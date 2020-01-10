package lesson4;

import static java.lang.Thread.*;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 31; day++) {
            for (int chas = 0; chas < 24; chas++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.printf("Прошло %d дня, %d часов, %d минут, %d секунд", day, chas, min, sec);
                        System.out.println();
                        sleep(1000);
                    }
                }
            }
        }
    }
}
