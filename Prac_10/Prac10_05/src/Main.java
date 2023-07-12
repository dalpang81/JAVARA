import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JLabel la = new JLabel("Love Java");
    private int pixel = 5;

    Main() {
        setTitle("+,-키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        la.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(la);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new MyKeyListener());
        setVisible(true);
        setSize(300, 150);
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            Font f = la.getFont();
            int size = f.getSize();
            if (e.getKeyCode() == KeyEvent.VK_PLUS|| e.getKeyCode()==KeyEvent.VK_EQUALS)
                la.setFont(new Font("Arial", Font.PLAIN, size + pixel));
            else if (e.getKeyCode() == KeyEvent.VK_MINUS)
                la.setFont(new Font("Arial", Font.PLAIN, size - pixel));
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
