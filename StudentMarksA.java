import java.awt.*;
import java.io.*;

public class StudentMarksA 
{
  public StudentMarksA()
  {}
  public void displayStudentMarks (String fileName)
  {
  String[][] studentMarks;
  BufferedReader input;
  BufferedReader input2;
  String line = "";
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
  for (int i = 0; i < studentMarks.length; i++)
  {
  System.out.print (studentMarks[i][0] + "\t");
  System.out.println (studentMarks[i][1]);
  }
  }
  public static void main (String[]args) 
  {
    StudentMarksA test = new StudentMarksA ();
    test.displayStudentMarks("A7-1.txt");
  }
}
