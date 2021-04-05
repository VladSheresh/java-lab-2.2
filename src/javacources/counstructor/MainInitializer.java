package javacources.counstructor;

import javacources.entitiy.Bouquet;
import javacources.menu.MenuController;

import java.util.ArrayList;

public class MainInitializer {

    public static void init() {
        initContext();
        initMenu();
    }

    private static void initContext() {
        generateAllBouquets();
    }

    private static void initMenu() {
        MenuController.getInstance().run();
    }

    private static void generateAllBouquets() {
        Context.setAllBouquets(new ArrayList<>());
    }
}
