package javacources.counstructor;

import javacources.entitiy.Bouquet;

import java.util.List;

public class Context {

    private static List<Bouquet> allBouquets;

    public static List<Bouquet> getAllBouquets() {
        return allBouquets;
    }

    public static void setAllBouquets(List<Bouquet> allBouquets) {
        Context.allBouquets = allBouquets;
    }
}
