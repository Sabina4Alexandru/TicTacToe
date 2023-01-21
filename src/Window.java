import javax.swing.*;
import java.awt.*;

public class Window {
    public JFrame makeWindow(JButton[] buttons){
        JFrame frame=new JFrame();
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.setSize(800,800);

        JTextArea textArea=new JTextArea();
        textArea.setPreferredSize(new Dimension(800,100));
    panel.add(textArea);
        for (int i = 0; i < 9; i++) {

            buttons[i].setPreferredSize(new Dimension(200, 200));
            buttons[i].setText("");
            panel.add(buttons[i]);
        }


        frame.setSize(800, 800
       );

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;

    }

    public JButton[] makeButtons(){
        JButton[]buttons=new JButton[9];
        return buttons;
    }


}
