package SimpleSwingApp;

import javax.swing.*;
import java.awt.*;

public class ImageLabel extends JLabel
{

    public  ImageLabel()
    {
        super();

        setPreferredSize(new Dimension(300,300));

    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(Test.myFurnace.image,0,0,this);
      //  Graphics2D g2d = (Graphics2D) g;
      //  g2d.drawImage(image, 0, 0, this);
    }
}
