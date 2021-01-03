// The "DigitsReverser" class.
import java.awt.*;
import hsa.Console;

public class DigitsReverser
{
    Console c;           // The output console

    public DigitsReverser ()
    {
	c = new Console ();
    }


    public void input ()
    {
	int numbers = c.readInt ();
	System.out.println (revDigits (numbers));
    }


    public int revDigits (int digits)
    {
	if (digits / 10 == 0)
	    return digits;
	return Integer.parseInt(digits % 10 + "" + revDigits(digits / 10));
    }


    public static void main (String[] args)
    {
	DigitsReverser a = new DigitsReverser ();
	a.input ();
	// Place your program here.  'c' is the output console
    } // main method
} // DigitsReverser class
