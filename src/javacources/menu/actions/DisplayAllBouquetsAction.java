package javacources.menu.actions;

import javacources.counstructor.Context;
import javacources.entitiy.Bouquet;
import javacources.menu.Action;

public class DisplayAllBouquetsAction implements Action {

    @Override
    public void execute() {
        if(!Context.getAllBouquets().isEmpty()){
            System.out.println("Собранные букеты: ");
            for (Bouquet bouquet:Context.getAllBouquets()) {
                System.out.println("Цена букета: " + bouquet.getPrice());
                System.out.println("Количество роз: " + bouquet.getRoses());
                System.out.println("Количество тюльпанов: " + bouquet.getTulips());
                System.out.println("Количество ромашек: " + bouquet.getChamomile());
                System.out.println("Количество лилий: " + bouquet.getLilies());
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }
}
