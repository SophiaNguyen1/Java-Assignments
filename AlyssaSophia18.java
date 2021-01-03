import java.awt.*; //allows access to the java command libraries
import hsa.*; //allows access to the Console class files
import java.io.*; //allows access to the java io class
/*
Alyssa Wang and Sophia Nguyen
Dec. 10, 2018
Ms. Krasteva
This program will create a file and write an integer array that the user inputs to it.
The user will be allowed to save, save as, modify, and sort or display the file contents.
*/
public class AlyssaSophia18 //class called AlyssaSophia18
{
    String fileName = "Untitled";
    String header = "Hello, user. This program was created by Sophia and Alyssa at William Lyon Mackenzie.";
    String choice;
    int[] arrayOfNum;
    int newInput = 0;
    String array1 = "";
    boolean saveCheck = false;

    static Console c; //class that allows the output window to be created
    public AlyssaSophia18 ()  //class constructor
    {
	c = new Console ("Files Input Output"); //creates a new console and names it
    }


    private void pauseProgram ()
    {
	c.println ("Please enter anything to continue: ");
	c.getChar ();
    }


    public void mainMenu ()
    {
	String quitChoice = "yes";
	while (true)
	{
	    c.clear ();
	    c.println ("Main Menu");
	    c.println ();
	    c.println ("1. New");
	    c.println ("2. Open");
	    c.println ("3. Display");
	    c.println ("4. Modify");
	    c.println ("5. Save");
	    c.println ("6. Save as");
	    c.println ("7. Quit");
	    c.println ();
	    while (true)
	    {
		c.setCursor (11, 1);
		c.print ("Please enter 1, 2, 3, 4, 5, 6, or 7:");
		c.println ();
		c.setCursor (11, 38);
		choice = c.readString (); //gets the user input
		if (!(choice.equals ("1") || choice.equals ("2") || choice.equals ("3") || choice.equals ("4") || choice.equals ("5") || choice.equals ("6") || choice.equals ("7")))
		{
		    new Message ("You must enter 1, 2, 3, 4, 5, 6, or 7.");
		}
		else
		{
		    break;
		}
	    }
	    if ((choice.equals ("1") || choice.equals ("2") || choice.equals ("7")) && (!(array1.equals (""))))
	    {
		c.println ("You have unsaved changes. Are you sure you want to continue your action?");
		while (true)
		{
		    c.setCursor (13, 1);
		    c.print ("Please enter 'yes' or 'no'.");
		    c.println ();
		    c.setCursor (13, 29);
		    quitChoice = c.readLine (); //gets the user input
		    if (!(quitChoice.equalsIgnoreCase ("yes") || quitChoice.equalsIgnoreCase ("no")))
		    {
			new Message ("You must enter 'yes' or 'no'.");
		    }
		    else
		    {
			break;
		    }
		}
	    }
	    if (!(choice.equals ("1") || choice.equals ("2") || choice.equals ("7")) || quitChoice.equalsIgnoreCase ("yes"))
	    {
		break;
	    }
	}
	c.println ();
    }


    public void newFile ()
    {
	String input, integer;
	int newInput = 0, newInteger = 0;
	while (true)
	{
	    try
	    {
		c.setCursor (12, 1);
		c.println ("Please enter how many integers you want to put inside the document.");
		c.println ();
		c.setCursor (13, 1);
		input = c.readLine ();
		newInput = Integer.parseInt (input);
		if (newInput <= 0)
		{
		    new Message ("You must enter a positive integer.");
		}
		else
		{
		    break;
		}
	    }
	    catch (Exception e)
	    {
		new Message ("You must enter an integer.");

	    }
	}
	arrayOfNum = new int [newInput];
	while (true)
	{
	    for (int i = 0 ; i < newInput ; i++)
	    {
		try
		{
		    c.setCursor (14 + i, 1);
		    c.println ("Please enter an integer to store inside the document.");
		    c.println ();
		    c.setCursor (14 + i, 55);
		    integer = c.readLine ();
		    newInteger = Integer.parseInt (integer);
		}
		catch (Exception e)
		{
		    new Message ("You must enter an integer.");

		}
		arrayOfNum [i] = newInteger;
	    }
	    break;
	}


	for (int i = 0 ; i < newInput ; i++)
	{
	    array1 += arrayOfNum [i] + " ";
	}


	c.println ("Your numbers have been stored. Use save as to save your file if you want to keepyour numbers.");
	saveCheck = false;
	pauseProgram ();
    }


