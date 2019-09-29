package SimpleSwingApp;

import java.awt.*;

public class Test {
    public static Furnace myFurnace= new Furnace();
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new MenuFrame();
            }
        });
    }
}
