import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.Pattern;

public class Main extends JFrame implements ActionListener, History, Instructions {

    JButton play, instructions, history, exit;

    public static void main(String args[]){
        Main frame = new Main();
        frame.setVisible(false);
    }


    public Main() {


        //Creates the frame.
        String name;
        // JTextField textfield = new TextField(10);
        JFrame frame = new JFrame("Game");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pong");
        //Hard code button size. setSize();
        play  = new JButton("            Play Game            ");
        instructions = new JButton("            Instructions             ");
        history = new JButton("            History of pong             ");
        exit = new JButton("            Exit            ");
        //Game history
        play.setVisible(true);
        instructions.setVisible(true);
        history.setVisible(true);
        exit.setVisible(true);
        //Add
        panel.add(label);
        frame.add(panel);
        // frame.add(textfield);
        play .addActionListener(this);
        instructions.addActionListener(this);
        history.addActionListener(this);
        exit.addActionListener(this);
        frame.add(play);
        frame.add(instructions);
        frame.add(history);
        frame.add(exit);
        //Size + Location
        //...
        //Add
     	/*	Container cPane = getContentPane();
		cPane.setBackground(Color.BLACK);*/
        //Reference me
        label.setFont(label.getFont().deriveFont(450.0f));
        label.setForeground(Color.BLACK);
        //frame.setBackground(Color.BLACK);
        play.setBackground(Color.WHITE);
        play.setForeground(Color.BLACK);
        instructions.setBackground(Color.WHITE);
        instructions.setForeground(Color.BLACK);
        history.setBackground(Color.WHITE);
        history.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setLayout (new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asks for user input (non-case sensitive);
        name = JOptionPane.showInputDialog("Welcome! \nPlease enter your first name:");


        try {

            if (isFirstName(name)) {

                //Easter egg - Undertale reference
                if (name.equals("Harry")) {


                    JOptionPane.showMessageDialog(null,name + " huh sounds sexy." +
                            "\nWelcome " + name + " to my second year project. I hope you enjoy.","Welcome!" ,JOptionPane.INFORMATION_MESSAGE);

                    frame.setVisible(true);

                  /*  	catch(Exception e) {

                 //Prevents No point exception error
                 JOptionPane.showMessageDialog(frame,"Bye!","Come Back Soon",JOptionPane.INFORMATION_MESSAGE);

               }*/
                }

                else if (name!=("Harry")) {

                    JOptionPane.showMessageDialog(null,"Welcome " + name + " to my second year project. I hope you enjoy.","Welcome!" ,JOptionPane.INFORMATION_MESSAGE);

                    frame.setVisible(true);

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

    public static boolean isFirstName(String nme)

    {

        return Pattern.matches("[a-zA-z]+",nme);
    }



    public void actionPerformed(ActionEvent e)

    {
        //Plays game when play button is pressed.
        if(e.getSource() == play) {

            //Return PongUI.java
            //gui.setVisible(true);


            //Ball extends Paddle1 which extends Paddle2 which extends JPanel and both implement ActionListner


            PongUI classObject = new PongUI();
            classObject.gui();
        }

        //Shows instructions when instruction button is pressed.
        else if (e.getSource() == instructions) {

            JOptionPane.showMessageDialog(null,cText.toString(),"Instructions",JOptionPane.INFORMATION_MESSAGE);

        }

        //Shows history when history button is pressed.
        else if (e.getSource() == history) {

            //https://en.wikipedia.org/wiki/Pong
            JOptionPane.showMessageDialog(null,hText.toString(),"History",JOptionPane.INFORMATION_MESSAGE);
        }

        //Exits program when exit button is pressed.
        else

            System.exit(0);
    }
}