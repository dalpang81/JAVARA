import javax.swing.*;
import java.awt.*;

public class Ch9_8 extends JFrame {
    public Ch9_8(){
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();

        JPanel pNorth = new JPanel();
        JPanel pCenter = new JPanel();
        JPanel pSouth = new JPanel();
        
        pNorth.setBackground(Color.LIGHT_GRAY);
        pNorth.add(new JButton("열기"));
        pNorth.add(new JButton("닫기"));
        pNorth.add(new JButton("나가기"));
        c.add(pNorth, BorderLayout.NORTH);

        pCenter.setBackground(Color.RED);
        pCenter.setLayout(null);
        for(int i = 0; i < 10; i++){
            JLabel lCenter = new JLabel("*");
            int x = (int)(Math.random()*250);
            int y = (int)(Math.random()*250);
            lCenter.setLocation(x, y);
            lCenter.setForeground(Color.RED);
            lCenter.setSize(20, 20);
            lCenter.setOpaque(true);
            c.add(lCenter);
        }
        

        pSouth.setBackground(Color.GREEN);
        pSouth.add(new JButton("Word Input"));
        pSouth.add(new JTextField(15));
        c.add(pSouth, BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ch9_8();
    }    
}