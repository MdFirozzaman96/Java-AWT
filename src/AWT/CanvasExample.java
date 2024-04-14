
package AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class CanvasExample extends Frame{
    
    public CanvasExample()
    {
        this.setVisible(true);
        this.setSize(600,600);
        this.setLayout(null);
        this.setTitle("Implementation of Canvas Class.");
        
         this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        });
        
        this.add(new MyCanvas());
    }
    
    public static void main(String[] args) {
        
        CanvasExample obj = new CanvasExample();
    }
    
}

class MyCanvas extends Canvas{
    
    public MyCanvas()
    {
        this.setBackground(Color.GRAY);
        this.setSize(300,200);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(75, 75, 150, 75);
    }
    
}
