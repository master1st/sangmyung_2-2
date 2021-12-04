import javax.swing.*;
import java.awt.*;

public class Myframe2 extends JFrame {
	public Myframe2()
	{
		setTitle("hello");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.RIGHT,3,4));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		c.add(new JButton("click"));
		
	}
	public static void main(String[] args) {
		new Myframe2();
	}

}