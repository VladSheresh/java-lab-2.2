package javacources.menu.actions;

import javacources.entitiy.Bouquet;
import javacources.entitiy.Flowers;
import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;
import javacources.menu.MyScanner;

public class AddLiliesToBouquetAction implements Action {
    @Override
    public void execute() {
        Bouquet bouquet =  CreateBouquetContext.getBouquet();
        System.out.print("Введите количество лилий: ");
        int count = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        bouquet.setRoses(bouquet.getLilies() + count);
        bouquet.setPrice(bouquet.getPrice() + Flowers.LILIES.getPrice() * count);
        System.out.println("Лилии добавлны. Цена букета: " + bouquet.getPrice());
    }
}
