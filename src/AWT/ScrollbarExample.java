
package AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.Scrollbar;
import java.awt.event.WindowEvent;
import java.awt.Label;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class ScrollbarExample extends Frame{
    
    public ScrollbarExample()
    {
        this.setVisible(true);
        this.setSize(600,600);
        this.setLayout(null);
        this.setTitle("Implementation of Scrollbar class.");
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
        
        });
        
        Scrollbar sr=new Scrollbar();
        
        sr.setBounds(200,200,40,100);
        
        Label lb = new Label();
        lb.setAlignment(Label.CENTER);
        lb.setSize(400,100);
        
        sr.addAdjustmentListener(new AdjustmentListener(){
        
            @Override
            public void adjustmentValueChanged(AdjustmentEvent ae)
            {
                lb.setText("Vertical srollber value is : "+sr.getValue());
            }
        
        });
        
        this.add(sr);
        this.add(lb);
    }
    
    public static void main(String[] args) {
        
        ScrollbarExample obj = new ScrollbarExample();
    }
    
}
