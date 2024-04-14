
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class MouseAdapterImplementation extends Frame{
    
    public MouseAdapterImplementation()
    {
        this.setSize(500,500);
        this.setTitle("Implementation of Mouse Adapter");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(100,80,50));
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        });
        this.addMouseListener(new MouseAdapter(){
        
        
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mouse Clicked at Point : ["+e.getX()+","+e.getY()+"]");
            }
        });
    }
    
    public static void main(String[] args) {
        
        MouseAdapterImplementation obj = new MouseAdapterImplementation();
    }
    
}
