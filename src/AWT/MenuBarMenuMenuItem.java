
package AWT;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;


public class MenuBarMenuMenuItem extends Frame{
    
    public MenuBarMenuMenuItem()
    {
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Menu");
        
        MenuItem i1=new MenuItem("Item1");
        MenuItem i2=new MenuItem("Item2");
        MenuItem i3=new MenuItem("Item3");
        MenuItem i4=new MenuItem("Item4");
        MenuItem i5=new MenuItem("Item5");
        
        menu.add(i1);
        menu.add(i2);
        
        Menu sm=new Menu("Sub Menu");
        menu.add(sm);
        sm.add(i4);
        sm.add(i5);
        mb.add(menu);
        
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("Implementation of Menu,MenuItem and MenuBar");
        this.setMenuBar(mb);
        
        
    }
    
    public static void main(String[] args) {
        
        MenuBarMenuMenuItem obj = new MenuBarMenuMenuItem();
    }
    
}
