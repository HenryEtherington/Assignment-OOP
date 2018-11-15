import javax.swing.*;
import java.util.*;
public  class PongUI  {

    //How to use multiple class in java
    //https://www.youtube.com/watch?v=5okwKe6L1Tk


    //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner


    public void gui() {


       
        //UserPad p = new UserPad();
        Ball b = new Ball();
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(p);
        frame.add(b);
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //timer.start();
        b.timer.start();
       
    }
}