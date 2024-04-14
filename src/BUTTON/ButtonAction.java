
package BUTTON;

import java.awt.*;
import java.awt.event.*;

public class ButtonAction implements ActionListener{
    
    static TextField tf;
    //static Button 
    public static void main(String[] args) {
        
        Frame f=new Frame("ActionListener Example");  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        Button b=new Button("Click Here");  
        b.setBounds(50,100,60,30);  
        //2nd step  
        b.addActionListener(actionPerformed(ActionEvent e)
        {
        
        });  
        f.add(b);f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }
    public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
}  
}
