package Nauka;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Rysowanie");
        JPanel panel = new MyPanel();

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}