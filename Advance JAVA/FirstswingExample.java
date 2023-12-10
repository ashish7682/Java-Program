import javax.swing.*;
public class FirstswingExample
{
    public static void main(String args[])
    {
    JFrame f= new JFrame();   //cerating instance of jframe
    JButton b=new JButton("click");  //creating instance of jbutton
    b.setBounds(130,100,100,40);   //x-axis,y-axis,width,height
    f.add(b);//adding  button in jframe
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);

    }
}