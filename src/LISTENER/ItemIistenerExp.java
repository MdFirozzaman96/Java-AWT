
package LISTENER;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemIistenerExp extends Frame implements ItemListener{
    
    Label l;
    Checkbox bx1,bx2;
    ItemIistenerExp()
    {
        setSize(500,500);
        setTitle("An example of ItemListener interface.");
        setLayout(null);
        setVisible(true);
        
        l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(300,100);
        
        bx1=new Checkbox("C++");
        bx1.setBounds(50,100,50,50);
        bx2=new Checkbox("Java");
        bx2.setBounds(50,150,50,50);
        
        bx1.addItemListener(this);
        bx2.addItemListener(this);
        
        addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        
        add(l);
        add(bx1);
        add(bx2);
    }
    
    public static void main(String[] args) {
        
        ItemIistenerExp obj = new ItemIistenerExp();
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        
        if(ie.getSource()==bx1)
        {
            l.setText("C++ Checkbox : "+(ie.getStateChange()==1?"Checked":"Unchecked"));
        }
        if(ie.getSource()==bx2)
        {
            l.setText("Java Checkbox : "+(ie.getStateChange()==1?"Checked":"Unchecked"));
        }
    }
    
}
