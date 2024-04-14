
package AWT;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;

public class LabelTextField extends Frame{
    
    Label labelUser,labelPassword;
    TextField textUser,textPassword;
    
    public LabelTextField()
    {
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        
        labelUser=new Label("Enter Username : ");
        labelPassword=new Label("Enter Password : ");
        labelUser.setBounds(20,40,100,30);
        labelPassword.setBounds(20,80,100,30);
        
        textUser=new TextField("User Name");
        textPassword=new TextField();
        textUser.setBounds(125,40,150,30);
        textPassword.setBounds(125,80,150,30);
        
        textPassword.setEchoChar('*');
        
        textUser.setEditable(false);
        
        System.out.println(textUser.isEditable());
        
        this.add(labelUser);
        this.add(labelPassword);
        this.add(textUser);
        this.add(textPassword);
        
    }
    
    public static void main(String[] args) {
        
        LabelTextField obj = new LabelTextField();
    }
}
