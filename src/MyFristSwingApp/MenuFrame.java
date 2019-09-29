package MyFristSwingApp;

import javax.swing.*;

class MenuFrame extends JFrame {


    public MenuFrame()
    {
        super("Furnace");
        MenuPanel menuPanel = new MenuPanel();

        add(menuPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

}
