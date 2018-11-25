//Controller.java
/*Styles frame from which the game is playable
 * @author Henry Etherington */

import java.awt.*;
import javax.swing.*;

public class Controller extends JFrame {

    private Ball ball = new Ball();

    public Controller() {

        //The controller has a ball, a paddle, and a display (PongUI) object

        JFrame frm = new JFrame();
        frm.setTitle("Game");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setSize(1200, 900);
        frm.add(ball, BorderLayout.CENTER);
        int paddleWidth = 200;
        int paddleHeight = 1000;
        int width = 200;
        UserPad paddle = new UserPad(width / 2 - paddleWidth, 0, paddleWidth, paddleHeight);
        frm.add(paddle, BorderLayout.SOUTH);

    }
}

