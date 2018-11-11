import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

  //Abstarct method
   public abstract class Paddle1 extends Ball  implements ActionListener {
   	
   	
   	
   	public void paddle1(Graphics g, int xVel, int yVel, int width, int height) {
   		
   	g.drawRect(xVel, yVel, width, height);
   		
   	}
   	
    int x, y;

    //Timer timer;
   //lock area gui
   //if off screen error!
//Reference Me

   Paddle1() {
//Initial paddle position
        x = 0;
        y = 300;
        //timer = new Timer(10, this);
  }

   	      public void actionPerformed(ActionEvent e) {
 //paddle moves up or down;
 
 
        repaint();
    }
   		
   	   public void paintComponent(Graphics g) {
 
        super.paintComponent(g);

        paddle1(g, x, y, 1, 200);

    }
   		
   	/*	public static void main(String[] args) {
   		
   		Paddle1 paddle1 = new Paddle1();
   		JFrame frame = new JFrame("Paddle1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  Paddle1 moving = new Paddle1();
        frame.add(paddle1);
        frame.setSize(500,500);
        frame.setVisible(true);
        //moving.timer.start();
  

   		}*/ 
	
       		
   		
   } 		

    
   