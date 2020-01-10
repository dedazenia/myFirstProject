package homework5;

import lesson5.TourUtils;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "75000", "4 звезды"},
                {"2", "Франция", "110000", "5 звезд"},
                {"3", "Израиль", "55000", "3 звезды"},
                {"4", "Италия", "63000", "5 звезд"},
                {"5", "Марокко", "49000", "4 звезды"}};

        System.out.println("В какую страну вы хотите поехать?");

        Scanner keyboard = new Scanner(System.in);
        String inputCountry = keyboard.nextLine();



//
//        TourUtils.printCheapestToursByCountry(tours,inputCountry);


    }


}


