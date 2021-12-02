import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Backgroundcolor extends JFrame {
	public Backgroundcolor(){
	setTitle("¹è°æ»ö ¹Ù²Ù±â");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JButton jr = new JButton("»¡°­");
	JButton jy = new JButton("³ë¶û");
	jr.addActionListener(new MyActionListener(c));
	jy.addActionListener(new MyActionListener(c));
	c.add(jr);
	c.add(jy);
	
	setSize(350,150);
	setVisible(true);
	}	
	 class MyActionListener implements ActionListener {
		 Container c = getContentPane();
		 public MyActionListener(Container c) {
			 this.c = c;
		 }
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("»¡°­")) {
				c.setBackground(Color.red);
			}
			else {
				c.setBackground(Color.yellow);
			}
		}
	}
	public static void main(String[] args) {
		 new Backgroundcolor();
	}
}
