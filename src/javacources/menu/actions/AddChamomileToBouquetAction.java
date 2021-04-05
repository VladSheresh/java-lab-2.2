package javacources.menu.actions;

import javacources.entitiy.Bouquet;
import javacources.entitiy.Flowers;
import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;
import javacources.menu.MyScanner;

public class AddChamomileToBouquetAction implements Action {
    @Override
    public void execute() {
        Bouquet bouquet =  CreateBouquetContext.getBouquet();
        System.out.print("Введите количество ромащек: ");
        int count = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        bouquet.setRoses(bouquet.getChamomile() + count);
        bouquet.setPrice(bouquet.getPrice() + Flowers.CHAMOMILE.getPrice() * count);
        System.out.println("Ромашки добавлны. Цена букета: " + bouquet.getPrice());
    }
}
