import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame	{
	public CheckBoxEx() {
		super("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon i = new ImageIcon("C:\\Users\\82109\\Desktop\\������ ���� ������Ʈ\\website\\index_files\\ķ�����α����\\�����Էΰ�.png");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", i);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(i);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
