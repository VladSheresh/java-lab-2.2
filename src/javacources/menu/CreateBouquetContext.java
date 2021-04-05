package javacources.menu;

import javacources.entitiy.Bouquet;

public class CreateBouquetContext {
    private static Bouquet bouquet;
    private static boolean creating;

    public static boolean isCreating() {
        return creating;
    }

    public static void setCreating(boolean creating) {
        CreateBouquetContext.creating = creating;
    }

    public static void setBouquet(Bouquet bouquet) {
        CreateBouquetContext.bouquet = bouquet;
    }

    public static Bouquet getBouquet() {
        return bouquet;
    }
}
