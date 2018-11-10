import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball extends Paddle1{

    int x, y;

    Timer timer;
   

    Ball() {
//Initial Ball Position
        x = 250;
        y = 250;

        timer = new Timer(10, this);
  }

   

    public void actionPerformed(ActionEvent e) {
 //Ball Speed
        x += 2;
        y += 2;
        repaint();
    }
     
//Ball Size
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.fillOval(x, y, 10, 10);

    }

        
    public void gui() {
         	
        Ball ball = new Ball();
   		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ball);
        frame.setSize(500,500);
        frame.setVisible(true);
        ball.timer.start();   

      }
    //if (ball radius + distance from paddle radius)  less then or equal to (radius paddle) //Collision occurs
    //else // Collision does not occur

}


