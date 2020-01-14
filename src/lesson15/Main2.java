package lesson15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String str1 = "Впервые iPhone был анонсирован Стивом Джобсом на конференции Macworld Expo 9 января 2007 года. Название iPhone образовано от англ. phone (телефон) добавлением буквы i; на презентации Джобс заявил, что это сокращение слова Internet (Интернет), а также сказал, что «эта буква означает для нас и другие вещи» и показал слайд со словами individual, instruct, inform, inspire («личный; обучать; сообщать; вдохновлять»)[8]. В продажу аппарат поступил 29 июня 2007 года вместе с iPhone OS и быстро завоевал существенную часть рынка смартфонов в США. Популярность iPhone OS поддержал вышедший в продажу в сентябре того же года iPod touch, обладавший, однако, заметно урезанной функциональностью по сравнению с iPhone.";

        Pattern pattern = Pattern.compile("iPhone(\\w*)");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find())
            System.out.println(matcher.group());

    }
}

