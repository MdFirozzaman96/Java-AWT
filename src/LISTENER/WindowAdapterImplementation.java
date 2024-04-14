
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterImplementation extends Frame{
    
    public WindowAdapterImplementation()
    {
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(4,5,7));
        this.setTitle("Implementation of Window Adapter Class");
        
        Font f = new Font("Times New Roman",Font.ROMAN_BASELINE,20);
        this.setFont(f);
        
        this.addWindowListener(new Implementation());
    }
    
    public static void main(String[] args) {
        
        WindowAdapterImplementation obj = new WindowAdapterImplementation();
    }

}

class Implementation extends WindowAdapter{
    
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing");
        System.exit(0);
    }
}
