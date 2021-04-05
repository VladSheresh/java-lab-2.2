package javacources.menu.actions;

import javacources.entitiy.Bouquet;
import javacources.entitiy.Flowers;
import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;
import javacources.menu.MyScanner;

public class AddTulipsToBouquetAction implements Action {
    @Override
    public void execute() {
        Bouquet bouquet =  CreateBouquetContext.getBouquet();
        System.out.print("Введите количество тюльпанов: ");
        int count = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        bouquet.setRoses(bouquet.getTulips() + count);
        bouquet.setPrice(bouquet.getPrice() + Flowers.TULIPS.getPrice() * count);
        System.out.println("Тюльпаны добавлны. Цена букета: " + bouquet.getPrice());
    }
}
