
package AWT;

import java.awt.Frame;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;



public class ChoiceImplementation extends Frame{
    
    public ChoiceImplementation()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("Implementation of Choice Class.");
        
        Choice ch = new Choice();
        ch.add("C");
        ch.add("C++");
        ch.add("Java");
        ch.add("Python");
        ch.add("PHP");
        ch.add("Javascript");
        
        ch.setBounds(50,50,70,70);
        
        Button b = new Button("Show");
        
        b.setBounds(130,50,70,25);
        
        Label l = new Label();
        l.setBounds(100,100,300,40);
        
        this.add(ch);
        this.add(b);
        this.add(l);
        
        this.addWindowListener(new WindowAdapter(){
        
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String msg="Selected Programming Language : "+ch.getItem(ch.getSelectedIndex());
                l.setText(msg);
            }
            
        });
    }
    
    public static void main(String[] args) {
        
        ChoiceImplementation obj = new ChoiceImplementation();
    }
    
}
