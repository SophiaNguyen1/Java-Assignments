// The "StoreDouble" class.
import java.awt.*;
import java.io.*;
import hsa.Console;
import hsa.Message;

public class StoreDouble
{
    static Console c;           // The output console
    static final int ARRAY_SIZE = 20;
    double[] doubles = new double [ARRAY_SIZE];

    public void getAndStoreInput ()
    {
	PrintWriter output;
	int numOfDoubles = 0;
	String userInput;

	while (true)
	{
	    c.clear ();
	    try
	    {
		c.print ("Enter how many doubles you wish to have: ");
		userInput = c.readLine ();
		numOfDoubles = Integer.parseInt (userInput);

		if (numOfDoubles < 1 || numOfDoubles > 20)
		{
		    new Message ("You must enter a number between 1 - 20", "Error!");
		    continue;
		}

	    }
	    catch (NumberFormatException e)
	    {
		new Message ("You must enter a number between 1 - 20", "Error!");
		continue;
	    }

	    for (int x = 1 ; x <= numOfDoubles ; x++)
	    {
		c.print ("Enter an double " + (x) + ": ");
		doubles [x - 1] = c.readDouble ();
	    }

	    try
	    {

		output = new PrintWriter (new FileWriter ("Stored_Doubles.txt"));
		for (int x = numOfDoubles - 1 ; x >= 0 ; x--)
		    output.println (doubles [x]);
		output.close ();
	    }
	    catch (IOException e)
	    {
		new Message ("An I/O Error Occured");
		continue;
	    }
	    break;
	}


    }


    public void displayInput ()
    {
	BufferedReader input;
	String line;
	double doublesLine;
	char continueChar;

	c.clear ();
	c.println ("Do you want to open the file?");
	c.println ("Press 'y' to open the file or press anything else to continue");
	continueChar = c.getChar ();
	if (continueChar == 'y')
	{
	    try
	    {
		input = new BufferedReader (new FileReader ("Stored_Doubles.txt"));
		try
		{
		    for (int x = ARRAY_SIZE ; x >= 0 ; x--)
		    {
			line = input.readLine ();
			doublesLine = Double.parseDouble (line);
			c.println (doublesLine, 0, 2);
		    }
		}
		catch (NullPointerException e)
		{
		}
	    }
	    catch (IOException e)
	    {
		new Message ("An I/O Error Occured");
	    }

	}
	else
	{
	    c.clear ();
	    c.print ("Goodbye");
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	StoreDouble a = new StoreDouble ();
	a.getAndStoreInput ();
	a.displayInput ();
    }
} // StoreDouble class


