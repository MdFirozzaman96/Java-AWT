
package LISTENER;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionListenerExp extends Frame implements MouseMotionListener{
    
    Label l;
    
    MouseMotionListenerExp()
    {
        this.setSize(500,500);
        this.setTitle("Implementation of MouseMotionListener Interface.");
        this.setLayout(null);
        this.setVisible(true);
        
        l=new Label();
        l.setBounds(50,50,100,40);
        
        this.add(l);
        this.addMouseMotionListener(this);  
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }
    
    public static void main(String[] args) {
        
        MouseMotionListenerExp obj = new MouseMotionListenerExp();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
        l.setText("X : "+me.getX()+", Y : "+me.getY());
        Graphics g=getGraphics();  
        //g.setColor(Color.RED);  
        g.fillOval(me.getX(),me.getY(),20,20);
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
        l.setText("X : "+me.getX()+", Y : "+me.getY());
    }
    
}
