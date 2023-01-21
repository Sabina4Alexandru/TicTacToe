import javax.swing.*;

public class Game {




    public static void main(String[] args) {
        Window maker=new Window();
        JButton[]buttons=maker.makeButtons();
        JFrame frame=maker.makeWindow(buttons);



    }
}
