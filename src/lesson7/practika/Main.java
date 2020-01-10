package lesson7.practika;

public class Main {

    public static void main(String[] args) {
        Photo photo1 = new Photo();
        photo1.setPathToSmallPhoto("https://avatars.mds.yandex.net/get-mpic/1644362/img_id8611208476827625779.jpeg/orig");
        photo1.setPathToBigPhoto("https://avatars.mds.yandex.net/img_id8611208476827625779.jpeg/orig");

        Photo photo2 = new Photo();
        photo2.setPathToSmallPhoto("https://avatars.mds.yandex.net/7625779.jpeg/orig");
        photo2.setPathToBigPhoto("https://avatars.mds./orig");






        Tovar planshet = new Tovar();
        planshet.setFullPrice(8990);
        planshet.setDiscount(22);
        planshet.setName("Планшет АААА-123");
        planshet.addPhoto(photo1);
        planshet.addPhoto(photo2);

        planshet.printTovar();





    }
}
