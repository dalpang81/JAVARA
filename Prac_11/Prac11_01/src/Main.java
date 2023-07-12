import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Main extends JFrame{
	private JButton btn = new JButton("test button");
	private JCheckBox[] order = new JCheckBox[2];
	private String [] names = {" 버튼 비활성화","버튼 감추기"};
	public Main() {
		setTitle("CheckBox Practice ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyItemListener listener =new MyItemListener();
		for(int i=0;i<order.length;i++) {
			order[i]= new JCheckBox(names[i]);
			c.add(order[i]);
			order[i].addItemListener(listener);
		}
		c.add(btn);
		setSize(300,300);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==order[0]) {
					btn.setEnabled(false);
				}
				if(e.getItem()==order[1])
					btn.setVisible(false);
			}else {
				if(e.getItem()==order[0]) {
					btn.setEnabled(true);
				}
				if(e.getItem()==order[1])
					btn.setVisible(true);
			}
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
