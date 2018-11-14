

///////////////////////////////////

/* FILE NAME CHANGED TO UserPad.java*/
 
////////////////////////////////////

   		
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.image.*;

   public class Paddle2 extends Paddle1 implements ActionListener, KeyListener {   	
   	
   	
   	Timer t = new Timer (5,this);
    int x = 1100, y = 300 ;
    
     	public void paddle2(Graphics g, int xVel, int yVel, int width, int height) {
   	
   	/* BufferStrategy bs = getBufferStrategy();
        if(bs == null)
        {
        	createBufferStrategy();
        	return;
        }*/
   	
   	
   	//https://www.youtube.com/watch?v=ptqhnmP8FY0 Collision
   //	g = bs.getDrawGraphics();	
   	g.drawRect(xVel, yVel, width, height);
   	g.dispose();
   //	bs.show();
   	
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
   		
   		//https://www.youtube.com/watch?v=ptqhnmP8FY0  		
   		//Collision detection
   		
   		public void keyPressed (KeyEvent evt)
   		{
   			int i = evt.getKeyCode();
   			
   			if(i == KeyEvent.VK_UP)
   				
   			{
   				if(y <= 0)
   				{
   					y = 0;
   				}
   			
   			else
   				 y += -5;
   			}
   			
   			else if(i == KeyEvent.VK_DOWN)
   				
   			{
   			    if(y >= 660)
   			    {
   			    		y = 660;
   			    }
   			    
   			    else
   			    	 y += +5;
   			}
   		}
   		
   		public void keyTyped(KeyEvent evt){}
   		public void keyReleased(KeyEvent evt){}
  
 
   } 		
