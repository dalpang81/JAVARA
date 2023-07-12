import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main extends JFrame{
	private JLabel la = new JLabel("Love Java");
	Main(){
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.addKeyListener(new MyKeyListener());
		la.setFocusable(true);
		la.requestFocus();
		c.add(la);
		setVisible(true);
		setSize(300,150);
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			String txt = la.getText();
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				if(txt.equals("Love Java"))
					la.setText("avaJ evoL");
				else if(txt.equals("avaJ evoL"))
					la.setText("Love Java");
			}
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
