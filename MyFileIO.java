/*  Ryan Phan
 *  November 30, 2018
 *  Mr. Rosen
 *
 *  This program creates files that can store a integer!
 *       The mainMenu screen creates a main menu.
 *       The askData screen accepts user input to store an integer.
 *       The displayData screen outputs the results.
 *       The goodbye screen tells the user my name before ending the program.
 *       The drawTitle screen clears the screen and outputs the title.
 *
 */

import java.awt.*;
import hsa.Console;
import hsa.Message;
import java.io.*;

// The "MyFileIO" Class
public class MyFileIO
{
    Console c;  // Output Console

    // Declaration Statements
    String fileName = "Untitled.yan";                    // Default file name and stores the current file name
    String header = "%.yan%-MyFileIO-Version 3.0.1";     // Unique Header used at the top of files
    int userInt, savedUserInt;                           // userInt is the initial user input, savedUserInput is the saved version
    static String choice;                                // Stores the user's choice
    static char confirm;
    boolean userEnteredValue = false;                    // Checks if the user has entered any value
    static boolean saveCheck = true;                     // Checks if the user saved their input
    static boolean saveAsCheck = false;                  // Checks if the user has saved their input into a file


    // Class Constructor
    public MyFileIO ()
    {
	c = new Console ("File I/O");                // Creates the console window
    }


    // Used to clear the screen and output a title
    public void drawTitle (String title, int spacing)  // Overloads are used to control what I want in the title
    {
	c.clear ();
	c.print (' ', spacing);
	c.println (title);
	c.println ();
    }


    // Used to give the user time to view data
    public void pauseProgram ()
    {
	c.println ();
	c.setColor (Color.black);
	c.setFont (new Font ("Courier New", 0, 14));
	c.drawString ("Press any key to continue... ", 1, 490);
	char pauseChar = c.getChar ();
    }


    // Used to ensure if the user wishes to proceed if they have unsaved data
    public void confirmChoice (String choice)
    {
	drawTitle ("Warning: You have unsaved input!", 25);
	c.print (' ', 26);
	c.println ("Want to save before proceeding?");
	c.print (' ', 9);
	c.println ("Enter [y] to return to main menu. Press anything else to proceed.");
	confirm = c.getChar ();
    }


    // Contains all of the options given to the user
    public void mainMenu ()
    {
	drawTitle (fileName, 31);

	// Main Menu Options
	c.print (' ', 32);
	c.println ("Main Menu");
	c.print (' ', 7);
	c.print ("------------------------------------------------------------------");
	c.println ();
	c.print (' ', 31);
	c.println ("[1] New");
	c.print (' ', 31);
	c.println ("[2] Open");
	c.print (' ', 31);
	c.println ("[3] Display");
	c.print (' ', 31);
	c.println ("[4] Modify");
	c.print (' ', 31);
	c.println ("[5] Save");
	c.print (' ', 31);
	c.println ("[6] Save As");
	c.print (' ', 31);
	c.println ("[7] Exit");
	c.println ();
	c.print (' ', 30);
	c.print ("Enter An Option: ");
	choice = c.readLine ();
    }


    // Asks the user for a new integer
    public void askData ()
    {
	String userInput;
	fileName = "Untitled.yan";
	while (true)
	{
	    drawTitle (fileName, 32);
	    try
	    {
		c.print ("Enter an integer: ");
		userInput = c.readLine ();
		userInt = Integer.parseInt (userInput);
		break;
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Please enter an integer!", "Error!");
	    }
	}

	userEnteredValue = true;    // Sets userEnteredValue to true, allowing the user to select save
	saveCheck = false;          // Sets saveCheck to false, preventing the user from accidently losing data
    }


    // Allows the user to open any '.yan' file
    public void openFile ()
    {
	BufferedReader openFile;    // Used to find and read files
	String fileSearch;          // Used to search for a file
	String readFile = "";       // Reads the integer in the file

	drawTitle (fileName, 32);
	c.print ("Enter a file name (Don't enter '.yan'): ");
	fileSearch = c.readLine ();
	while (true)
	{
	    try
	    {
		openFile = new BufferedReader (new FileReader (fileSearch + ".yan"));
		if (!(openFile.readLine ().equals (header)))
		{
		    new Message ("This file wasn't made by this program.", "Error!");
		    break;
		}
		readFile = openFile.readLine ();
		userInt = Integer.parseInt (readFile); // Sets the current userInt to the integer in the given file
		saveCheck = true;                      // Sets saveCheck to true, since the file already has presaved info
		saveAsCheck = true;                    // Sets saveAsCheck to true, since this file exists
		userEnteredValue = true;               // Sets userEnteredValue to true, since a user entered value now exists
		fileName = fileSearch + ".yan";        // Changes the title and the current file name
		c.println ("The integer in the file " + fileSearch + ".yan is: " + readFile);
	    }
	    catch (IOException e)
	    {
		new Message ("File Not Found!", "Error!");
	    }
	    break;
	}
	pauseProgram ();
    }


