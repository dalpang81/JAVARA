import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Ch11_6 extends JFrame{
    public Ch11_6(){
        setTitle("TextArea Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new GridLayout(2, 1));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        JTextArea textArea = new JTextArea();
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e){
                JSlider sl = (JSlider)e.getSource();
                String text = textArea.getText();
                if(text.length() <= sl.getValue())
                    slider.setValue(text.length());
                else
                    textArea.setText(text.substring(0, sl.getValue()));
            }
        });

        textArea.addKeyListener(new KeyAdapter() {
          public void keyTyped(KeyEvent e){
            JTextArea ta = (JTextArea)e.getSource();
            String text = ta.getText();
            if(text.length() <= 100)
                slider.setValue(text.length());
            else{
                text = text.substring(0, 99);
                textArea.setText(text);
            }
          }  
        });

        c.add(textArea);
        c.add(slider);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ch11_6();
    }
}