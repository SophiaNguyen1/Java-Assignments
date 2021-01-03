public class Student //Student class
{
    //global instance variables
    public String name; //name
    public int mark1; //first mark
    public int mark2; //second mark
    public double average; //average
    
    /*
     *This method is the class constructor. It allocates memory for a Student object. It takes in a name argument and gives the instance variables values.
     */
    public Student (String n)  //name parameter
    {
        name = n; //sets name to string passed in parameter
        mark1 = 0; //sets first mark to 0
        mark2 = 0; //sets second mark to 0
        average = 0.0; //sets average to 0.0
    }


    /*
     *This method is the setMarks method. It takes 2 integer arguments and sets the mark variables to those values.  
     */
    public void setMarks (int x, int y)  //int x and y parameters
    {
        mark1 = x; //sets first mark to x value
        mark2 = y; //sets second mark to y value
    }


    /*
     * This method is the calcAverage method. It calculates the average by adding both mark variables and dividing the result by 2.
     */
    public void calcAverage ()
    {
        average = (mark1 + mark2) / 2; //sets average to half of the sum of the first mark and the second mark
    }


    /*
     * This method is the message return method. It returns a String that displays the user's average.
     */
    public String message ()
    {
        //returns a message that tells the user their average
        return name + " You got an " + average;
    }
    
    /*
     * This method is the main method. It creates new Student objects and calls each instance method.  
     */
    public static void main (String [] args)
    {
      //creates 5 new Student objects  
      Student s1 = new Student ("Sophia"); //creates the first Student object named s1 and passes in "Sophia" as name argument into the class constructor
      Student s2 = new Student ("Alyssa"); //creates the second Student object named s2 and passes in "Alyssa" as name argument into the class constructor
      Student s3 = new Student ("Hannah"); //creates the third Student object named s3 and passes in "Hannah" as name argument into the class constructor
      Student s4 = new Student ("Maya"); //creates the fourth Student object named s4 and passes in "Maya" as name argument into the class constructor
      Student s5 = new Student ("Megan"); //creates the fifth Student object named s5 and passes in "Megan" as name argument into the class constructor
      //calls the setMarks method and passes in grades as arguments
      s1.setMarks (81, 90); //sets marks for s1 and passes in 81 and 90 as arguments 
      s2.setMarks (85, 99); //sets marks for s2 and passes in 85 and 99 as arguments
      s3.setMarks (71, 99); //sets marks for s3 and passes in 71 and 99 as arguments
      s4.setMarks (77, 95); //sets marks for s4 and passes in 77 and 95 as arguments
      s5.setMarks (95, 89); //sets marks for s5 and passes in 95 and 89 as arguments
      //calls the calcAverage method 
      s1.calcAverage (); //calculates average for s1
      s2.calcAverage (); //calculates average for s2
      s3.calcAverage (); //calculates average for s3
      s4.calcAverage (); //calculates average for s4
      s5.calcAverage (); //calculates average for s5
      //calls the message return method and prints out the Strings
      System.out.println (s1.message ()); //prints out message for s1
      System.out.println (s2.message()); //prints out message for s2
      System.out.println (s3.message()); //prints out message for s3
      System.out.println (s4.message()); //prints out message for s4
      System.out.println (s5.message()); //prints out message for s5
    }
}
