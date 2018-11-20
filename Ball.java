import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import javax.util.Timer;

public  class Ball extends JPanel implements ActionListener {

    Timer timer = new Timer(10, this);
    int x, y, dx = 2, dy = 2;

    JFrame frame = new JFrame("Game");
    Ball() {

        //Initial Ball Position
        x = 595;
        y = 445;


        //Ball ball = new Ball();
       // frame.add(ball);
    }

    // public abstract class MyCanvas extends Canvas {

    public void actionPerformed(ActionEvent e) {
        //Ball Speed + Collision with screen;
    
       	 //do{
             int j=0;	 
       	  if(x == 0) {   
      	
      	int i=0;  
       i++; 
       	
       //System.out.println(i);
      
      }
      
     /* if(j == 1)
      {
      	System.exit(0);
      }*/
      
     
    
       
       if( x == 100) {
 
       	j++; }
       	
   
      
        if (x < 0) {
            dx = 2;
        }
        
       if(x>=getWidth())
           dx = -2;

       if(y < 0)
           dy = 2;

       if(y>=getHeight())
           dy = -2;

       x += dx;
       y += dy;

        repaint();
    }


//while(i<7 && j<7)

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/

    //bs.show();

    // repaint();
    //  }

    // }


    //Ball Size
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);

    }


//Double Buffer image;


    // timer.start();

 
    


    public static void main(String[] args) {

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
        b.timer.start();

    }
}