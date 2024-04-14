
package AWT;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Image;


public class ToolkitExp extends Frame{
    
    public ToolkitExp()
    {
        Toolkit tk=Toolkit.getDefaultToolkit();
        System.out.println("Sreen resolution : "+tk.getScreenResolution());
        Dimension d=tk.getScreenSize();
        System.out.println("Width : "+d.getWidth());
        System.out.println("Height : "+d.getHeight());
        
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("AWT Toolkit Class");
        
        Button b=new Button("beep");
        b.setBounds(100,100,50,40);
        b.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Toolkit.getDefaultToolkit().beep();
            }
        });
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
        this.add(b);
        
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\IMG_20200310_174516.jpg");
        this.setIconImage(icon);
    }
    
    public static void main(String[] args) {
        
        ToolkitExp obj = new ToolkitExp();
    }
    
}
