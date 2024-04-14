
package LISTENER;

import java.awt.Frame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerSameClass extends Frame implements WindowListener{
    
    Font f;
    Color c;
    public WindowListenerSameClass()
    {
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        
        f = new Font("Times New Roman",Font.BOLD,14);
        c = new Color(50,50,50);
        this.setBackground(c);
        this.setFont(f);
        this.setTitle("Implementation of Wondow Listener within Class.");
        this.addWindowListener(this);
    }
    public static void main(String[] args) {
        
        WindowListenerSameClass obj = new WindowListenerSameClass();
    }

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
