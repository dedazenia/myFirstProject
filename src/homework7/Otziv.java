package homework7;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Otziv {
    private int id;
    private User user;
    private Date datePublish;
    private int raiting;
    private int like;
    private int dislike;
    private String plusText;
    private String minusText;
    private String comment;

    public Otziv() {
    }

    public Otziv(int id, User user, Date datePublish, int raiting, int like, int dislike, String plusText, String minusText, String comment) {
        this.id = id;
        this.user = user;
        this.datePublish = datePublish;
        this.raiting = raiting;
        this.like = like;
        this.dislike = dislike;
        this.plusText = plusText;
        this.minusText = minusText;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatePublish() {
        return datePublish;
    }


    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getPlusText() {
        return plusText;
    }

    public void setPlusText(String plusText) {
        this.plusText = plusText;
    }

    public String getMinusText() {
        return minusText;
    }

    public void setMinusText(String minusText) {
        this.minusText = minusText;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void averageRaiting(int raiting) {

    }

    public void printOtziv() {
        System.out.println();
        System.out.printf("Оценка - %d", raiting);
        System.out.println();
        System.out.printf("Отзыв: Плюсы - %s.", plusText);
        System.out.println();
        System.out.printf("Недостатки - %s.", minusText);
        System.out.println();
        System.out.printf("Комментарий - %s.", comment);
        System.out.println();
        System.out.printf("Like - %d. Dislike - %d.", like, dislike);
        System.out.println();
        System.out.printf("Опубликовано %s", datePublish);
        System.out.println();

    }


}

