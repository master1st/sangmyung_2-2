import javax.swing.*;
import java.awt.*;

public class Myframe3 extends JFrame {
	public Myframe3()
	{
		setTitle("hello");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,2,7,8));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		
	}
	public static void main(String[] args) {
		new Myframe3();
	}

}