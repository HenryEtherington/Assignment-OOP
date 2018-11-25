//PongUI.java
/*Creates frame from which the game is playable.
@author Henry Etherington */

import javax.swing.*;

public class PongUI extends JPanel {

//Creates JFrame for game pong and also sizes and places the gui in the center of the screen.


    public PongUI(int h, int w) {
          //Instantiable class
        JFrame frm = new JFrame("Game");
        frm.setSize(h, w);
        frm.setLocationRelativeTo(null);
      }
    }

