package 기말시험준비;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		super("BorderLayout Sample");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
		
	}
}

