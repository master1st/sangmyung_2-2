import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClass extends JFrame {
	public IndepClass() {
		super("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("�׼�");
				}
				else {
					b.setText("Action");	
				}

			}
		});
		setSize(300,400);
		setVisible(true);
}
	public static void main(String[] args) {
		new IndepClass();
	}
}

	