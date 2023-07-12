import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main extends JFrame{
	private JLabel la = new JLabel("Java Love");
	public Main() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.addMouseListener(new MyMouseListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel label = (JLabel)e.getSource();
			if(label.getText().equals("Java Love"))
				label.setText("사랑해");
		}
		public void mouseExited(MouseEvent e) {
			JLabel label = (JLabel)e.getSource();
			if(label.getText().equals("사랑해"))
				label.setText("Java Love");
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
