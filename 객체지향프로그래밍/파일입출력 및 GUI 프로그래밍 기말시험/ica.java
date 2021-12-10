package ±‚∏ªΩ√«Ë¡ÿ∫Ò;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ica extends JFrame{
	public ica() {
		super("ππ∂Û∞Ì");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("ππ∑œ");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("ππ∑œ")) {
					ica.this.setBackground(Color.black);
					b.setText("≥¢∑œ");}
				else {
					b.setText("ππ∑œ");
				}
				ica.this.setTitle(b.getText());
				
			}
		});
	}
public static void main(String[] args) {
	new ica();	
	}

}
