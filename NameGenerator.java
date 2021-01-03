/*
The NameGenerator class. 
Used to generate random name combinations.
@author Sophia Nguyen 
*/
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import hsa.Console;


public class NameGenerator
{
    public NameGenerator ()
    {
    }


    public String firstName (String nameFile1)
    {
	String name = "";
	BufferedReader input;
	BufferedReader input2;
	int counter = 0;

	try
	{
	    input = new BufferedReader (new FileReader (nameFile1));
	    while (input.readLine () != null)
	    {
		counter++;
	    }
	    input.close ();
	}
	catch (IOException e)
	{
	}
	String[] list = new String [counter];

	try
	{
	    input2 = new BufferedReader (new FileReader (nameFile1));
	    for (int i = 0 ; i < counter ; i++)
	    {
		list [i] = input2.readLine ();
	    }
	    input2.close ();
	}
	catch (IOException e)
	{
	}
	int randNum = ((int) (Math.random () * counter));
	name = list [randNum];
	return name;
    }


    public String lastName (String nameFile2)
    {
	String name = "";
	//read names from file to array
	BufferedReader input;
	BufferedReader input2;
	int counter1 = 0;

	try
	{
	    input = new BufferedReader (new FileReader (nameFile2));
	    while (input.readLine () != null)
	    {
		counter1++;
	    }
	    input.close ();
	}
	catch (IOException e)
	{
	}
	String[] list = new String [counter1];

	try
	{
	    input2 = new BufferedReader (new FileReader (nameFile2));
	    for (int i = 0 ; i < counter1 ; i++)
	    {
		list [i] = input2.readLine ();
	    }
	    input2.close ();
	}
	catch (IOException e)
	{
	}

	int randNum = ((int) (Math.random () * counter1));
	name = list [randNum];
	name = name.substring (0, 1) + (name.substring (1, name.length ()).toLowerCase ());
	return name;
    }


    public String generateName ()
    {
	String wholeName = "";
	wholeName += firstName ("firstNames.txt");
	wholeName += " ";
	wholeName += lastName ("lastNames.txt");
	return wholeName;
    }


    public static void main (String[] args)
    {
	NameGenerator a = new NameGenerator ();
	for (int i = 1 ; i <= 100 ; i++)
	{
	    System.out.println (a.generateName ());
	}
    } // main method
} // NameGenerator class
