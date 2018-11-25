import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
//import javax.swing.text.*;
import java.util.regex.Pattern;

public class Main extends JPanel implements ActionListener, History, Instructions {

    private JButton play, instructions, history, exit;
    private String name;

    //Serves no function.
    //Required to call other functions.

  public static void main(String[] args){
        Main frm = new Main();
        frm.setVisible(false);
    }

 //JTextField limit attempt

/*private int limit;
    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    JTextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}*/

    public Main() {

         // JTextField textfield = new JTextField(10);
         // textfield.setDocument(new JTextFieldLimit(10));

          //Creates the frames and labels.
        JFrame frame = new JFrame("Game");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pong");
        //Create buttons and sizing buttons.
        play  = new JButton("Play Game");
        instructions = new JButton("Instructions");
        history = new JButton("History of pong");
        exit = new JButton("Exit");
          //Game.
        play.setPreferredSize(new Dimension(200,50));
          //Game instructions.
        instructions.setPreferredSize(new Dimension(200,50));
          //Game history.
        history.setPreferredSize(new Dimension(200,50));
          //Quits/exits game.
        exit.setPreferredSize(new Dimension(200,50));
          //Allows user to view buttons on screen.
        play.setVisible(true);
        instructions.setVisible(true);
        history.setVisible(true);
        exit.setVisible(true);
          //Adds all panels, frames and buttons to screen.
        panel.add(label);
        frame.add(panel);
        frame.add(play);
        frame.add(instructions);
        frame.add(history);
        frame.add(exit);

          //frame.add(textfield);

          //Represents the button being pressed.
        play.addActionListener(this);
        instructions.addActionListener(this);
        history.addActionListener(this);
        exit.addActionListener(this);
          //Coloring of labels and buttons.
        label.setBackground(Color.CYAN);
         //Colors borders on buttons and labels.
         //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
        Border border = BorderFactory.createLineBorder(Color.BLUE);
        label.setBorder(border);
        play.setBorder(border);
        instructions.setBorder(border);
        history.setBorder(border);
        exit.setBorder(border);
        // label.setForeground(Color.DARK_GRAY);
        play.setBackground(Color.ORANGE);
        play.setForeground(Color.BLACK);
        instructions.setBackground(Color.ORANGE);
        instructions.setForeground(Color.BLACK);
        history.setBackground(Color.ORANGE);
        history.setForeground(Color.BLACK);
        exit.setBackground(Color.ORANGE);
        exit.setForeground(Color.BLACK);
         //Paints JLabel background . Default is false.
         //https://stackoverflow.com/questions/2380314/how-do-i-set-a-jlabels-background-color/2380339
        label.setOpaque(true);
        frame.getContentPane().setBackground(Color.CYAN);
        //Label style and frame style.
        label.setFont(label.getFont().deriveFont(450.0f));
        frame.setSize(1200,900);
        //frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setLayout (new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asks for user input (non-case sensitive);
        name = JOptionPane.showInputDialog("Welcome! \nPlease enter your first name:");

        try {

            if (isFirstName(name)) {

                //Easter egg - Undertale reference
                if (name.equals("Harry")) {
                    int nme = JOptionPane.showConfirmDialog(null, name + " huh sounds sexy." +
                            "\nWelcome " + name + " would you like to play my second year project.", "Welcome!", JOptionPane.INFORMATION_MESSAGE);

                    if (nme == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null,"Enjoy handsome.");
                        frame.setVisible(true);
                    } else {
                        System.exit(0);
                    }
                }

                else  {
                     int nme = JOptionPane.showConfirmDialog(null, "Welcome " + name + " would you like to play my second year project.", "Welcome!", JOptionPane.INFORMATION_MESSAGE);

                    if (nme == JOptionPane.YES_OPTION) {
                        frame.setVisible(true);
                    } else {
                        System.exit(0);
                    }
                }
            }
             else {

                //Prevents No point exception error
                JOptionPane.showMessageDialog(frame,"Sorry but name " + name +
                                              " was invalid. " + "Please check all characters are letters and try again.","Try Again!",JOptionPane.ERROR_MESSAGE);
            }
        }

        catch(Exception e) {

            //Prevents No point exception error
            JOptionPane.showMessageDialog(frame,"Bye!","Come Back Soon",JOptionPane.INFORMATION_MESSAGE);
        }
    }

/*Used to get method Pattern
https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
Validates data contains letters.*/

    public static boolean isFirstName(String nme) {
        return Pattern.matches("[a-zA-z]+",nme);
    }

    public void actionPerformed(ActionEvent e) {
          //Plays game when play button is pressed.
        
        if(e.getSource() == play) {
              //Create subclass in main. /Links Main page to Other classes.
            new Controller();
        }

          //Shows instructions when instruction button is pressed.
        else if (e.getSource() == instructions) {
              //Example of interface.
            JOptionPane.showMessageDialog(null,cText.toString(),"Instructions",JOptionPane.INFORMATION_MESSAGE);
        }

          //Shows history when history button is pressed.
        else if (e.getSource() == history) {
              /*History of pong.
              https://en.wikipedia.org/wiki/Pong*/
                //Example of interface.
            JOptionPane.showMessageDialog(null,hText.toString(),"History",JOptionPane.INFORMATION_MESSAGE);
        }

        //Exits program when exit button is pressed /Acts as a fail-safe.
        else
            System.exit(0);
    }
}