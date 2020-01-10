package lesson6;

public class Main {

    public static void main(String[] args) {

        Triangle treyg1= new Triangle();
        Triangle treyg2= new Triangle();
        Triangle treyg3= new Triangle();

//
//        treyg1.color="orange";
//        treyg2.color="green";

        treyg1.setColor("orange");
        treyg2.setColor("green");

        treyg1.setA(2);
        treyg1.setB(3);
        treyg1.setC(4);

        treyg2.setA(3);
        treyg2.setB(3);
        treyg2.setC(4);

        treyg3.setA(4);
        treyg3.setB(3);
        treyg3.setC(4);


        treyg1.print();
        treyg2.print();
        treyg3.print();

        System.out.println(treyg1.perimetr());



    }
}
//                      Три правила ОООП - ТРА ПАРАДИГМЫ:
//        Полиморфизм
//
//        Инкапсуляция - определение доступа к переменным, методам, классам, конструкторам. Модификаторы доступа:
//       public - видимость внутри всего проекта
//       private - видимость внутри текущего класса
//       protected - видимость внутри текущего класса + наследники этого класса
//       _(пусто) -  видимость внутри текущего пакета
//
//        Наследование
//
//        +Абстрация
