package lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) throws ParseException {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date = simpleDateFormat.parse("2018-09-09");
        System.out.println(date);
    }
}
