// 9 Write a program to create an application which shows the menu.  

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

class MyMenu extends Frame {
    MenuBar bar;
    Menu fileMenu, editMenu, viewMenu;
    MenuItem newItem, openItem, saveItem, exitItem;

    MyMenu(String title) {
        super(title);
        setSize(400, 400);

        // Create MenuBar
        bar = new MenuBar();

        // Create Menus
        fileMenu = new Menu("FILE");
        editMenu = new Menu("EDIT");
        viewMenu = new Menu("VIEW");

        // Create Menu Items for FILE menu
        newItem = new MenuItem("NEW");
        openItem = new MenuItem("OPEN");
        saveItem = new MenuItem("SAVE");
        exitItem = new MenuItem("EXIT");

        // Add Menu Items to FILE menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add Menus to MenuBar
        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(viewMenu);

        // Set the MenuBar to the Frame
        setMenuBar(bar);
    }

    public static void main(String[] args) {
        MyMenu menuApp = new MyMenu("My Menu Application");
        menuApp.setVisible(true);
    }
}
