import java.awt.*;
import hsa.Console;
/*
Sophia and Alyssa
Ms.Krasteva
Oct. 1, 2018
This program will display a greeting card for National Donkey Day.
*/
public class GreetingCard
{
    Console c;
    public GreetingCard ()
    {
	c = new Console (30, 75, "National Donkey Day Greeting Card");
    }


    public void output ()
    {
	//background colour
	c.setColor (Color.pink);
	c.fillRect (9, 9, 800, 800);
	//title
	c.setFont (new Font ("Serif", Font.BOLD, 42));
	Color titleColor = new Color (160, 82, 45);
	c.setColor (titleColor);
	c.drawString ("Happy National ", 170, 50);
	c.drawString ("Donkey Day!", 200, 100);
	//bubbles design
	Color bubblesColor = new Color (210, 105, 30);
	c.setColor (bubblesColor);
	c.drawOval (50, 50, 30, 30);
	c.drawOval (60, 55, 40, 40);
	c.drawOval (110, 28, 18, 18);
	c.drawOval (510, 30, 30, 30);
	c.drawOval (550, 50, 30, 30);
	c.drawOval (530, 72, 15, 15);
	//donkey
	Color donkeyColor = new Color (205, 133, 63);
	c.setColor (donkeyColor);
	c.fillOval (240, 180, 150, 150); //head
	c.fillOval (267, 270, 100, 70); //nose
	c.fillOval (240, 173, 20, 50); //left ear
	c.fillOval (370, 172, 20, 50); //right ear
	c.fillOval (215, 300, 200, 225); //body
	Color donkeyColor2 = new Color (222, 184, 135);
	c.setColor (donkeyColor2);
	c.fillOval (265, 340, 100, 120); //body
	c.setColor (Color.black);
	c.drawOval (267, 270, 100, 70); //nose outline
	c.drawArc (240, 173, 20, 50, 345, 270); //left ear
	c.drawArc (370, 172, 20, 50, 260, 300); //right ear
	c.fillOval (335, 240, 30, 30); //right eye
	c.fillOval (267, 240, 30, 30); //left eye
	c.fillOval (293, 300, 6, 6); //left nostril
	c.fillOval (340, 300, 6, 6); //right nostril
	c.drawArc (267, 260, 100, 70, 220, 110); //smile
	c.setColor (Color.white);
	c.fillOval (340, 250, 5, 5); //right eye shine
	c.fillOval (272, 250, 5, 5); //left eye shine








    }


    public static void main (String[] args)
    {
	GreetingCard g = new GreetingCard ();
	g.output ();
    }
}
