package homework7;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Photo photo1 = new Photo();
        photo1.setPathToSmallPhoto("https://avatars.mds.yandex.net/get-mpic/1644362/img_id8611208476827625779.jpeg/orig");
        photo1.setPathToBigPhoto("https://avatars.mds.yandex.net/img_id8611208476827625779.jpeg/orig");

        Photo photo2 = new Photo();
        photo2.setPathToSmallPhoto("https://avatars.mds.yandex.net/7625779.jpeg/orig");
        photo2.setPathToBigPhoto("https://avatars.mds./orig");


        Otziv otziv1 = new Otziv();
        otziv1.setId(1);
        otziv1.setDatePublish(new Date(2019, 9, 9));
        otziv1.setRaiting(5);
        otziv1.setLike(11);
        otziv1.setDislike(7);
        otziv1.setPlusText("Нет проводов! Форма и удобство ношения, надолго хватает заряда.");
        otziv1.setMinusText("Минимальное шумоподавление, плохой звук у микрофона.");
        otziv1.setComment("Эти наушники я покупала, в первую очередь, для того, чтобы избавиться от проводов с сохранением характеристик обычных наушников от Apple. С этим данные наушники справились на отлично. ");

        User user=new User();
        user.setId(1);
        user.setName("Mark");

        otziv1.setUser(user);


        Otziv otziv2 = new Otziv();
        otziv1.setId(1);
        otziv2.setDatePublish(new Date(2019, 9, 1));
        otziv2.setRaiting(4);
        otziv2.setLike(55);
        otziv2.setDislike(50);
        otziv2.setPlusText("Звук, функционал.");
        otziv2.setMinusText("Цена.");
        otziv2.setComment("Да ладно вам гнать на шумоизоляцию. Это сделано для того, чтобы вас не сбила машина или не размазал по рельсам поезд, пока у вас «бананы в ушах». ");



        Tovar planshet = new Tovar();
        planshet.setFullPrice(8990);
        planshet.setDiscount(22);
        planshet.setName("Наушники АААА-123");
        planshet.addPhoto(photo1);
        planshet.addPhoto(photo2);
        planshet.addOtziv(otziv1);
        planshet.addOtziv(otziv2);


        planshet.printTovar();
        otziv1.printOtziv();
        otziv2.printOtziv();


    }
}
