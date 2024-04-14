
package LABEL;

import java.awt.*;


public class CreateLabel {
    
    public static void main(String[] args) {
        
        Label L1,L2;
        Frame f = new Frame("Creation of Label");
        L1=new Label("Label 1");
        L2=new Label("Label 2");
        
        L1.setBounds(50, 50, 80, 40);
        L2.setBounds(50, 100, 80, 40);
        
        L1.setBackground(Color.RED);
        L2.setBackground(Color.GRAY);
        
        f.setSize(500, 500);
        
        f.add(L1);
        f.add(L2);
        
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
