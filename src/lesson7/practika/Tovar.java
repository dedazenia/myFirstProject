package lesson7.practika;

public class Tovar {
    private int articul;
    private String name;
    private int fullPrice;
    private int discount;
    private Photo[] photos = new Photo[20];
    private Otziv[] otziv = new Otziv[2000];

    public Tovar() {
    }

    public Tovar(int articul, String name, int fullPrice, int discount) {
        this.articul = articul;
        this.name = name;
        this.fullPrice = fullPrice;
        this.discount = discount;
    }

    public void addPhoto(Photo photo) {
        for (int i=0; i < photos.length; i++) {
            if (photos[i] == null) {
                photos[i] = photo;
                break;
            }

        }

    }

    public int getArticul() {
        return articul;
    }

    public void setArticul(int articul) {
        this.articul = articul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Otziv[] getOtziv() {
        return otziv;
    }

    public void setOtziv(Otziv[] otziv) {
        this.otziv = otziv;
    }


    public void printTovar() {
        System.out.printf("Товар: %s, цена полная - %d, скидка - %d", name, fullPrice, discount);
        System.out.println();
        for (Photo photo : photos) {
            if (photo != null) {
                System.out.printf("Фото: путь к фото 1 - %s, путь к фото 2 - %s", photo.getPathToSmallPhoto(), photo.getPathToBigPhoto());

                System.out.println();
            }


        }
    }
}
