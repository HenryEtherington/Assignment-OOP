import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

class UserPad extends JPanel implements MouseMotionListener {
//The Paddle class has a length and a position

    private int xpos;
    private int ypos;
    int widtH;
    int heighT;


    public UserPad(int xpos, int ypos, int widtH, int heighT) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.widtH = widtH;
        this.heighT = heighT;

        addMouseMotionListener(this);
    }

//The draw method of the Paddle class takes a Graphics object parameter and draws a filled

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xpos, ypos, widtH, heighT);

    }
    boolean collision(int ballxpos, int ballypos, int ballwidth, int ballheight) {

        if ((ballxpos + ballwidth < xpos || ballxpos > xpos + widtH)
                || (ballypos + ballheight < ypos || ballypos > ypos + heighT)) {
            return false;
        } else {
            return true;
        }

    }
    /*
    * To support the controller, the Paddle class
    must have methods which return the position of the top, bottom, left, and right edges of the this.
    */
    void setXpos(int x) {
        xpos = x;

    }

    void setWidth(int widtH) {
        this.widtH = widtH;

    }

    int getXpos() {
        return xpos;

    }

    int getWidtH() {
        return widtH;

    }

    public void mouseDragged(MouseEvent e) {
// Get the new location and repaint the screen

        xpos = e.getX();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }
}