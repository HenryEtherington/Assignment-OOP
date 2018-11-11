   		
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 




   public class Paddle2 extends Paddle1 implements ActionListener, KeyListener {   	
   	
   	
   	Timer t = new Timer (5,this);
    int x = 1100, y = 300 , velX = 0, velY = 0;
    
     	public void paddle2(Graphics g, int xVel, int yVel, int width, int height) {
   		
   	g.drawRect(xVel, yVel, width, height);
   		
   	}

    //Timer timer;
   //lock area gui
   //if off screen error!
//Reference Me

   Paddle2() {
//Initial paddle position

        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
      
  }

   	      public void actionPerformed(ActionEvent e) {
 //paddle moves up or down;
 
        x = x += velX;
        y = y += velY;
        repaint();
    }


   	   public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        paddle2(g, x, y, 1, 200);

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
   		
   		public void keyPressed (KeyEvent evt)
   		{
   			int i = evt.getKeyCode();
   			
   			if(i == KeyEvent.VK_UP)
   				
   			{
   				velY = -2;
   				velX = 0;
   			}
   			
   			else if(i == KeyEvent.VK_DOWN)
   				
   			{
   			    velY = 2;
   				velX = 0;
   			}
   		}
   		
   		public void keyTyped(KeyEvent evt){}
   		public void keyReleased(KeyEvent evt){}
  
   		
   } 		
