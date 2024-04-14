
package AWT_BASICS;

import java.awt.*;

public class AWTAssociation {
    
    AWTAssociation()
    {
        Frame f = new Frame();
        Label l = new Label("Employee id : ");
        Button b = new Button("Submit");
        TextField t = new TextField();
        
        // setting position of above components in the frame  
        
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 120, 80, 30);
        b.setBounds(200, 100, 80, 30);
        
        // adding components into frame    
        f.add(l);
        f.add(b);
        f.add(t);
        
        // frame size 400 width and 400 height    
        //f.setSize(400,400);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        AWTAssociation obj = new AWTAssociation();
        
    }
    
}
