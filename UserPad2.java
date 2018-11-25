//UserPa2.java
/*Allows top user paddle to appear in game
* @author Henry Etherington*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Abstract method
public  class UserPad2 extends JPanel  implements KeyListener   {

/*Collision detection
https://www.youtube.com/watch?v=yge4GBkQsvw*/

    public void UserPad2(Graphics g, int xVel, int yVel, int width, int height) {

        g.drawRect(xVel, yVel, width, height);
        g.dispose();
    }

    private int x, y, widTH, heigHT;
    Timer timer = new Timer(10, new UserPad2.TimerListener());


    UserPad2() {

    //Initial top paddle position
      x = 1075;
      y = 10;

      timer.start();
      addKeyListener(this);
      setFocusable(true);
      setFocusTraversalKeysEnabled(false);
    }


    //  public class MyCanvas extends Canvas  {
    private class TimerListener implements ActionListener {

        // Handle the action event

        public void actionPerformed(ActionEvent e) {
            //paddle moves up or down;

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/

            //collision();
            repaint();
            //bs.show(); }

        }
    }

    public void paintComponent(Graphics g) {


        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect( x, y, 200, 10);

        //if(collision)
         //   g.drawString("Collision",350,150);

    }


    boolean collision(int ballxpos, int ballypos, int ballwidth, int ballheight) {

        if ((ballxpos + ballwidth < x || ballxpos > x + widTH)
                || (ballypos + ballheight < y || ballypos > y + heigHT)) {
            return false;
        } else {
            return true;
        }
    }
     //Collision detection
    //https://www.youtube.com/watch?v=ptqhnmP8FY0

    public void keyPressed (KeyEvent evt) {
        int i = evt.getKeyCode();


        if (i == KeyEvent.VK_LEFT) {
            if (x <= 0) {
                x = 0;
            } else
                x += -5;
        }
        if (i == KeyEvent.VK_RIGHT) {
            if (x >= 985) {
                x = 985;
            } else
                x += +5;
        }

    }
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}

   /* public void collision() {

        Ball b = new  ball.bounds();
        ComPad c = new cPad.bounds();

        if(b.intersects(c))
            collision = true;

        else
            collision = false;

    }*/
}
