package homework5;

import lesson5.TourUtils;


public class No1 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "75000", "4 звезды"},
                {"2", "Франция", "110000", "5 звезд"},
                {"3", "Израиль", "55000", "3 звезды"},
                {"4", "Италия", "630000", "5 звезд"},
                {"5", "Марокко", "49000", "4 звезды"}};

        TourUtils.getMaxValue(tours);



    }


}
