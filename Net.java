import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Abstract method
public  class Net extends ComPad implements ActionListener {


    public void Net(Graphics g, int xVel, int yVel, int width, int height) {

        g.drawRect(xVel, yVel, width, height);

    }

    int x = 0, y = 450;

    //Timer timer;
    //lock area gui
    //if off screen error!
//Reference Me

    Net() {
//Initial paddle position

        //timer = new Timer(10, this);
    }


    //  public class MyCanvas extends Canvas  {

    public void actionPerformed(ActionEvent e) {
        //paddle moves up or down;

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/
        repaint();
        //bs.show();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Net(g, x, y, 1980, 1);

    }
}
