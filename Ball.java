import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball extends JPanel implements ActionListener{

    int x, y;

    Timer timer;
   

    Ball() {
//Initial Ball Position
        x = 595;
        y = 445;
   
        	Timer t = new Timer (10,this);  
        		t.start();
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

   

    //if (ball radius + distance from paddle radius)  less then or equal to (radius paddle) //Collision occurs
    //else // Collision does not occur
 
}