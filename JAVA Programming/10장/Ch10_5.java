import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch10_5 extends JFrame{
    int size = 5;
    public Ch10_5(){
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, size));

        
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ADD){
                    size += 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                } else if(e.getKeyCode() == KeyEvent.VK_MINUS){
                    size -= 5;
                    label.setFont(new Font("Arial", Font.PLAIN, size));
                }
            }
        });

        c.add(label);
        c.setFocusable(true);
        c.requestFocus();
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ch10_5();
    }
}