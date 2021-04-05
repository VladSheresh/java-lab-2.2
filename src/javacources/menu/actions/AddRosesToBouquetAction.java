package javacources.menu.actions;

import javacources.entitiy.Bouquet;
import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;
import javacources.entitiy.Flowers;
import javacources.menu.MyScanner;

public class AddRosesToBouquetAction implements Action {
    @Override
    public void execute() {
        Bouquet bouquet =  CreateBouquetContext.getBouquet();
        System.out.print("Введите количество роз: ");
        int count = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        bouquet.setRoses(bouquet.getRoses() + count);
        bouquet.setPrice(bouquet.getPrice() + Flowers.ROSES.getPrice() * count);
        System.out.println("Розы добавлны. Цена букета: " + bouquet.getPrice());
    }
}
