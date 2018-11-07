import java.awt.*;
import javax.swing.*;
import java.util.regex.Pattern;
/*import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;*/

//public class Main extends JFrame {

    //Main() {
    
   // new Main();
    //}
    
   public class Main {
     
    public static void main(String args[]) {
        String name;
 
        //Creates the frame.
          
        //((AbstractDocument)textField.getDocument()).setDocumentFilter(new LimitDocumentFilter(15));	            
        JFrame frame = new JFrame("Game"); 
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pong");  
        JButton button = new JButton("Play Game");
        JButton button2 = new JButton("Instructions");
        JButton button3 = new JButton("History of pong");
        JButton button4 = new JButton("Exit");
        button.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        //Add
        panel.add(label);   
        frame.add(panel);  
        frame.add(button);	 
        frame.add(button2);	 
        frame.add(button3);	 
        frame.add(button4);
       //Position + Size
        label.setSize(600,0);
        button.setBounds(0, 900, 200, 200);
        button2.setBounds(200, 200, 200, 200);     
        button3.setBounds(300, 200, 200, 200);   
        button4.setBounds(400, 200, 200, 200);   
        //Add 
        //jbutton.addActionListener(this);  	     	         
        label.setFont(label.getFont().deriveFont(500.0f));
        label.setForeground(Color.WHITE);
        panel.setBackground(Color.BLACK);     
        button.setBackground(Color.WHITE);  
        button.setForeground(Color.BLACK);  
        button2.setBackground(Color.WHITE);  
        button2.setForeground(Color.BLACK);  
        button3.setBackground(Color.WHITE);  
        button3.setForeground(Color.BLACK);  
        button4.setBackground(Color.WHITE);  
        button4.setForeground(Color.BLACK);        	    
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setLayout (new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
    

        name = JOptionPane.showInputDialog("Welcome! \nPlease enter your name:");

    
     /*public void setJTextField() {
     
        //Asks the user for a name input.
        
          JLabel label1 = new JLabel("Welcome! \nPlease enter your first name [non case sensitive].");
          add(label1);
          
          JTextField textField = new JTextField(20); 
          add(textField);
          
      }*/
try {

  if (isFirstName(name)) {
        
            if (name.equals("Harry")) {

               try {
               	
               	      JOptionPane.showMessageDialog(null,name + " huh sounds sexy." +
                                                   "\nWelcome " + name + " to my second year project. I hope you enjoy.","Welcome!" ,JOptionPane.INFORMATION_MESSAGE);              
                   
                      frame.setVisible(true);    	
                   }   
                    	catch(Exception e) {
   
                 //Prevents No point exception error
                 JOptionPane.showMessageDialog(frame,"Bye!","Come Back Soon",JOptionPane.INFORMATION_MESSAGE);          
                 
               }
            }

            else if (name!=("Harry")) {

                JOptionPane.showMessageDialog(null,"Welcome " + name + " to my second year project. I hope you enjoy.","Welcome!" ,JOptionPane.INFORMATION_MESSAGE);
         
                frame.setVisible(true);
            
            }
        }
        
        
        else if(name.length()==0 ) {
        
                    //Prevents No point exception error        
                 JOptionPane.showMessageDialog(frame,"Bye!","Come Back Soon",JOptionPane.INFORMATION_MESSAGE);     
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
    
    /* public class LimitDocumentFilter extends DocumentFilter {

      //https://stackoverflow.com/questions/10136794/limiting-the-number-of-characters-in-a-jtextfiel
      
        private int limit;

        public LimitDocumentFilter(int limit) {
            if (limit <= 0) {
                throw new IllegalArgumentException("Limit can not be <= 0");
            }
            this.limit = limit;
        }
        
          @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            int currentLength = fb.getDocument().getLength();
            int overLimit = (currentLength + text.length()) - limit - length;
            if (overLimit > 0) {
                text = text.substring(0, text.length() - overLimit);
            }
            if (text.length() > 0) {
                super.replace(fb, offset, length, text, attrs); 
            }
        }*/

     }
