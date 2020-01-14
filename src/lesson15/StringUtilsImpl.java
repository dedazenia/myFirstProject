package lesson15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Число 1 или 2 - пусты!");
        }
        double num1;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первый параметр не является числом");

        }
        double num2;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второй параметр не является числом");

        }

        if (num2 == 0.0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        String[] strings = text.split(" ");


        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {


        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
        ArrayList<Double> doubles = new ArrayList<>();
        while (m.find()) {
            double d = Double.parseDouble(m.group(1));
            doubles.add(d);
        }
        Double[] doubles1 = new Double[doubles.size()];
        for (int i = 0; i < doubles.size(); i++) {
            doubles1[i] = Double.valueOf(doubles.get(i));
        }
        return new double[0];
    }
}
