package lesson15;

public class Main1 {
    public static void main(String[] args) {

        StringUtilsImpl utils = new StringUtilsImpl();
        try {
            System.out.println(utils.div("65", "0"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Throwable throwable) {
            System.out.println("throwable");

        }

        System.out.println("Конец примера");

    }


}
