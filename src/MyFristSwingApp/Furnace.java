package MyFristSwingApp;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Furnace
{
    public int burnTime=0;
    public BufferedImage image;
    public void addFuel()
    {
    burnTime+=3;
    }
    public Furnace()
    {
        loadImage("icons/furnace.png");

    }
    public void loadImage(String path)
    {
        File imageFile = new File(path);
        try
        {
            image= ImageIO.read(imageFile);
        }
        catch(IOException exception)
        {
            System.err.println("Error while loading image file");
            exception.printStackTrace();

        }
    }
}