    public void openFile ()
    {
	BufferedReader reader;
	String integer = "";
	int integer2 = 0;
	c.println ("Please enter the name of the file that you want to open: ");
	fileName = c.readLine ();
	while (true)
	{
	    try
	    {
		reader = new BufferedReader (new FileReader (fileName + ".don"));
		if (!(reader.readLine ().equals (header)))
		{
		    new Message ("This file wasn't made by this program.", "Error!");
		    break;
		}
		//try opening the file
		reader = new BufferedReader (new FileReader (fileName + ".don"));
		String line = ""; // file data var
		int numberOfLine = 0; // count lines in file var
		try
		{
		    //loop for as long as there is data in the file
		    while (line != null)
		    {
			line = reader.readLine (); //read each line in the file
			numberOfLine++; //count the number of lines in the file
		    }
		    reader.close (); //close file
		}
		catch (IOException e)  //catch any file related errors
		{
		    System.out.println (e); //print error
		}
		String[] linesFile = new String [numberOfLine]; //create array with size to match number of lines in file
		try
		{
		    //open the same file again
		    BufferedReader r = new BufferedReader (new FileReader (fileName + ".don")); // reset the buffer
		    int x = 0;
		    while (x < numberOfLine) //loop until end of file is reached
		    {
			linesFile [x] = r.readLine (); //feed each data line into an array
			x++;
		    }
		    r.close (); //close data file
		    c.println ("The file has been opened.");
		}
		catch (IOException e)  //handle file related errors
		{
		    System.out.println (e);
		}
	    }
	    catch (IOException e)
	    {
		new Message ("The file was not found!", "Error!");
	    }
	    break;
	}


	saveCheck = true;
	pauseProgram ();
    }


    public void display ()
    {
	String line = "", line2 = "";
	BufferedReader input;
	while (true)
	{
	    try
	    {
		input = new BufferedReader (new FileReader (fileName + ".don"));
		line = input.readLine ();
		line2 = input.readLine ();
		c.println ("The text in the file " + fileName + ".don" + " is: ");
		c.println (line);
		c.println (line2);
		break;
	    }
	    catch (IOException e)
	    {
		new Message ("You must create a new file and save it or open an existing document before displaying it.");
		break;
	    }
	}
	pauseProgram ();
    }


    public void modify ()
    {
	String input, num, num2, input2, integer;
	int newNum = 0, newNum2 = 0, newInput2 = 0, newInteger = 0;
	String line = "";
	int counter = 0, counter2 = 0, counter3 = 0;
	String notConvertedInt = "";
	int convertedInt = 0;
	String strArray = "1";
	BufferedReader reader;
	while (true)
	{
	    if (array1.equals ("") && saveCheck == false)
	    {
		c.println ("You have not entered any values yet. Please enter values in new file or open an existing file before attempting to modify it.");
		break;
	    }
	    try
	    {
		reader = new BufferedReader (new FileReader (fileName + ".don"));
		while ((strArray = reader.readLine ()) != null)
		{
		    for (int i = 0 ; i < strArray.length () ; i++)
		    {
			if (strArray.charAt (i) == 32)
			{
			    counter2++;
			}
		    }
		}
		reader.close ();
	    }
	    catch (IOException e)
	    {
	    }
	    arrayOfNum = new int [counter2];
	    for (int i = 0 ; i < strArray.length () ; i++)
	    {
		if (strArray.charAt (i) != 32)
		{
		    notConvertedInt += strArray.charAt (i);
		}
		if (i != strArray.length () - 1)
		{
		    if (strArray.charAt (i + 1) == 32)
		    {
			convertedInt = Integer.parseInt (notConvertedInt);
			arrayOfNum [counter3] = convertedInt;
			counter3++;
			notConvertedInt = "";
		    }
		}
	    }
	    c.println ("What would you like to do?");
	    c.println ("1. Change one number of the number line.");
	    c.println ("2. Change the whole number line.");
	    while (true)
	    {
		c.setCursor (16, 1);
		c.print ("Please enter 1 or 2:");
		c.println ();
		c.setCursor (16, 22);
		input = c.readString ();
		if (!(input.equals ("1") || input.equals ("2")))
		{
		    new Message ("You must enter 1 or 2.");
		}
		else
		{
		    break;
		}

	    }
	    while (input.equals ("1"))
	    {
		try
		{
		    c.setCursor (17, 1);
		    c.print ("Which position of the number line do you want to change? ");
		    c.println ();
		    c.setCursor (17, 58);
		    num = c.readString ();
		    newNum = Integer.parseInt (num);
		    if (newNum <= 0 || newNum > arrayOfNum.length)
		    {
			new Message ("There is no position of that number on the number line.");
		    }
		    else
		    {
			break;
		    }
		}
		catch (Exception e)
		{
		    new Message ("You must enter an integer.");
		}
	    }
	    while (input.equals ("1"))
	    {
		try
		{
		    c.setCursor (18, 1);
		    c.print ("What number would you like to replace the number with? ");
		    c.println ();
		    c.setCursor (18, 56);
		    num2 = c.readString ();
		    newNum2 = Integer.parseInt (num2);
		    arrayOfNum [newNum] = newNum2;
		    break;
		}
		catch (Exception e)
		{
		    new Message ("You must enter an integer.");
		}
	    }
	    for (int i = 0 ; i < arrayOfNum.length ; i++)
	    {
		array1 += arrayOfNum [i] + " ";
	    }
	    while (input.equals ("2"))
	    {
		try
		{
		    c.setCursor (17, 1);
		    c.print ("Please enter how many integers you want to put inside the document.");
		    c.println ();
		    c.setCursor (17, 69);
		    input2 = c.readLine ();
		    newInput2 = Integer.parseInt (input2);
		    break;
		}
		catch (Exception e)
		{
		    new Message ("You must enter an integer.");

		}
	    }
	    while (input.equals ("2"))
	    {
		array1 = "";
		for (int i = 0 ; i < newInput2 ; i++)
		{
		    try
		    {
			c.setCursor (18 + i, 1);
			c.print ("Please enter an integer to store inside the document.");
			c.println ();
			c.setCursor (18 + i, 55);
			integer = c.readLine ();
			newInteger = Integer.parseInt (integer);
			array1 += newInteger + " ";
		    }
		    catch (Exception e)
		    {
			new Message ("You must enter an integer.");

		    }
		}
		break;
	    }
	    c.println ("You have successfully modified the numbers.");
	    break;
	}
	pauseProgram ();
    }



