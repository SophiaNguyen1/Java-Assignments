/*
// The "AmazonGenerator" class.
Used to generate random sequences of characters that resemble real Amazon gift card codes.
@author Sophia Nguyen
*/
import java.awt.*;
import java.util.*;
import hsa.Console;


public class AmazonGenerator
{
    public AmazonGenerator ()
    {
    }


    public int randNum ()
    {
	return ((int) (Math.random () * 8) + 2);
	//random number
    }


    public char randChar ()
    {
	int h = 73;
	while (h == 73 || h == 79)
	{
	    h = ((int) (Math.random () * 26) + 65);
	}
	return (char) (h);
	//random char
    }


    public String generateCode ()
    {
	String code = "";
	int num = 0;
	for (int i = 1 ; i <= 4 ; i++)
	{
	    num = ((int) (Math.random () * 3) + 1);
	    if (num == 1)
	    {
		code += (randNum ());
	    }
	    else
	    {
		code += (randChar ());
	    }
	}
	code += ("-");
	for (int i = 1 ; i <= 6 ; i++)
	{
	    num = ((int) (Math.random () * 3) + 1);
	    if (num == 1)
	    {
		code += (randNum ());
	    }
	    else
	    {
		code += (randChar ());
	    }
	}
	code += ("-");
	for (int i = 1 ; i <= 4 ; i++)
	{
	    num = ((int) (Math.random () * 3) + 1);
	    if (num == 1)
	    {
		code += (randNum ());
	    }
	    else
	    {
		code += (randChar ());
	    }
	}
	return code;
    }


    public static void main (String[] args)
    {
	AmazonGenerator a = new AmazonGenerator ();
	Random dice = new Random ();
	for (int i = 1 ; i <= 100 ; i++)
	{
	    System.out.println (a.generateCode ());
	}
    } // main method
} // AmazonGenerator class
