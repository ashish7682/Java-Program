import javax.swing.*;
public class SwingByInheritance extends JFrame
{
    JFrame f;
    SwingByInheritance()
    {
        JButton b=new JButton("click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new SwingByInheritance();
        
    }

}