package javacources.entitiy;


import java.util.List;

public class Bouquet {

    private int price; // цена букета
    private int roses; // количество роз
    private int tulips; // количество тюльпанов
    private int chamomile; // количество ромашек
    private int lilies; // количество лилии

    public int getRoses() {
        return roses;
    }

    public void setRoses(int roses) {
        this.roses = roses;
    }

    public int getTulips() {
        return tulips;
    }

    public void setTulips(int tulips) {
        this.tulips = tulips;
    }

    public int getChamomile() {
        return chamomile;
    }

    public void setChamomile(int chamomile) {
        this.chamomile = chamomile;
    }

    public int getLilies() {
        return lilies;
    }

    public void setLilies(int lilies) {
        this.lilies = lilies;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
