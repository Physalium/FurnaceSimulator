package MyFristSwingApp;

import com.sun.jdi.IntegerType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.time.LocalTime;
import java.util.TimerTask;

public class MenuPanel extends JPanel implements ActionListener
{
    static final int HEIGHT=350;
    static final int WIDTH=500;
    private JButton addCoal;
    private JButton ignite;
    private JButton currentFuel;
    private ImageLabel imageLabel= new ImageLabel();
    public Clock clock;

    MenuPanel()
    {
        currentFuel =new JButton();
        currentFuel.setText("Current fuel: "+Test.myFurnace.burnTime);
        addCoal=new JButton("Add coal");
        ignite=new JButton("Ignite");
        addCoal.addActionListener(this);
        ignite.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        imageLabel= new ImageLabel();
        add(imageLabel);
        add(addCoal);
        add(ignite);
        add(currentFuel);

    }
    class Burning implements Runnable
    {

        public void run(){
            try
            {

                Thread.sleep(Test.myFurnace.burnTime*1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("yea");
            Test.myFurnace.loadImage("icons/furnace.png");
            imageLabel.validate();
            imageLabel.repaint();
        }

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source=e.getSource();

        if(source==addCoal)
        {
        Test.myFurnace.addFuel();
        currentFuel.setText("Current fuel: "+ Test.myFurnace.burnTime  );
        }
        else
        {
            Burning currentBurning= new Burning();
            Thread burningThread=new Thread(currentBurning);
            burningThread.start();
        Test.myFurnace.loadImage("icons/furnace_lit.png");
        Test.myFurnace.burnTime=0;
        currentFuel.setText("Current fuel: " + Test.myFurnace.burnTime);
        imageLabel.validate();
        imageLabel.repaint();

        }
    }
}