    // Allows the user to modify the integer inside the current file
    public void modFile ()
    {
	drawTitle (fileName, 32);
	c.println ("Current Int: " + userInt);
	c.print ("Enter an integer: ");
	userInt = c.readInt ();
	saveCheck = false;                    // Sets saveCheck to false, since the user has entered new unsaved data
    }


    // Displays the current integer value within the file
    public void displayFile ()
    {
	drawTitle (fileName, 32);
	c.println ("Current Int: " + userInt);
	pauseProgram ();
    }


    // Automatically saves data with the same file name
    public void saveFile ()
    {
	if (!userEnteredValue)                                                      // Checks if the user hasn't entered a value
	{
	    new Message ("There isn't anything to save.", "Error!");
	}
	else                                                                        // If so, save a new file
	{
	    savedUserInt = userInt;
	    PrintWriter newFile;

	    while (true)
	    {
		try
		{
		    newFile = new PrintWriter (new FileWriter (fileName));
		    newFile.println (header);
		    newFile.println (savedUserInt);
		    newFile.close ();
		    saveCheck = true;                   
		}
		catch (IOException e)
		{
		    new Message ("You must enter a valid file name!", "Error!");
		}
		break;
	    }
	}
    }


    // Creates a new file with the current data
    public void saveAsFile ()
    {
	String userFileName;
	if (!userEnteredValue)
	{
	    new Message ("There isn't anything to save.", "Error!");
	}
	else
	{
	    drawTitle (fileName, 32);
	    PrintWriter newFile;
	    while (true)
	    {
		c.print ("Enter a file name to save into (Adds '.yan'): ");
		userFileName = (c.readLine () + ".yan");
		try
		{
		    newFile = new PrintWriter (new FileWriter (userFileName));
		    savedUserInt = userInt;
		    newFile.println (header);
		    newFile.println (savedUserInt);
		    newFile.close ();
		    fileName = userFileName;
		    saveAsCheck = true;
		    saveCheck = true;
		}
		catch (IOException e)
		{
		    new Message ("You must enter a valid file name!", "Error!");
		}
		break;
	    }
	}
    }


    // Exit Screen: Displays my name.
    public void goodbye ()
    {
	drawTitle ("Goodbye!", 35);
	c.print (' ', 26);
	c.println ("Thanks for using my program!");
	c.println ();
	c.print (' ', 25);
	c.println ("Program Written By: Ryan Phan");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args)
    {
	MyFileIO f = new MyFileIO ();                      // Creates a new MyFileIO object
	while (true)
	{
	    f.mainMenu ();                                  
	    if (choice.equals ("1") && saveCheck == true)               
		f.askData ();
	    else if (choice.equals ("2") && saveCheck == true)
		f.openFile ();
	    else if (choice.equals ("3"))
		f.displayFile ();
	    else if (choice.equals ("4"))
		f.modFile ();
	    else if (choice.equals ("5") && saveAsCheck == true)
	    {
		f.saveFile ();
	    }
	    else if (choice.equals ("6"))
		f.saveAsFile ();
	    else if (choice.equals ("7") && saveCheck == true)
	    {
		break;
	    }
	    else if ((choice.equals ("1") || choice.equals ("2") || choice.equals ("7")) && saveCheck == false)
	    {
		f.confirmChoice (choice);
		if (confirm != 'y' && choice.equals ("1"))
		    f.askData ();
		else if (confirm != 'y' && choice.equals ("2"))
		    f.openFile ();
		else if (confirm != 'y' && choice.equals ("7"))
		    break;
	    }
	    else if (choice.equals ("5") && saveAsCheck == false)
		f.saveAsFile ();
	    else
	    {
		new Message ("Enter A Valid Option!", "Error!");
	    }
	}
	f.goodbye ();
    }
}



