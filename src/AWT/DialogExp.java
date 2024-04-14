
package AWT;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExp extends Frame{
    
    public DialogExp()
    {
        Dialog d=new Dialog(this,"Implementation of Dialog",true);
        d.setLayout(new FlowLayout());

        Button b=new Button("Click Here");
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                d.setVisible(false);
            }
            
        });
        d.add(new Label("Click Button to contineue."));
        d.add(b);
        d.setSize(400,400);
        d.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        DialogExp obj = new DialogExp();
    }
    
}
