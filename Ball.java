//Ball.java
/*Allows ball to appear in game and provides collision between ball and screen.
@author Henry Etherington*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Subclass Ball extends Superclass Game.
public  class Ball extends Game  implements Winner{

    public int x = 595, y = 445, dx = 3, dy = 3, scoreL = 0, scoreR = 0, delay = 10;
   // public Ball ball = new Ball();
    //public UserPad userPad = new UserPad();
    Timer timer = new Timer(10, new TimerListener());

    Ball() {
        timer.start();
    }

    public class TimerListener implements ActionListener {
        // Handle the action event

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    /* UNUSED CODE FOR BUFFERING

     BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
            }*/

    /*bs.show();
     } */

    public void paintComponent(Graphics g) {

        //Draw ball.
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 10, 10);

          //Draws score counter left.
        g.setColor(Color.BLACK);
        g.setFont(new Font("serif",Font.ITALIC,15));
        g.drawString("Score: " + scoreL,10,30);

          //Draws score counter right.
        g.setColor(Color.BLACK);
        g.setFont(new Font("serif",Font.ITALIC,15));
        g.drawString("Score: " + scoreR,1120,30);

        //Ball collision with screen and speed.
        if (x < 0)
            dx = 3;

        if (x >= getWidth())
            dx = -3;

        if (y < 0)
            dy = 3;
        if (y >= getHeight())
            dy = -3;

        x += dx;
        y += dy;

          //Adds +1 to score counter at the top left of the screen.
        if(y > 850) {
            scoreL++;
        }

        if(y < 0) {
            scoreR++;
        }

        if( scoreL > 6 || scoreR > 6) {
            // JOptionPane.showMessageDialog(null,winnerText.toString(),"Congratulations!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

 //UNUSED CODE FOR COLLISION. Java Game Tutorial - Pong 07-01: Collision Detection
 // https://www.youtube.com/watch?v=GpM8yvDP21o
     /* public void collision(UserPad userPad) {

          if(this.x > userPad.getXpos() && this.x < userPad.getXpos() + userPad.getWidtH())
          {
             if (this.y > userPad.getY() && this.y < userPad.getHeighT()) {

                 //Ball collided with userPad.
                 dx = 3;
                 dy = 3;
            }
          }
        }*/
      }



