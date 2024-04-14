
package TextArea;

import java.awt.*;
import java.awt.event.*;

public class TextAreaActionListener implements ActionListener{
    
    Frame f;
    Label l1,l2;
    Button b;
    TextArea ta;
    
    public TextAreaActionListener ()
    {
        f=new Frame();
        
        ta =new TextArea();
        ta.setBounds(100, 200, 250, 150);
        
        l1=new Label();
        l2=new Label();
        
        l1.setBounds(50,40,120,50);
        l2.setBounds(250,40,120,50);
        
        b=new Button("Click Here");
        b.setBounds(130,100,100,40);
        b.addActionListener(this);
        
        f.add(ta);
        f.add(l1);
        f.add(l2);
        f.add(b);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
         String str=ta.getText();
         String word[]=str.split("\\s");
         
         l1.setText("Character Length : "+str.length());
         l2.setText("Word Numbers : "+(word.length-1));
    }
    
    public static void main(String[] args) {
        
        TextAreaActionListener obj = new TextAreaActionListener();
    }
    
}
