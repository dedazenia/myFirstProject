package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "75000", "4 звезды"},
                {"2", "Франция", "110000", "5 звезд"},
                {"3", "Израиль", "55000", "3 звезды"},
                {"4", "Италия", "63000", "5 звезд"},
                {"5", "Марокко", "49000", "4 звезды"}};
   //     System.out.println("В какую страну вы хотите поехать?");

 //       Scanner keyboard= new Scanner(System.in);
  //      String inputCountry=keyboard.nextLine();
    //    System.out.println(inputCountry);

     //   TourUtils.printToursByCountry(tours, inputCountry);

        System.out.println("Введите минимальную сумму тура");
        Scanner keyboard = new Scanner((System.in));

        int priceFrom=keyboard.nextInt();
        System.out.println("Введите максимальную стоимость тура");
        int priceTo=keyboard.nextInt();

        TourUtils.printToursFromToPrice(priceFrom, priceTo, tours);



    }


}
