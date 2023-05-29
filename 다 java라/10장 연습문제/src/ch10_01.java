import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class ch10_01 extends JFrame{
	public ch10_01() {
		setTitle("마우스 올리기 내리기");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
	
		
		JLabel jtn = new JLabel("LOVE MS");
		jtn.addMouseListener(new MyMouseListener());
		c.add(jtn);
		
		setSize(350,150);
		setVisible(true);
		
		
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			JLabel b= (JLabel)e.getSource();
			if(b.getText().equals("LOVE MS"))
				b.setText("MS사랑해");
			else
				b.setText("LOVE MS");
		}
	}
	
	public static void main(String[] args) {
		new ch10_01();
	}

}
