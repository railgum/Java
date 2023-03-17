package Planner;

public abstract class MenuConstructor {
    private String menuItem;

    public MenuConstructor(String menuItem) {
        this.menuItem = menuItem;
    }
    public abstract void run();
}
