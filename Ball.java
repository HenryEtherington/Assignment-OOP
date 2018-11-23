import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import javax.util.Timer;

public  class Ball extends Net {

    private int x, y, dx = 2, dy = 2, delay = 10;
    Timer timer = new Timer(10, new TimerListener());


    Ball() {


        //Initial Ball Position
        x = 595;
        y = 445;

        timer.start();

    }

    private class TimerListener implements ActionListener {

        // Handle the action event

        public void actionPerformed(ActionEvent e) {



            repaint();
        }
    }

    /* UNUSED CODE FOR BUFFERING

     BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/

    //bs.show();

    // repaint();
    //  } */


/* CODE FOR SCORE COUNTER

 while(i<7 && j<7)

 Ball ball =  = b.bounds();
 Userpad pad = p.bounds();
if (ball.intersects(pad.bounds();

     } */


    //Ball Size
    public void paintComponent(Graphics g) {
        //do{
        int j = 0;
        if (x == 0) {

            int i = 0;
            i++;

            //System.out.println(i);

        }

     /* if(j == 1)
      {
      	System.exit(0);
      }*/

        //Ball Speed + Collision with screen;
        if (x == 100) {

            j++;
        }


        if (x < 0) {
            dx = 2;
        }

        if (x >= getWidth())
            dx = -2;

        if (y < 0)
            dy = 2;

        if (y >= getHeight())
            dy = -2;

        x += dx;
        y += dy;


        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);

    }


//NA  Double Buffer image;

    /* public static void main(String[] args) {

        //UserPad p = new UserPad();
        Ball b = new Ball();

        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(p);
        frame.add(b);
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //timer.start();
        b.timer.start(); */
}
