import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

//Abstract method
public  class ComPad extends JPanel implements ActionListener {


    public void ComPad(Graphics g, int xVel, int yVel, int width, int height) {

        g.drawRect(xVel, yVel, width, height);

    }

    int x = 1175, y = 300;

    //Timer timer;
    //lock area gui
    //if off screen error!
//Reference Me

    ComPad() {
//Initial paddle position

        //timer = new Timer(10, this);
    }


    //  public class MyCanvas extends Canvas  {

    public void actionPerformed(ActionEvent e) {
        //paddle moves up or down;

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/
        repaint();
        //bs.show();

        //  }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        ComPad(g, x, y, 1, 200);

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