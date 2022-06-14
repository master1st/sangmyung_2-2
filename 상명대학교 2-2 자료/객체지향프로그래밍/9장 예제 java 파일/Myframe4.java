import javax.swing.*;
import java.awt.*;

public class Myframe4 extends JFrame {
	public Myframe4()
	{
		setTitle("hello");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JButton clickButton = new JButton("Click");
		clickButton.setSize(100,40);
		clickButton.setLocation(50,50);
		c.add(clickButton);
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
		new Myframe4();
	}

}