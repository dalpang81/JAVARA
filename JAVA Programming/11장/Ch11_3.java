import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch11_3 extends JFrame{
    public Ch11_3(){
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new BorderLayout());
        JButton btn = new JButton("계산");
        JTextField textField = new JTextField(10);

        JPanel pNorth = new JPanel();
        pNorth.setLayout(new FlowLayout());
        pNorth.add(new Label("금액"));
        pNorth.add(textField);
        pNorth.add(btn);
        pNorth.setBackground(Color.PINK);

        String sWon[] = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
        int iWon[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        JTextField res[] = new JTextField[8];

        JPanel pCenter = new JPanel();
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int total = Integer.parseInt(textField.getText());
                for(int i = 0; i < sWon.length; i++){
                    res[i].setText(Integer.toString(total/iWon[i]));
                    total %= iWon[i];
                }
            }
        });

        pCenter.setBackground(Color.PINK);
        pCenter.setLayout(new GridLayout(8, 2));
        for(int i = 0; i < sWon.length; i++){
            pCenter.add(new JLabel(sWon[i]));
            res[i] = new JTextField();
            pCenter.add(res[i]);
        }

        c.add(pNorth, BorderLayout.NORTH);
        c.add(pCenter);
        setSize(300, 400);
        setVisible(true);
    }
    public static void main(String[] args){
        new Ch11_3();
    }
}
