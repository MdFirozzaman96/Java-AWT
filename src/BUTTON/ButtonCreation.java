
package BUTTON;

import java.awt.*;
import java.awt.event.*;

public class ButtonCreation {
    
    Frame f;
    Button b1,b2;
    TextField tf;
    ButtonCreation()
    {
          
        f=new Frame("Creation of Button");
        tf=new TextField();
        b1= new Button("Click Here");
        b2= new Button();
        b2.setLabel("Click Me");
        
        tf.setBounds(100,200,200,50);
        b1.setBounds(50,50,100,40);
        b2.setBounds(50,100,100,40);
        b2.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
                tf.setText("Welcome to Javatpoint.");    
            }    
        });  
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.add(tf);
        f.setLayout(null);
        f.setVisible(true);  
    }
    public static void main(String[] args) {
        
        ButtonCreation obj = new ButtonCreation();
    }
    
}
