import javax.swing.*;
public class Password{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Password Field exaple");
        JPasswordField value=new JPasswordField();
        JLabel lb=new JLabel("Password:");
        lb.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        f.add(value);
        f.add(lb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}