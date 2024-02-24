package view;

import utils.Validation;
import java.util.ArrayList;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mChon;
    protected Menu<T> parentMenu;

    public Menu() {
    }

    public Menu(String td, String[] mc) {
        title = td;
        mChon = new ArrayList<>();
        for (String s : mc) {
            mChon.add((T) s);
        }
    }
    
    public void setParentMenu(Menu<T> parentMenu) {
        this.parentMenu = parentMenu;
    }

    public void display() {
        System.out.println(title);
        System.out.println("-------------------------------------");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + "." + mChon.get(i));
        }
        System.out.println("-------------------------------------");

    }

    public int getSelected() {
        display();
        return Validation.getIntFromInput("selection");
    }
    
    public void returnToParentMenu() {
        if (parentMenu != null) {
            parentMenu.run();
        } else {
            System.out.println("Cannot return to parent menu. Parent menu not set.");
        }
    }

//    public void goBack() {
//        if (!menuStack.isEmpty()) {
//            Menu<T> previousMenu = menuStack.pop();
//            previousMenu.run();
//        } else {
//            System.out.println("Cannot go back. No previous menu available.");
//        }
//    }
    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelected();
            execute(n);
            if (n > mChon.size()) {
                break;
            }
        }
    }

}
