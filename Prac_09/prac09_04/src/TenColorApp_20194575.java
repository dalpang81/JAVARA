import javax.swing.*;
import java.awt.*;

class TenColorButtonFrame extends JFrame{
	TenColorButtonFrame(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout gird = new GridLayout(1,10);
		JButton btn[] = new JButton[10];
		
		c.setLayout(gird);
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
				Color.PINK, Color.LIGHT_GRAY };
		
		for(int i=0;i<btn.length;i++) {
			String text=Integer.toString(i);
			btn[i]=new JButton(text);
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);;
			c.add(btn[i]);
		}
		setSize(500,200);
		setVisible(true);
		
	}
}
public class TenColorApp_20194575 {
	public static void main(String[] args) {
			new TenColorButtonFrame();
	}
}
