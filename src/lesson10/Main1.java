package lesson10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list1.add("jdhjh" + i);


        }
        long endTime=System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList метод add - " +(endTime-startTime));



        long startTime1=System.currentTimeMillis();
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list2.add("jdhjh" + i);


        }
        long endTime1=System.currentTimeMillis();
        System.out.println("Время выполнения LinkedList метод add - " +(endTime1-startTime1));

////////////////////////


        long startTime2=System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list1.get(i);


        }
        long endTime2=System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList метод get - " +(endTime2-startTime2));



        long startTime3=System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list2.get(i);


        }
        long endTime3=System.currentTimeMillis();
        System.out.println("Время выполнения LinkedList метод get - " +(endTime3-startTime3));
    }
}
