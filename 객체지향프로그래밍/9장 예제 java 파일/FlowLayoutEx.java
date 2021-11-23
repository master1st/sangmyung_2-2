import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout Á¤½Ä");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
	
	c.add(new JButton("a"));
	c.add(new JButton("a"));
	c.add(new JButton("a"));
	c.add(new JButton("a"));
	c.add(new JButton("a"));
	
	setSize(300,400);
	setVisible(true);
}

public static void main(String[] args) {
	new FlowLayoutEx();
}
}