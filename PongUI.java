import javax.swing.JFrame;

    public class PongUI   {
    	
        //https://www.youtube.com/watch?v=5okwKe6L1Tk
    
    	public static void main (String[] args) {}
   			
  //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner
   			
   							
   	 public void gui() {
         	
        Ball ball = new Ball();
   		JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ball);
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        ball.timer.start();   

      }
   	
   	
   		
    }