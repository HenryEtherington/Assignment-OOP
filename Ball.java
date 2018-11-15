import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.Timer;

public  class Ball extends JPanel implements ActionListener {


    int x, y;

    Timer timer;


    Ball() {

        //Initial Ball Position
        x = 595;
        y = 445;

        Timer timer = new Timer(10, this);

    }

    // public abstract class MyCanvas extends Canvas {

    public void actionPerformed(ActionEvent e) {
        //Ball Speed


        if (y <= 0 || y >= 800) {
            x -= 2;
            y -= 2;
        } else
            x += 2;
        y += 2;

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/
        repaint();
        //bs.show();

        // repaint();
        //  }

    }


    //Ball Size
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);

    }


//Double Buffer image;



}