package �⸻�����غ�;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	public MouseListenerEx() {
		super("Mouse �̺�Ʈ ����");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(null);
		
		c.addMouseListener(new MyMouseListener());
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
	}
	

	
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
