
package AWT;

import java.awt.*;

public class CreateCheckBox {
    
    Frame f;
    Checkbox bx1,bx2;
    
    public CreateCheckBox()
    {
        f=new Frame();
        
        bx1=new Checkbox("C++",true);
        bx2=new Checkbox("Java");
        
        bx1.setBounds(40,50,50,50);
        bx2.setBounds(40,100,50,50);
        
        f.add(bx1);
        f.add(bx2);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new CreateCheckBox();
        
    }
    
}
