package �⸻�����غ�;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mouseAdapter extends JFrame{
	public JLabel jl = new JLabel("����");
	public mouseAdapter() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,300);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseListener(new MouseListen());
		c.add(jl);
	}
	
	class MouseListen extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			jl.setLocation(x,y);
			jl.setText("("+x+","+y+")");
		}
		
	}
	
	
	public static void main(String[] args) {
		new mouseAdapter();
	}
}
