
package EVENT_HANDLING;

import java.awt.*;
import java.awt.event.*;


public class EHWithinClass extends Frame implements ActionListener {
    
    TextField t;
    EHWithinClass()
    {
        // Create components 
        t = new TextField();
        t.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);
        
        //register listener
        b.addActionListener(this);
        //add components and set size, layout and visibility  
        
        add(t);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void ActionPerformed(ActionEvent e)
    {
        t.setText("Welcome");
    }
    
    public static void main(String[] args) {
        
        new EHWithinClass();
    }
    
}
