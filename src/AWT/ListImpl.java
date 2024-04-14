
package AWT;

import java.awt.Frame;
import java.awt.List;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListImpl extends Frame{
    
    Button b;
    Label l;
    public ListImpl()
    {
        this.setVisible(true);
        this.setSize(600,600);
        this.setLayout(null);
        this.setTitle("Implementation of Choice Class.");
        
        this.addWindowListener(new WindowAdapter(){
        
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        });
        
        List ls = new List();
        List ls1 =new List(4,true);
        
        ls.setBounds(80,100,70,60);
        ls1.setBounds(80,180,70,70);
        
        ls.add("C");
        ls.add("C++");
        ls.add("Java");
        ls.add("Pyhton");
        
        ls1.add("AWT");
        ls1.add("Applet");
        ls1.add("Swing");
        ls1.add("Tensorflow");
        
        b=new Button("Show");
        b.setBounds(180,100,50,30);
        
        l=new Label();
        l.setBounds(50,250,500,50);
        
        b.addActionListener(new ActionListener(){
        
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String msg="Popular programming language : "+ls.getItem(ls.getSelectedIndex());
                msg+=", Selected Freamework : ";
                for(String item:ls1.getSelectedItems())
                {
                    msg+=item+",";
                }
                l.setText(msg);
            }
        
        });
        
        this.add(ls);
        this.add(b);
        this.add(l);
        this.add(ls1);
    }
    
    public static void main(String[] args) {
        
        ListImpl obj = new ListImpl();
    }
    
}
