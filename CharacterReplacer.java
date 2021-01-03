/**
Sophia Nguyen
Character Replacer
Ms. Krasteva
Nov. 27, 2018
This program takes a string and a character, then replaces the chosen character in the string with another character.

The first screen is the splashScreen screen, which explains the program and displays graphics.
The second screen is the mainMenu screen, which gets our input for what we want to program to do.
The third screen is the askData screen, which gets the string and character input from us.
The fourth screen is the display screen, which converts the string and displays it.
The fifth screen is the instructions screen, which explains the instructions of the program.
The sixth screen is the goodbye screen, which thanks us for using the program and displays the programmer's name.

In order to go to the mainMenu screen from the splashScreen screen, we must press any key to continue. After that, we cannot go back to the splashScreen unless we rerun the program.
In order to go to the instructions screen from the mainMenu screen, we must press the '2' key.
In order to go back to the mainMenu screen from the instructions screen, we must press any key to continue.
In order to go to the askData screen from the mainMenu screen, we must press the '1' key.
In order to go to the display screen from the askData screen, we must correctly enter the string and character.
In order to go to the mainMenu from the display screen, we must press any key to continue.
In order to go to the goodbye screen from the mainMenu, we must press the '3' key.
In order to exit the program from the goodbye screen, we must press any key to continue.

Variable Dictionary
Name             Type        Purpose
key              char        stores the key that we press in mainMenu
character        char        stores the character that the we want to replace from the string
mainString       String      stores the original string that we input
*/

//import library
import java.awt.*; //gives access to the java command libraries
import hsa.*; //gives access to the hsa class


public class CharacterReplacer //creates a new class called CharacterReplacer
{
    Console c; //creates an instance variable of Console class so the output window can be made
    //global variable declarations
    char key, character;
    String mainString;


    /*
	This method is the VolumeCalculator class constructor. It creates a new Console object window and names it.
    */
    public CharacterReplacer ()  //VolumeCalculator class constructor
    {
	c = new Console ("Character Replacer"); //creates a new Console object window
    }


    /*
	This method is the title method. It displays the title.
    */
    private void title ()  //title method
    {
	c.clear (); //clears the screen
	c.print (' ', 31);
	c.println ("Character Replacer");
	c.println ();
    }


    /*
	This method is the pauseProgram method. It prompts us to enter a key.
    */
    private void pauseProgram ()  //pauseProgram method
    {
	c.print ("Please enter any key to continue. ");
	c.getChar (); //gets character from user
    }


    /*
    This method is the replaceAllChar return method. It replaces the chosen characters in the string with another character, stores the new string in a variable, and returns it.
    Variable Dictionary (Parameter list)
    Name                Type        Purpose
    letter              char        stores each letter of the string
    convertedStr        String      stores the new, converted string
    There is a for loop that runs through the first letter of the string to the last letter of the string.
    There is an if statement that either adds the original letter to the new string or adds the replacement character to the new string, depending on whether the letter matches with the character.
    */
    private String replaceAllChar (String mainStr, char findChar, char replaceChar)
    {
	//local variable declarations
	char letter;
	String convertedStr = "";
	//loop runs from the first letter of the string to the last letter of the string
	for (int i = 0 ; i <= mainStr.length () - 1 ; i++)
	{
	    //stores each letter inside letter variable
	    letter = mainStr.charAt (i);
	    //if the letter is the character that we want to replace (not case sensitive)
	    if ((letter == findChar) || (letter >= 65 && letter <= 90 && findChar == letter + 32) || (letter >= 97 && letter <= 122 && findChar == letter - 32))
	    {
		//add the replacement character to the new string
		convertedStr += replaceChar;
	    }
	    //if the letter does not match the character
	    else
	    {
		//add the original letter to the new string
		convertedStr += letter;
	    }
	}
	return convertedStr;
    }


