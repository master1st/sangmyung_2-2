package �⸻�����غ�;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class indep extends JFrame{
	public indep() {
		setTitle("Action �̺�Ʈ ������ ����");
		setVisible(true);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton jb = new JButton("Action");
		jb.addActionListener(new MyActionListen());
		c.add(jb);
	}
	
	public static void main(String[] args) {
		new indep();
	}

	class MyActionListen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton j = (JButton)e.getSource();
			if(j.getText().equals("Action")) j.setText("�׼�");
			else j.setText("Action");
			indep.this.setTitle(j.getText());
			indep.this.setBackground(new YELLOW);
		}
	}


}