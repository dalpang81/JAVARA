import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch10_1 extends JFrame{
    public Ch10_1(){
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("Love Java");
        label.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e){
                JLabel la = (JLabel)e.getSource();
                la.setText("사랑해");
            }
            public void mouseEntered(MouseEvent e){
                JLabel la = (JLabel)e.getSource();
                la.setText("Love Java");
            }
        });

        c.add(label);
        setSize(300, 200);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Ch10_1();
    }
}