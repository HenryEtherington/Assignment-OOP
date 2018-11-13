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
        Paddle2 pad = new Paddle2();
   		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pad);
        //frame.add(b);
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);    
       //timer.start();
       
           Ball m = new Ball();

        frame.add(m);


        m.timer.start();
   
	
      }
   	
   	
   		
    }