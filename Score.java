package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(100, 100, 1000, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i5 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel l4 = new JLabel(i6);
        l4.setBounds(680, 200, 300, 250);
        add(l4);
        
        JLabel l2 = new JLabel("Thankyou " + username + " for Playing Simple Minds");
        l2.setBounds(40, 30, 950, 50);
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        l2.setForeground(new Color(30,144 , 254));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.BOLD, 30));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(400, 270, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
