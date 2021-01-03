import java.awt.*;
import hsa.Console;

public class Design
{
    Console c;
    char character;
    public Design ()
    {
	c = new Console ("Design");
    }


    public void userInput ()
    {
	c.print ("Enter the character: ");
	character = c.readChar ();
    }


    public void createDesign (char character)
    {
	
    }


    public void createDesign (int base, int height)
    {
	
    }


    public void display ()
    {
	c.clear ();
	createDesign (character);
    }



    public static void main (String[] args)
    {
	Design d = new Design ();
	d.userInput ();
	d.display ();

    }
}
