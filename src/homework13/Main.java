package homework13;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        LinkedList<Integer> collectionA = new LinkedList<>();
        LinkedList<Integer> collectionB = new LinkedList<>();

        collectionA.add(1);
        collectionA.add(1);
        collectionA.add(2);
        collectionA.add(2);
        collectionA.add(3);
        collectionA.add(3);

        collectionB.add(4);
        collectionB.add(4);
        collectionB.add(3);
        collectionB.add(3);
        collectionB.add(2);
        collectionB.add(2);

        System.out.println(collectionA);
        System.out.println(collectionB);
        System.out.println();
        System.out.println("Объединение двух коллекций с дубликатами");
        System.out.println(collectionUtils.union(collectionA, collectionB));
        System.out.println();

        System.out.println("Пересечение двух коллекций с дубликатами");
        System.out.println(collectionUtils.intersection(collectionA, collectionB));
        System.out.println();

        System.out.println("Объединение двух коллекций без дубликатов");
        System.out.println(collectionUtils.unionWithoutDuplicate(collectionA, collectionB));
        System.out.println();

        System.out.println("Пересечение двух коллекций без дубликатов ");
        System.out.println(collectionUtils.intersectionWithoutDuplicate(collectionA,collectionB));
        System.out.println();

        System.out.println(" Разность двух коллекций  ");
        System.out.println(collectionUtils.difference(collectionA,collectionB));
        System.out.println();


    }
}
