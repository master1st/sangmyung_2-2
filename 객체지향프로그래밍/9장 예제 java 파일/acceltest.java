import javax.swing.*;
import java.awt.*;

public class acceltest extends JFrame {
	public acceltest() {
		super("���� �׽�Ʈ 2��°");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JLabel jl = new JLabel("0", SwingConstants.RIGHT);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(4,4));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		jp.add(new JButton("1"));
		c.add(jl,BorderLayout.NORTH);
		c.add(jp,BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String [] args) {
		new acceltest();
	}

}
