package javacources.menu;

import javacources.menu.actions.*;

public class MenuBuilder {

    public Menu mainMenu;
    public Menu creatBouquet;

    private static MenuBuilder instance;

    private MenuBuilder() {
        buildMenu();
    }

    public static MenuBuilder getInstance() {
        if (instance == null) {
            instance = new MenuBuilder();
        }
        return instance;
    }

    public void buildMenu() {
        mainMenu = new Menu("Main");
        creatBouquet = new Menu("Собрать букект");
        mainMenuInit();
        createShipsInit();

        Navigator.getInstance().setCurrentMenu(mainMenu);
    }

    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Собрать букект", new InitCreateBouquetContextAction(), creatBouquet));
        mainMenu.getMenuItems().add(new MenuItem("2. История букетов", new DisplayAllBouquetsAction()));
        mainMenu.getMenuItems().add(new MenuItem("3. Выйти из программы", new ExitAction()));

    }
    public void createShipsInit() {
        creatBouquet.getMenuItems().add(new MenuItem("1. Завершить сборку букета", new FinishCreateBouquetAction(), mainMenu));
        creatBouquet.getMenuItems().add(new MenuItem("2. Добавить розы в букет", new AddRosesToBouquetAction()));
        creatBouquet.getMenuItems().add(new MenuItem("3. Добавить тюльпаны в букет", new AddTulipsToBouquetAction()));
        creatBouquet.getMenuItems().add(new MenuItem("4. Добавить ромашки в букет", new AddChamomileToBouquetAction()));
        creatBouquet.getMenuItems().add(new MenuItem("5. Добавить лилии в букет", new AddLiliesToBouquetAction()));
    }

}
