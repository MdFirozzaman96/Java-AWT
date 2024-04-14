
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

public class KeyAdapterImpl extends Frame implements MouseListener,WindowListener{
    
    public KeyAdapterImpl()
    {
        this.setSize(500,500);
        this.setTitle("Implementation of Mouse Adapter");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(100,80,50));
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent obj)
            {
                System.exit(0);
            }
        });
        
        this.addKeyListener(new KeyAdapter(){
        
            @Override
            public void keyPressed(KeyEvent ke)
            {
                System.out.println("Key Typed : ["+ke.getKeyChar()+"]");
            }
        
        });
        
        this.addWindowListener(this);
        this.addMouseListener(this);
    }
    
    public static void main(String[] args) {
        
        KeyAdapterImpl obj = new KeyAdapterImpl();
    }
    
    
    /// All the abstract method of MouseListener : 
    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse clicked at point : ("+me.getX()+","+me.getY()+")");
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
    
    /// All the abstract method of WindowListener : 
    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Window Opened.");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Wndow Closing.");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Wndow Closed");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Wndow Iconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Window Deiconified.");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Wndow Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Wndow Deactivated.");
    }
    
}
