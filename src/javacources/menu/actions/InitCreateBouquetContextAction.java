package javacources.menu.actions;

import javacources.counstructor.Context;
import javacources.entitiy.Bouquet;
import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;

public class InitCreateBouquetContextAction implements Action {

    @Override
    public void execute() {
        Bouquet bouquet = new Bouquet();
        if (!CreateBouquetContext.isCreating()) {
            CreateBouquetContext.setBouquet(bouquet);
            Context.getAllBouquets().add(bouquet);
            CreateBouquetContext.setCreating(true);
        }
    }
}