    /*
    This method is the splashScreen method. It introduces the program and displays graphics.
    */
    public void splashScreen ()  //splashScreen method
    {
	//sets background and text background to pink
	c.setColor (Color.pink);
	c.fillRect (0, 0, 640, 500);
	c.setTextBackgroundColor (Color.pink);
	title (); //calls title
	//introduction
	c.println ("Hello. This program will take a string and a character, then replace that");
	c.println ("character in the string with another character.");
	c.println ();
	//graphics
	c.setColor (Color.gray);
	//bottom of conveyer belt
	c.fillRect (0, 380, 640, 30);
	c.setColor (Color.darkGray);
	//top of conveyer belt
	c.fillRect (0, 320, 640, 60);
	//outline of machine
	c.fillRect (200, 160, 220, 270);
	c.setColor (Color.lightGray);
	//middle of machine
	c.fillRect (210, 170, 200, 250);
	c.setColor (Color.black);
	//left side of machine
	c.fillRect (200, 230, 20, 150);
	//right side of machine
	c.fillRect (400, 230, 20, 150);
	//rivets
	c.setColor (Color.white);
	c.fillOval (10, 390, 10, 10); //1 from the left
	c.fillOval (40, 390, 10, 10); //2
	c.fillOval (70, 390, 10, 10); //3
	c.fillOval (100, 390, 10, 10); //4
	c.fillOval (130, 390, 10, 10); //5
	c.fillOval (160, 390, 10, 10); //6
	c.fillOval (190, 390, 10, 10); //7
	c.fillOval (420, 390, 10, 10); //8
	c.fillOval (450, 390, 10, 10); //9
	c.fillOval (480, 390, 10, 10); //10
	c.fillOval (510, 390, 10, 10); //11
	c.fillOval (540, 390, 10, 10); //12
	c.fillOval (570, 390, 10, 10); //13
	c.fillOval (600, 390, 10, 10); //14
	c.fillOval (630, 390, 10, 10); //15
	c.setFont (new Font ("Arial", Font.BOLD, 100)); //set font
	c.drawString ("e", 75, 350); //letter e
	c.drawString ("a", 475, 350); //letter a
	pauseProgram (); //calls pauseProgram
    }


    /*
	This method is the mainMenu method. It displays the menu options and gets the user choice.
	There is a while loop that runs until we enter a valid input.
	There is an if statement that outputs an error message if we enter an invalid input.
    */
    public void mainMenu ()  //mainMenu method
    {
	title (); //calls title
	c.println ("Main Menu");
	c.println ();
	//menu options
	c.println ("1. Convert");
	c.println ("2. Instructions");
	c.println ("3. Exit");
	//loop
	while (true)
	{
	    c.setCursor (9, 1);
	    c.print ("Please enter 1, 2, or 3.");
	    c.println ();
	    c.setCursor (9, 52);
	    key = c.getChar (); //gets key from user
	    //if shape input is invalid
	    if (key < 49 || key > 51)
	    {
		//error message
		new Message ("You must enter 1, 2, or 3.");
	    }
	    //if shape input is valid
	    else
	    {
		break; //exits the loop
	    }
	}
    }


    /*
	This method is the instructions method. It displays the instructions of the program.
    */
    public void instructions ()  //instructions method
    {
	title (); //calls title
	//instructions
	c.println ("Instructions");
	c.println ();
	c.println ("Once prompted by the program, please enter a string and then enter a character. The program will output the string with each of the chosen character");
	c.println ("replaced with another specific character.");
	c.println ("Please note that the program is not case sensitive, so corresponding upper case and lower case letters are viewed as the same.");
	c.println ();
	pauseProgram (); //calls pauseProgram
    }



    /*
    This method is the askData method. It gets the string and character input.
    */
    public void askData ()  //askData method
    {
	title (); //calls title
	c.print ("Please enter a string: ");
	mainString = c.readLine (); //gets mainString from user
	c.print ("Please enter a character: ");
	character = c.getChar (); //gets character from user
    }



    /*
	This method is the display method. It displays the converted string.
    */
    public void display ()  //display method
    {
	title (); //calls title
	//output
	c.println ("The original string was: " + mainString); //shows original string
	//calls replaceAllChar return method and passes arguments into the parameters, then outputs the converted string
	c.println ("The converted string is: " + replaceAllChar (mainString, character, 'a'));
	c.println ();
	pauseProgram (); //calls pauseProgram
    }



    /*
	This method is the goodbye method. It displays final messages and exits the program.
    */
    public void goodbye ()  //goodbye method
    {
	title (); //calls title
	//messages
	c.println ("Thank you for using the Character Replacer program.");
	c.println ();
	c.println ("Programmed by Sophia Nguyen.");
	c.println ();
	pauseProgram (); //calls pauseProgram
	c.close (); //closes the console and exits the program
    }


    /*
    This method is the main method of the program. It creates an instance variable of the program and calls the methods of the program in a specific order.
    There is a while loop that runs until we choose to exit.
    There is an if statement that executes different methods depending on what key we chose.
    */
    public static void main (String[] args)  //main method
    {
	CharacterReplacer r = new CharacterReplacer (); //creates instance variable of CharacterReplacer and constructs a new CharacterReplacer object
	r.splashScreen (); //executes splashScreen method
	//loop
	while (true)
	{
	    r.mainMenu (); //executes mainMenu method
	    //if the user chose instructions from the main menu
	    if (r.key == '2')
	    {
		r.instructions (); //executes instructions method
	    }
	    //if the user chose to exit from the main menu
	    else if (r.key == '3')
	    {
		break;
	    }
	    //if the user chose to convert from the main menu
	    else
	    {
		r.askData (); //executes askData method
		r.display (); //executes display method
	    }
	}
	r.goodbye (); //executes goodbye method
    }
}
