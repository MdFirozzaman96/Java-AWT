
package AWT_GRAPHICS;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.TextField;


public class FontOnGraphics extends Frame{
    
   public FontOnGraphics()
   {
       
       this.setSize(500,500);
       this.setTitle("Font Class");
       this.setVisible(true);
       this.setLayout(null);
       
       TextField tf = new TextField(5);
       tf.setBounds(50,180,100,30);
       this.add(tf);
       
   }
   
   @Override
   public void paint(Graphics g)
   {
       Font f=new Font("Times New Roman",Font.ITALIC,30);
       Color c = new Color(255,0,0);
       g.setColor(c);
       g.setFont(f);
       
       g.drawString("This Font is Italic Style.",100,70);
       
       g.setColor(Color.BLUE);
       g.fillRect(50,100,50,50);
   }
   
    public static void main(String[] args) {
        
        new FontOnGraphics();
    }
    
}
