package lesson1;

public class Main {

    public static void main(String[] args) {

        int konfetu = 7;
        int dety = 2;

        int ostatokKonfetVRukah = konfetu % dety;

        if (ostatokKonfetVRukah == 0) {
            System.out.println("Конфет раздали поровну");
        }
        if (ostatokKonfetVRukah != 0) {
            System.out.println("Конфет раздали НЕ поровну");
        }

    }

}
