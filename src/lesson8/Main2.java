// Полиморфизм - свойство JAVA которое срабатывает в момент запуска программы,
// которое позволяет работать с разными типами данных как с одним и тем же.
//
// Абстрактный класс - класс, объект которого создать нельзя. Могут содержать абстрактные методы.
//
//
//

package lesson8;

public class Main2 {
    public static void main(String[] args) {

//        Animal animal = new Animal();

        Tiger tiger = new Tiger();
        tiger.setName("Вася");
        Tiger tiger1 = new Tiger();
        tiger1.setName("Катя");

//        Object o = new Object();
//
//        System.out.println(tiger);
//
//        System.out.println(tiger.toString());
//

        Monkey monkey1 = new Monkey();
        monkey1.setName("Клава");

        Monkey monkey2 = new Monkey();
        monkey2.setName("Петрович");

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger1;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (int i=0; i<animals.length; i++){
            animals[i].voice();
        }

    }

}
