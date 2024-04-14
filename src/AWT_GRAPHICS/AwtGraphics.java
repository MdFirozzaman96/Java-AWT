
package AWT_GRAPHICS;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class AwtGraphics extends Frame{
    
    Frame f;
    
    public AwtGraphics()
    {
        f=new  Frame();
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
    public void paint(Graphics obj)
    {
        obj.setColor(Color.ORANGE);
        obj.drawString("This is drawString method.",50,50);
        
        obj.drawOval(100,100,5,5);
        obj.fillOval(100,100,60,50);
        
        //obj.drawRect(200,180,50,50);
        obj.fillRect(180,100,50,50);
        
        obj.fillArc(180,200,100,100,40,30);
        
    }
    
    public static void main(String[] args) {
        
        new AwtGraphics();
    }
    
}
