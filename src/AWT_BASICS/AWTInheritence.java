
package AWT_BASICS;

import java.awt.*;

public class AWTInheritence extends Frame{
    
    // Initializing using constructor.
    AWTInheritence()
    {
        Button b = new Button("Click Me");
        
        // setting button position on screen  
        b.setBounds(150,150,100,50);
        // adding button into frame
        add(b);
        // frame size 400 width and 400 height 
        setSize(400,400);
        // setting the title of Frame  
        setTitle("This is my basic AWT example");
        // no layout manager 
        setLayout(null);
        // Now frame will be visible, by default it is not visible  
        setVisible(true);
        
    }
    public static void main(String[] args) {
        
        AWTInheritence obj = new AWTInheritence();
    }
    
    
}
