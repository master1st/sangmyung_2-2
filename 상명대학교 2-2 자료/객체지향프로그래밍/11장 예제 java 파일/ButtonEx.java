import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		super("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon n = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\1.jpg");
		ImageIcon b = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\ķ�����α����\\�����Էΰ�.png");
		ImageIcon v = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\ķ�����α����\\����.jpg");
		
		JButton btn = new JButton("call~~", n);
		btn.setPressedIcon(b);
		btn.setRolloverIcon(v);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}
