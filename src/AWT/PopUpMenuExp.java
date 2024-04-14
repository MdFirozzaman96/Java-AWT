
package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Panel;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopUpMenuExp{
    
    public PopUpMenuExp()
    {
        final Frame f=new Frame();

        f.setTitle("Implementation of PopupMenu.");
        
        final PopupMenu pum=new PopupMenu("Edit");
        
        MenuItem cut=new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy=new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem peste=new MenuItem("Peste");
        peste.setActionCommand("Peste");
        
        pum.add(cut);
        pum.add(copy);
        pum.add(peste);
        
        f.addMouseListener(new MouseAdapter(){
        
            @Override
            public void mouseClicked(MouseEvent me)
            {
                pum.show(f,me.getX(),me.getY());
            }
        });
        
        f.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        });
        
        Panel pnl=new Panel();
        pnl.setBounds(50,100,300,200);
        pnl.setBackground(new Color(150,100,20));
        
        Button b1=new Button("Button1");
        Button b2=new Button("Button2");
        
        b1.setBounds(70,120,40,30);
        b2.setBounds(70,170,40,30);
        
        // Buttons add to panel : 
        
        pnl.add(b1);
        pnl.add(b2);
        
        f.add(pum);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);
        f.add(pnl);
        
        //pnl.add(pum);
    }
    
    public static void main(String[] args) {
        
        PopUpMenuExp obj = new PopUpMenuExp();
    }
    
}
