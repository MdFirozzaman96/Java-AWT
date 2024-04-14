
package TextArea;

import java.awt.*;


public class CreateTextArea {
    
    
    Frame f;
    TextArea ta;
    CreateTextArea()
    {
        f=new Frame();
        
        ta=new TextArea("This is TextArea.");
        ta.setBounds(50, 100, 200, 200);
        
        f.add(ta);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        
        CreateTextArea obj = new CreateTextArea();
    }
    
}
