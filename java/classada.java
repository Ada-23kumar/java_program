import java.awt.*;
import java.awt.event.*;
public class classada extends Frame implements ActionListener
{  
    TextField tf1,tf2;  
    Button b1;
    Label l;

    classada()
    {  
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);  

        tf2=new TextField();  
        tf2.setBounds(50,100,150,20);  

        b1=new Button("Are the numbers Equal?");  
        b1.setBounds(50,150,150,30);  
        
        l=new Label();
        l.setBounds(50,200,200,30);  
                
        b1.addActionListener(this);  
        
        add(tf1);add(tf2);add(b1); add(l);
        
        setSize(250,250);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        System.out.println("NAME"+tf1);
        System.out.println("REG. NO.:- "+tf2);
        if(a==b){  
          l.setText("The Numbers are Equal");
        }else {
          l.setText("The Numbers are NOT Equal");
        }
    }  
    public static void main(String[] args) {  
      new classada();
    }
}
