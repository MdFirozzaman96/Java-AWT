
package LISTENER;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerClass extends Frame{
    
    public WindowListenerClass()
    {
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        
        this.addWindowListener(new WindowListenerImplementation());
    }
    
    public static void main(String[] args) {
        
        WindowListenerClass obj = new WindowListenerClass();
    }
    
}

class WindowListenerImplementation implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Window Opened.");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Wndow Closing.");
        System.exit(0);
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

