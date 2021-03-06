import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;

/**
 * The TextTest class gets user input and displays the square of a number in JFrameTest3. 
 * 
 * @author Hannah Kim & Sophia Nguyen.
 * @version 1 03.28.19
 */ 

public class TextTest extends JPanel{
  
  /**
 * The class constructor calls the methods that get user input and output text.
 */ 
  public TextTest ()
  {
    inputPrompt();
    outputResult();
  }
  
  /**
 * This method asks the user to enter an integer.
 * <p>
 * <b>Variables: </b>
 * <p>
 * <b>enterValue </b> This creates an instance of a JLabel named "Please enter an integer.".
 */ 
  
  public void inputPrompt()
  {
    JLabel enterValue;
    enterValue = new JLabel ("Please enter an integer.");
    enterValue.setFont (new Font ("Serif",Font.PLAIN,16));
    add (enterValue);
  }
  
  /**
 * This method prompts users to enter text with a message.
 * <p>
 * <b>Variables: </b>
 * <p>
 * <b>calculate </b> This creates an instance of a JButton named "Calculate".
 * <p>
 * <b>inputField </b> This creates an instance of a JTextField with a width of 20 characters.
 * <p>
 * <b>outputField </b> This creates an instance of a JTextField with a width of 25 characters.
 */ 
  
  public void outputResult()
  {
    JButton calculate = new JButton ("Calculate");
    final JTextField inputField = new JTextField (20);
    final JTextField outputField = new JTextField (25);
    add (inputField);
    add (outputField);
    add (calculate);
    calculate.addActionListener (new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        try
        {
        int number = Integer.parseInt (inputField.getText());
        outputField.setText ("The square of the number is: "+Integer.toString(number*number) + ".");
        }
        catch (NumberFormatException ex)
        {
          outputField.setText ("Error! You have entered an invalid integer.");
          inputField.setText("");
        }
        }
      });
  }

}
