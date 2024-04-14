
package LISTENER;

import java.awt.Frame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyListener;
import java.awt.TextArea;
import java.awt.Label;

public class KeyListenerImplementation extends Frame implements KeyListener{
    
    TextArea ta;
    Label lb,lbn;
    public KeyListenerImplementation()
    {
        this.setSize(800,700);
        this.setTitle("Implementation of Key Listener");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(new Color(100,70,0));
        this.setLocationRelativeTo(null);
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent obj)
            {
                System.exit(0);
            }
        });
        //this.addKeyListener(this);
        
        ta=new TextArea();
        ta.setBounds(300,150,300,200);
        ta.addKeyListener(this);
        
        lb=new Label();
        lb.setBounds(100,50,200,40);
        lbn=new Label();
        lbn.setBounds(100,80,250,40);
        
        this.add(ta);
        this.add(lb);
        this.add(lbn);
    }
    
    public static void main(String[] args) {
        
        KeyListenerImplementation obj = new KeyListenerImplementation();
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
        System.out.println("Key Typed : ["+ke.getKeyChar()+"]");
        lb.setText("KeyTyped.");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println("Key Pressed : ["+ke.getKeyChar()+"]");
        lb.setText("KeyPressed.");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("Key Relesed : ["+ke.getKeyChar()+"]");
        lb.setText("KeyReleased.");
        
        String text=ta.getText();
        String word[]=text.split("\\s");
        int w=word.length;
        lbn.setText("Charecters:"+(text.length()-w+1)+", Words:"+w);
    }
    
    
}
