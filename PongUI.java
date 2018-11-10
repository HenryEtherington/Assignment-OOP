
import javax.swing.JFrame;

    public class PongUI   {
    	
        //https://www.youtube.com/watch?v=5okwKe6L1Tk
    
    	public static void main (String[] args) {
   			
  //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner
   			
   				Ball classObject = new Ball();
   				classObject.gui(); 				
   		}
    }
