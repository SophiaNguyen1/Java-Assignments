import java.awt.*;
import java.io.*;

public class StudentMarksB


{
public StudentMarksB()
{}
  public void displayStudentMarks (String fileName)
  {
  String[][] studentMarks;
  BufferedReader input;
  BufferedReader input2;
  int counter = 0;
  try
  {
  input = new BufferedReader (new FileReader (fileName));
  while (input.readLine() != null)
  {
    counter++;
  }
  input.close();
  }
  catch (IOException e)
  {
  }
  studentMarks = new String [counter/2][2];
  try
  {
  input2 = new BufferedReader (new FileReader (fileName));
  for (int i = 0; i < studentMarks.length; i++)
  {
    studentMarks[i][0] = input2.readLine();
    studentMarks[i][1] = input2.readLine();
  }
  input2.close();
  }
  catch (IOException e)
  {
  }

  //sorting 
  for (int i = 0 ; i < studentMarks.length - 1 ; i++)
  {
      int alphabeticallyFirst = i; //sets alphabeticallyFirst to current element number
      for (int x = i + 1 ; x < studentMarks.length ; x++)
      {
        if (studentMarks [x] [0].compareTo(studentMarks [alphabeticallyFirst] [0])<0)
        {
          alphabeticallyFirst = x;
        }
      }
      //swaps the maximum element with the first element
      String[] temp = studentMarks [alphabeticallyFirst];  //declares string array and stores second (maximum) value of swap in temporary string array
      studentMarks [alphabeticallyFirst] = studentMarks [i]; //swaps first value into second (maximum) value position
      studentMarks [i] = temp; //swaps second (maximum) value from temp into the first value position
  }
  
for (int i = 0; i < studentMarks.length; i++)
  {
  System.out.print (studentMarks[i][0] + "\t");
  System.out.println (studentMarks[i][1]);
  }
  }
  public static void main (String[]args) 
  {
    StudentMarksB

 test = new StudentMarksB

();
    test.displayStudentMarks("A7-1.txt");
  }
}
