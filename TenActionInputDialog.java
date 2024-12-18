// 10. Write a program for creation of input dialog box.

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TenActionInputDialog extends JApplet implements ActionListener{
   private static final long serialVersionUID = 1L;
    JFrame jf;
    JButton b1;
    JLabel l1;

    public TenActionInputDialog ()
    {
        jf=new JFrame("Demo of an Input dialog box");
        l1= new JLabel();
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new JButton("Name");
        b1.addActionListener(this);
        jf.setSize(350,200);
        jf.add(b1);
        jf.add(l1);
        jf.setVisible(true);
      }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            int i = JOptionPane.QUESTION_MESSAGE;
            String pstr = JOptionPane.showInputDialog(jf, "What is your name?"," Input Dialog Box",i);
            l1.setText("Your name is :" +pstr);
        }
    }
    
    public static  void main(String str[])
    {
        TenActionInputDialog aid = new TenActionInputDialog(); 

    }
}
