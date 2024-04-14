
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;


public class MouseListenerImpl extends Frame implements MouseListener{
    
    public MouseListenerImpl()
    {
        this.setSize(500,500);
        Font f = new Font("Times New Roman",Font.ITALIC,15);
        this.setFont(f);
        this.setTitle("Implementation of Mouse Listener");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(50,100,30));
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            
        });
        this.addMouseListener(this);
    }
    
    public static void main(String[] args) {
        
        MouseListenerImpl obj = new MouseListenerImpl();
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse clicked at point : ("+me.getX()+","+me.getY()+")");
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(me.getX(),me.getY(),40,40);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Mouse pressed at point : ("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Mouse released at point : ("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse entered at point : ("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse clicked at point : ("+me.getX()+","+me.getY()+")");
    }
    
}
