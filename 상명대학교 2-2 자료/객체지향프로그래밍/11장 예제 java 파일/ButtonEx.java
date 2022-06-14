import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		super("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon n = new ImageIcon("C:\\Users\\82109\\Desktop\\공설입 팀플 웹사이트\\website\\index_files\\1.jpg");
		ImageIcon b = new ImageIcon("C:\\Users\\82109\\Desktop\\공설입 팀플 웹사이트\\website\\index_files\\캠핑장인기사진\\공설입로고.png");
		ImageIcon v = new ImageIcon("C:\\Users\\82109\\Desktop\\공설입 팀플 웹사이트\\website\\index_files\\캠핑장인기사진\\쇼핑.jpg");
		
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
