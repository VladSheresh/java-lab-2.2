package javacources.entitiy;

public enum Flowers {
    ROSES(1),
    TULIPS(2),
    CHAMOMILE(3),
    LILIES(4);
    private int price;
    Flowers(int price){
        this.price = price;
    }
    public int getPrice(){ return price;}
}
