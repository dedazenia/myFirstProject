package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int tourCost = 18000;
        int money = 10000;
        int monthToTrip = 4;
        int salary = 2000;
        int saveMoneyAtThisPeriod = salary * monthToTrip;
        int totalMoneyBeforeTrip;
        totalMoneyBeforeTrip = money + saveMoneyAtThisPeriod;

        if (totalMoneyBeforeTrip < tourCost) {
            System.out.println("не едем у тур - мало денег");
        } else {
            System.out.println("едем у тур - денег хватает");

        }

    }
}
