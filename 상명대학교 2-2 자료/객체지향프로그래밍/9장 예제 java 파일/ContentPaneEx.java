import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("c�� j");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new CardLayout());
		
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("�ִٹ�"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
		
		
	}

}
