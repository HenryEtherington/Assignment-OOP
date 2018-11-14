import javax.swing.JFrame;
import java.util.*;

    public class PongUI  extends JFrame {
    	
        //https://www.youtube.com/watch?v=5okwKe6L1Tk
    
 
   			
  //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner
   			
   				
   	 public void gui() {
        
       
        //  Timer timer;
        //Ball b = new Ball();
        // timer = new Timer(10,this);
        //timer.start();	
        UserPad pad = new UserPad();
   		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pad);
        //frame.add(b);
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);    
        //timer.start();
        Ball b = new Ball();
        frame.add(b);
        b.timer.start();
	
      }	
    }