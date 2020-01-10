package lesson13;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> holodilnik = new HashMap<>();
        holodilnik.put("Яблоко", 5);
        holodilnik.put("Груша", 3);
        holodilnik.put("Слива", 4);
        holodilnik.put("Ананас", 7);

        System.out.println(holodilnik);

        int summa = 0;
        for (String currentProdukt : holodilnik.keySet()) {
            summa = summa + holodilnik.get(currentProdukt);
        }
        System.out.println(summa);

        holodilnik.put("Груша", 3 + holodilnik.get("Груша"));
        System.out.println(holodilnik);

        int summ = 0;
        for (Integer currentProd : holodilnik.values()) {
            summ = summ + currentProd;
            System.out.println(currentProd);
        }


    }
}
