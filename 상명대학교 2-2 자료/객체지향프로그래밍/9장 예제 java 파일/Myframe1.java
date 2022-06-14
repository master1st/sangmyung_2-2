import javax.swing.*;
import java.awt.*;

public class Myframe1 extends JFrame {
	public Myframe1()
	{
		setTitle("hello");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(3,4));
		c.add(new JButton("click"),BorderLayout.CENTER);
		c.add(new JButton("click"),BorderLayout.NORTH);
		c.add(new JButton("click"),BorderLayout.SOUTH);
		c.add(new JButton("click"),BorderLayout.WEST);
		c.add(new JButton("click"),BorderLayout.EAST);
		
	}
	public static void main(String[] args) {
		new Myframe1();
	}

}
