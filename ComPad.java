import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Abstract method
public  class ComPad extends JPanel  implements KeyListener   {



    public void ComPad(Graphics g, int xVel, int yVel, int width, int height) {

        g.drawRect(xVel, yVel, width, height);
        g.dispose();
    }

    int x = 600, y = 0;
    Timer timer = new Timer(10, new ComPad.TimerListener());

    //Timer timer;
    //lock area gui
    //if off screen error!
//Reference Me

    ComPad() {
//Initial paddle position

        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        //timer = new Timer(10, this);
    }


    //  public class MyCanvas extends Canvas  {
    private class TimerListener implements ActionListener {

        // Handle the action event

    public void actionPerformed(ActionEvent e) {
        //paddle moves up or down;

         /*   BufferStrategy bs = getBufferStrategy();
            if (bs == null) {
                createBufferStrategy(3);
                return;
            }*/
        repaint();
        //bs.show(); }

         }
    }

    public void paintComponent(Graphics g) {




        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect( x, y, 200, 10);

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

//https://www.youtube.com/watch?v=ptqhnmP8FY0
    //Collision detection

    public void keyPressed (KeyEvent evt) {
        int i = evt.getKeyCode();


        if (i == KeyEvent.VK_LEFT) {
            if (x <= 0) {
                x = 0;
            } else
                x += -5;
        }
        if (i == KeyEvent.VK_RIGHT) {
            if (x >= 985) {
                x = 985;
            } else
                x += +5;
        }

    }
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}


}

