
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CloseFrameByWindowAdapter extends Frame{
    
    public CloseFrameByWindowAdapter()
    {
        this.setSize(500,500);
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
    }
    
    public static void main(String[] args) {
        
        CloseFrameByWindowAdapter obj = new CloseFrameByWindowAdapter();
    }
    
}
