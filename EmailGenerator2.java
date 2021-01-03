/*
// The "EmailGenerator2" class.
Used to generate random sequences of words for email names.
@author Sophia Nguyen
*/
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import hsa.Console;


public class EmailGenerator2
{
    public EmailGenerator2 ()
    {
    }


    public String randDomain (String fileName)
    {
	String domain = "";
	BufferedReader input;
	BufferedReader input2;
	int counter = 0;

	try
	{
	    input = new BufferedReader (new FileReader (fileName));
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
	    input2 = new BufferedReader (new FileReader (fileName));
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
	domain = list [randNum];
	return domain;
    }


    public String randEmail (String namesFile, String wordsFile)
    {
	//read names from file to array
	BufferedReader input;
	BufferedReader input2;
	int counter1 = 0;

	try
	{
	    input = new BufferedReader (new FileReader (namesFile));
	    while (input.readLine () != null)
	    {
		counter1++;
	    }
	    input.close ();
	}
	catch (IOException e)
	{
	}
	String[] names = new String [counter1];

	try
	{
	    input2 = new BufferedReader (new FileReader (namesFile));
	    for (int i = 0 ; i < counter1 ; i++)
	    {
		names [i] = input2.readLine ();
	    }
	    input2.close ();
	}
	catch (IOException e)
	{
	}

	//read words from file to an array
	BufferedReader input3;
	BufferedReader input4;
	int counter2 = 0;

	try
	{
	    input3 = new BufferedReader (new FileReader (wordsFile));
	    while (input3.readLine () != null)
	    {
		counter2++;
	    }
	    input3.close ();
	}
	catch (IOException e)
	{
	}
	String[] words = new String [counter2];

	try
	{
	    input4 = new BufferedReader (new FileReader (wordsFile));
	    for (int i = 0 ; i < counter2 ; i++)
	    {
		words [i] = input4.readLine ();
	    }
	    input4.close ();
	}
	catch (IOException e)
	{
	}

	int num1 = ((int) (Math.random () * counter1));
	int num2 = ((int) (Math.random () * counter2));
	String word1 = names [num1];
	String word2 = words [num2];
	int rand1 = ((int) (Math.random () * (word1.length () - 2)) + 2);
	int rand2 = ((int) (Math.random () * (word2.length () - 2)) + 2);
	word1 = word1.substring (0, rand1);
	word2 = word2.substring (0, rand2);
	return (word1 + word2);
    }


    public String generateEmail ()
    {
	String email = "";
	email += randEmail ("names.txt", "words.txt");
	//email += "@";
	//email += randDomain ("domains.txt");
	return email;
    }


    public static void main (String[] args)
    {
	EmailGenerator2 a = new EmailGenerator2 ();
	for (int i = 1 ; i <= 100 ; i++)
	{
	    System.out.println (a.generateEmail ());
	}
    } // main method
} // EmailGenerator2 class
