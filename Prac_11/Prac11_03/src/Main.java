import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private String[] money = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
	private int[] intArray= {50000,10000,1000,500,100,50,10,1};
	private JLabel[] array=new JLabel[8];
	private JTextField input = new JTextField("",10); 
	private JTextField[] result = new JTextField[8];
	public Main() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		 c.setLayout(new BorderLayout(20,10));
		 
		 JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		JLabel la = new JLabel("금액");
		la.setOpaque(false);
		top.add(la);
		
		top.add(input);
		
		JButton calculate = new JButton("계산");
		calculate.addMouseListener(new MyMouseListener());
		top.add(calculate);
		top.setBackground(Color.pink);
		
		JPanel middle = new JPanel();
		middle.setBackground(Color.pink);
		middle.setLayout(new GridLayout(8,2));
		for(int i=0;i<array.length;i++) {
			array[i]= new JLabel(money[i]);
			array[i].setOpaque(false);
			result[i]= new JTextField("");
			middle.add(array[i]);
			middle.add(result[i]);
		}
		c.add(middle, BorderLayout.CENTER);
        c.add(top, BorderLayout.NORTH);
		setSize(300,500);
		setVisible(true);
		c.setBackground(Color.PINK);
		
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			int num=Integer.parseInt(input.getText());
			input.setText("");
			for(int i=0;i<result.length;i++) {
				result[i].setText(Integer.toString(num/intArray[i]));
				num=num%intArray[i];
			}
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
