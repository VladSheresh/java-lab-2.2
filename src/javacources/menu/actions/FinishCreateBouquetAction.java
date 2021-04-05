package javacources.menu.actions;

import javacources.menu.Action;
import javacources.menu.CreateBouquetContext;

public class FinishCreateBouquetAction implements Action {
    @Override
    public void execute() {
        CreateBouquetContext.setCreating(false);
    }
}
