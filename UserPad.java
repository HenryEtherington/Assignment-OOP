//UserPad.java
/*Allows bottom user paddle to appear in game
 @author Henry Etherington */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//Subclass UserPad extends Superclass JPanel.
class UserPad extends JPanel implements MouseMotionListener {
    // Handle the mouse event
    private int xpos, ypos, widtH, heighT;

    public UserPad(int xpos, int ypos, int widtH, int heighT) {

        this.xpos = xpos;
        this.ypos = ypos;
        this.widtH = widtH;
        this.heighT = heighT;
        addMouseMotionListener(this);
    }

//Draw paddle at the bottom left of the screen.

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xpos, ypos, widtH, heighT);
    }

    //Accessor and Mutator methods required for taking in and using data respectively.
    void setXpos(int x) {
        xpos = x;
    }

    void setWidth(int width) {
        this.widtH = width;
    }

   public int getXpos() {
        return xpos;
    }

   public int getYpos() {
        return ypos;
    }

    public int getWidtH() {
        return widtH;
    }

    public int getHeighT() {
        return heighT;
    }

    //Allows user to move buttom left paddle via input from mouse.
    public void mouseDragged(MouseEvent e) {
          //Substantial processing element. //Allows user to drag mouse.
        xpos = e.getX();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
      }
  }


