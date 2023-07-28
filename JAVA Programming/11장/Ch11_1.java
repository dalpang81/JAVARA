import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch11_1 extends JFrame{
    public Ch11_1(){
        setTitle("CheckBox Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox dButton = new JCheckBox("버튼 비활성화");
        JCheckBox hButton = new JCheckBox("버튼 감추기");
        JButton btn = new JButton("test button");

        c.add(dButton);
        c.add(hButton);
        c.add(btn);

        dButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setEnabled(false);
                else
                    btn.setEnabled(true);
            }
        });

        hButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setVisible(false);
                else
                    btn.setVisible(true);     
            }
        });
        

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ch11_1();
    }
}

