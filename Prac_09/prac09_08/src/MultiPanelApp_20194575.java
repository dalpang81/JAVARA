import javax.swing.*;
import java.awt.*;
class NorthPanel extends JPanel{
	NorthPanel(){
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class SouthPanel extends JPanel{
	SouthPanel(){
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word input"));
		add(new JTextField(15));
	}
}
class CenterPanel extends JPanel{
	CenterPanel(){
		setBackground(Color.WHITE);
		setLayout(null);
		for(int i=0;i<10;i++) {
			JLabel j = new JLabel("*");
			j.setLocation((int)(Math.random()*250+10),(int)(Math.random()*250+10));
			j.setSize(20,20);
			j.setForeground(Color.RED);
			add(j);
		}
	}
}
class MultiPanelFrame extends JFrame{
	MultiPanelFrame(){
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		setSize(320,320);
		setVisible(true);
	}
}
public class MultiPanelApp_20194575 {
	public static void main(String[] args) {
		new MultiPanelFrame();
	}
}
