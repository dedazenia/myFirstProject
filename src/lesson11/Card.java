package lesson11;

public class Card {
    private String mast;
    private String nominal;
    private int value;


    public Card() {
    }

    public Card(String mast, String nominal, int value) {
        this.mast = mast;
        this.nominal = nominal;
        this.value = value;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        if (!getMast().equals(card.getMast())) return false;
        return getNominal().equals(card.getNominal());
    }

    @Override
    public int hashCode() {
        int result = getMast().hashCode();
        result = 31 * result + getNominal().hashCode();
        result = 31 * result + getValue();
        return result;
    }

    @Override
    public String toString() {
        return "Карта: " + nominal +" " + mast;
    }

}
