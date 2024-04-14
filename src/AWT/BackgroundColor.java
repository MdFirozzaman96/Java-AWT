
package AWT;

import java.awt.Frame;
import java.awt.Color;

public class BackgroundColor extends Frame{
    
    Frame f;
    Color c;
    public BackgroundColor()
    {
        f=new Frame();
        
        // Color setting by Color class object :
        /*c=Color.MAGENTA;
        this.setBackground(new Color(50,100,0));*/
        
        // Color setting by constructor : 
        //this.setBackground(new Color(255,0,0));
        
        // Color value in Hexadecimal : 
        this.setBackground(new Color(0xdcba));
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Background Color");
    }
    
    public static void main(String[] args) {
        
        BackgroundColor obj = new BackgroundColor();
    }
    
}
