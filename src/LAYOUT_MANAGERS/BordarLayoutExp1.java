
package LAYOUT_MANAGERS;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.BorderLayout;

public class BordarLayoutExp1 extends Frame{
    
    Button bn,bs,be,bw,bc;
    public BordarLayoutExp1()
    {
        BorderLayout bl = new BorderLayout(20,20);
        this.setLayout(bl);
        this.setSize(500,500);
        this.setTitle("Bordar Layout Class");
        this.setBackground(new Color(0x009270));
        this.setLayout(null);
        this.setVisible(true);
        
        bn=new Button("North");
        bs=new Button("South");
        be=new Button("East");
        bw=new Button("West");
        bc=new Button("Center");
        
        this.add(bn,BorderLayout.NORTH);
        this.add(bs,BorderLayout.SOUTH);
        this.add(be,BorderLayout.EAST);
        this.add(bw,BorderLayout.WEST);
        this.add(bc,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        
        BordarLayoutExp1 obj = new BordarLayoutExp1();
    }
    
}