import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame	{
	public CheckBoxEx() {
		super("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon i = new ImageIcon("C:\\Users\\82109\\Desktop\\공설입 팀플 웹사이트\\website\\index_files\\캠핑장인기사진\\공설입로고.png");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", i);
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
