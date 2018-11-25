//UserPad.java
/*Allows bottom user paddle to appear in game*/

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class UserPad extends UserPad2 implements MouseMotionListener {

    private int xpos, ypos, widtH,heighT;

    public UserPad(int x, int y, int widtH, int heighT) {

          //Initial bottom paddle position
        this.xpos = x;
        this.ypos = y;
        this.widtH = widtH;
        this.heighT = heighT;
        addMouseMotionListener(this);
    }

//The draw method of the Paddle class takes a Graphics object parameter and draws a filled

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xpos, ypos, widtH, heighT);
       // g.setColor(Color.ORANGE);
    }
    boolean collision(int ballxpos, int ballypos, int ballwidth, int ballheight) {

        if ((ballxpos + ballwidth < xpos || ballxpos > xpos + widtH)
                || (ballypos + ballheight < ypos || ballypos > ypos + heighT)) {
            return false;
        }

        else {
            return true;
        }

    }

    /*
        /*
        * To support the controller, the Paddle class
        must have methods which return the position of the top, bottom, left, and right edges of the this.
        */
    void setXpos(int x) {
        xpos = x;

    }

    void setWidth(int width) {
        this.widtH = width;

    }

    int getXpos() {
        return xpos;

    }

    int getWidtH() {
        return widtH;

    }

    public void mouseDragged(MouseEvent e) {
// Get the new location and repaint the screen

     /*   if(xpos >= 1000)
        {


            xpos = -e.getX();
            //xpos = 1000;
        }

        else*/

     //if(xpos > 0 && xpos <1500)

        xpos = e.getX();
        repaint();
    }


    /*public Rectangle getBounds() {
        return new Rectangle(xpos, ypos, WIDTH, HEIGHT);
    }*/

    public void mouseMoved(MouseEvent e) {
    }

    public Rectangle getPaddleRect() {

        return  new Rectangle(xpos,ypos,widtH,heighT) ;

    }
}


