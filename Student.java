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
      //creates an array of student objects
      Student [] students = new Student [5];
      //creates student objects for each element and passes in names as arguments into the constructor  
      students [0]= new Student ("Sophia"); //creates the first student object
      students [1]= new Student ("Alyssa"); //creates the second student object
      students [2]= new Student ("Hannah"); //creates the third student object
      students [3]= new Student ("Maya"); //creates the fourth student object
      students [4]= new Student ("Megan"); //creates the fifth student object
      //int array to store marks 
      int [][] marksSet1 = {{81,85,71,77,95},{90,99,99,95,89}};
      //for loops run from 0 to 4 
      for (int i = 0; i < students.length; i++)
      {
        //calls each method for each student object
        //calls setMarks for each student and sets their marks to the corresponding values in the marksSet1 array 
        students [i].setMarks (marksSet1[0][i], marksSet1[1][i]);
        //calls calcAverage for each student
        students[i].calcAverage ();
        //calls message for each student
        System.out.println (students[i].message ());
      }
      //creates a new array of student objects
      Student [] students2 = new Student [10];
      //for loops run from 0 to 4 
      for (int i = 0; i < students.length; i++)
      {
        //transfers 5 student objects from first array to second array
        students2 [i] = students [i];
      }
      //creates new Student object at position 8
      students2 [8] = new Student ("Kayla");
      //calls setMarks for new Student object and passes in 90 and 95 as arguments
      students2 [8].setMarks (90, 95);
      //calls calcAverage for new Student object 
      students2 [8].calcAverage ();
      
      //totalAvg variable to calculate the total average of all the students
      double totalAvg = 0.0; 
      //counter variable to count the number of students
      int counter = 0;
      //for loop runs from 0 to 9
      for (int i = 0; i < students2.length; i++)
      {
        //if the student object in the array is not equal to null
        if (students2[i]!= null)
        {
         //adds one to the counter
         counter++;
         //adds each student's mark 1 and mark 2 to the totalAvg
         totalAvg+=(students2[i].mark1 + students2[i].mark2);
         //prints out information and averages
         System.out.println (students2[i].name); //prints out each student's name 
         System.out.println (students2[i].mark1); //prints out each student's mark 1
         System.out.println (students2[i].mark2); //prints out each student's mark 2
         System.out.println (students2[i].average); //prints out each student's average
        }
      }
      //divides the sum of all the marks by 2 and then by the counter to get the total average 
      totalAvg = (totalAvg/2)/counter;
      //prints out the total average
      System.out.println ("The total average of all the students is " + totalAvg);
    }
}
