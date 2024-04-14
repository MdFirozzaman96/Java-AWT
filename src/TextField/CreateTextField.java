
package TextField;

import java.awt.*;
import java.awt.event.*;

public class CreateTextField implements ActionListener{
    
    Frame f;
    TextField tf1,tf2;
    
    CreateTextField()
    {
        f = new Frame();
        
        tf1=new TextField();
        tf2=new TextField();
        
        tf1.setBounds(100, 50, 80, 40);
        tf2.setBounds(100, 100, 80, 40);
        
        tf1.addActionListener(this);
        
        f.add(tf1);
        f.add(tf2);
        
        f.setSize(500,500);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String str=tf1.getText();
        System.out.println(str);
    }
    public static void main(String[] args) {
        
        new CreateTextField();
    }
}
