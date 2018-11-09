import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Moving extends JPanel implements ActionListener {

    int x, y;

    Timer timer;
   

    Moving() {
//Initial Ball Position
        x = 250;
        y = 250;

        timer = new Timer(10, this);
  }

   

    public void actionPerformed(ActionEvent e) {
 //Ball Speed
        x += 2;
        y += 2;
        repaint();
    }
     
//Ball Size
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.fillOval(x, y, 10, 10);

    }

     

    public static void main(String[] args) {

        JFrame f = new JFrame("Moving");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Moving m = new Moving();

        f.add(m);

        f.setSize(500,500);

        f.setVisible(true);

        m.timer.start();
      

    }
    
    
    //if (ball radius + distance from paddle radius)  less then or equal to (radius paddle) //Collision occurs
    //else // Collision does not occur

}


