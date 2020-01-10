package lesson5;

public class TourUtils {

    public static void printToursByCountry(String[][] tours, String inputCountry) {
        for (int i = 0; i < tours.length; i++) {
            if (inputCountry.equals(tours[i][1])) {
                System.out.printf("Тур: %s - %s, цена - %s, %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }

        }

    }

    public static void printToursFromToPrice(int from, int to, String[][] toursFromTo) {
        for (int i = 0; i < toursFromTo.length; i++) {
            int priceTour = Integer.parseInt(toursFromTo[i][2]);
            if (priceTour >= from && priceTour <= to) {
                System.out.printf("Тур: %s - %s, цена - %s, %s", toursFromTo[i][0], toursFromTo[i][1], toursFromTo[i][2], toursFromTo[i][3]);
                System.out.println();

            }
        }

    }


    public static void getMaxValue(String[][] tours) {
// неверное
        int maxExpansiveTour = Integer.parseInt(tours[0][2]);

        for (int i = 1; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][2]);
            if (priceTour >= maxExpansiveTour) {
                maxExpansiveTour = priceTour;
                System.out.printf("Тур: %s - %s, цена - %s, %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }
        }

    }


    public static void printToursByCountryAndStars(String[][] tours, String inputCountry, int starsFrom) {
        for (int i = 0; i < tours.length; i++) {
            if (inputCountry.equals(tours[i][1])) {
                char star = tours[i][3].charAt(0);
                int stars = Character.getNumericValue(star);

                if (starsFrom <= stars) {

                    System.out.printf("Тур: %s - %s, цена - %s, %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                    System.out.println();
                } else {
                    System.out.println("Тура по вашим параметрам нет");

                }

            }
        }
    }


    public static void printAverageToursPriceByCountry(String[][] tours, String inputCountry) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < tours.length; i++) {
            if (inputCountry.equals(tours[i][1])) {

                int priceTour = Integer.parseInt(tours[i][2]);

                sum = sum + priceTour;
                count = count + 1;
            }
        }
        int averagePrice = sum / count;
        System.out.printf("Средня стоимость тура в страну " + inputCountry + " " + averagePrice);

    }


    public static void maxPrice(String[][] tours) {
        int maxCost = 0;
        String max;
        for (int i = 0; i < tours.length; i++) {
            int num = Integer.parseInt(tours[i][3]);
            if (num > maxCost) {
                maxCost = num;
            }
        }
        max = Integer.toString(maxCost);
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][3].equalsIgnoreCase(max)) {
                System.out.printf("Tour: %s - %s, %s, cost - %s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }
        }
    }

    public static void printTheMostExpensiveTour(String[][] tours) {
        int numberTour = 0;
        int maxCost = 0;
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][2]);
            if (priceTour > maxCost) {
                maxCost = priceTour;
                numberTour = i;
            }
        }
        System.out.printf("Тур: %s - %s, цена %s, %s", tours[numberTour][0], tours[numberTour][1], tours[numberTour][2], tours[numberTour][3]);
        System.out.println();
    }
}

//    public static void printCheapestToursByCountry(String[][] tours, String inputCountry) {
//
//
//        for (int i = 0; i < tours.length; i++) {
//            if (inputCountry.equals(tours[i][1])) {
//                int priceTour = Integer.parseInt(tours[i][2]);
//                int minPrice = priceTour;
//
//
//            }
//
//
//        }
//        System.out.println("Минимальная стоимость тура в страну " + inputCountry + " " + minPrice);
//    }
//
//}


// 1 - напечатать самый  дорогой тур
// 2 - все туры ... звезд ... страны (введите кол-во звезд (от), введите страну)
// 3 - самый дешевый тур в .... страну
// +4 - средняя стоимость тура в .... страну