    public void saveFile ()
    {
	PrintWriter output;
	while (true)
	{
	    if (array1.equals (""))
	    {
		c.println ("You have not entered any values yet. Please enter values in new file or open an existing file before attempting to save.");
		break;
	    }
	    else if (saveCheck == false)
	    {
		c.println ("You have not used save as yet. You must use save as if you haven't chosen a filename.");
		break;
	    }
	    try
	    {
		output = new PrintWriter (new FileWriter (fileName + ".don"));
		output.println (header);
		output.print (array1);
		output.close ();
	    }
	    catch (IOException e)
	    {
	    }
	    break;
	}


	c.println ("The file has been successfully saved.");
	pauseProgram ();
    }


    public void saveAsFile ()
    {
	PrintWriter output;
	while (true)
	{
	    if (array1.equals (""))
	    {
		c.println ("You have not entered any values yet. Please enter values in new file or open an existing file before attempting to save.");
		break;
	    }
	    c.print ("What would you like to save the file name as? ");
	    fileName = c.readLine ();
	    try
	    {
		output = new PrintWriter (new FileWriter (fileName + ".don"));
		output.println (header);
		output.print (array1);
		output.close ();
	    }
	    catch (IOException e)
	    {
	    }
	    break;
	}


	c.println ("The file has been successfully saved.");
	saveCheck = true;
	pauseProgram ();
    }


    public void quit ()
    {
	c.println ("Thank you for using our program.");
	c.println ("Programmed by: Sophia and Alyssa.");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args) throws IOException  //main method
    {
	AlyssaSophia18 a = new AlyssaSophia18 (); //creates an instance variable and a copy of AlyssaSophia18
	while (true)
	{
	    a.mainMenu ();
	    if (a.choice.equals ("1"))
	    {
		a.newFile ();
	    }
	    else if (a.choice.equals ("2"))
	    {
		a.openFile ();
	    }
	    else if (a.choice.equals ("3"))
	    {
		a.display ();
	    }
	    else if (a.choice.equals ("4"))
	    {
		a.modify ();
	    }
	    else if (a.choice.equals ("5"))
	    {
		a.saveFile ();
	    }
	    else if (a.choice.equals ("6"))
	    {
		a.saveAsFile ();
	    }
	    else
	    {
		break;
	    }
	}
	a.quit ();
    }
}


