import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 



   public class Paddle2 extends JPanel implements ActionListener {
   	
   	
   	
   	public void paddle2(Graphics g, int xVel, int yVel, int width, int height) {
   		
   	g.drawRect(xVel, yVel, width, height);
   		
   	}
   	
    int x, y;

    //Timer timer;
   //lock area gui
   //if off screen error!
//Reference Me

   Paddle2() {
//Initial paddle position
        x = 480;
        
        //timer = new Timer(10, this);
  }

   	      public void actionPerformed(ActionEvent e) {
 //paddle moves up or down;
 
 
        repaint();
    }


   	   public void paintComponent(Graphics g) {
 
        super.paintComponent(g);

        paddle2(g, x, 200, 1, 88);

    }
   		
   	/*	public static void main(String[] args) {
   		
   		Paddle2 paddle2 = new Paddle2();
   		JFrame frame = new JFrame("Paddle2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  Paddle1 moving = new Paddle2();
        frame.add(paddle2);
        frame.setSize(500,500);
        frame.setVisible(true);
        //moving.timer.start();
  

   		} */
    }
   