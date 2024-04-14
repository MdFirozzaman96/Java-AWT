
package LAYOUT_MANAGERS;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.GridLayout;

public class GridLayoutImpl extends Frame{
    
    Button b1,b2,b3,b4,b5,b6;
    public GridLayoutImpl()
    {
        this.setSize(500,500);
        this.setTitle("Implementation of constructor Grid Layout");
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        });
        
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6); 
        
        this.setLayout(new GridLayout());
        
    }
    
    public static void main(String[] args) {
        
        GridLayoutImpl obj = new GridLayoutImpl();
    }
    
}
