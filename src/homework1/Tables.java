package homework1;

public class Tables {
    public static void main(String[] args) {
        double roomLength = 7;
        double roomWidth = 5;
        double tableLength = 3;
        double tableWidth = 2;

        double roomSquare = roomLength * roomWidth;
        double tableSquare = tableLength * tableWidth;
        int tablesQuantity = (int) (roomSquare / tableSquare);
        System.out.println(tablesQuantity);


    }
}
