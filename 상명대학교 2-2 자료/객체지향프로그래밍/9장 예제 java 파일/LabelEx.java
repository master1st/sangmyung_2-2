import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		
		ImageIcon beauty = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\1.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normallcon = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\1.jpg");
		JLabel label = new JLabel("���� ������ ��ȭ�ϼ���.", normallcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
