import javax.swing.*;
import java.awt.*;

public class Ch9_4 extends JFrame {
    public Ch9_4(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        Color [] colors = {Color.RED, Color.ORANGE, Color.YELLOW, 
                            Color.GREEN, Color.CYAN, Color.BLUE,
                             Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

        c.setLayout(new GridLayout(1, 10));
        for(int i = 0; i <= 9; i++){
            JButton b = new JButton(Integer.toString(i));
            b.setBackground(colors[i]);
            c.add(b);
        }

        setSize(1000, 300);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ch9_4();
    }    
}