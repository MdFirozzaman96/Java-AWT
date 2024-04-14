
package AWT;

import java.awt.Frame;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.Label;
import java.awt.event.ItemEvent;


public class GroupCheckBoxImpl extends Frame{
    
    public GroupCheckBoxImpl()
    {
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Implemetation of group checkbox.");
        //this.setBackground(new Color(100,70,30));
        
        CheckboxGroup cbg=new CheckboxGroup();
        
        Checkbox c1=new Checkbox("C++",cbg,false);
        c1.setBounds(50,100,50,50);
        Checkbox c2=new Checkbox("Java",cbg,true);
        c2.setBounds(50,150,50,50);
        Checkbox c3=new Checkbox("Python",cbg,true);
        c3.setBounds(50,200,50,50);
        
        Label l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,300);
        
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(l);
        
        c1.addItemListener(new ItemIistener(){
        
        
            public void itemStateChanged(ItemEvent e)
            {
                l.setText("C++ checkbox : Checked.");
            }
        
        });
    }
    public static void main(String[] args) {
        
        GroupCheckBoxImpl obj = new GroupCheckBoxImpl();
    }
    
}
