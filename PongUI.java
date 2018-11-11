import javax.swing.JFrame;
import java.util.*;

    public class PongUI  extends Paddle1 {
    	
        //https://www.youtube.com/watch?v=5okwKe6L1Tk
    
    
   			
  //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner
   			
   							
   	 public void gui() {
        
        //Timer t = new Timer();
        //Ball ball = new Ball();	
        Paddle2 pad = new Paddle2();
   		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pad);
        //frame.add(t);
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);     		
     	//t.timer.start();
     	Moving m = new Moving();
        frame.add(m);
        m.timer.start();	
	
      }
   	
   	
   		
    }