import java.awt.*;
import java.io.*;
import java.util.*;
public class StudentMarksA 
{
  public StudentMarksA ()
  {
  }
  
  public void testy()
  {
    int[]nums = new int[5];
    for (int i = 0; i < 5; i++)
    {
      nums[i]=5;
    }
    System.out.println (Arrays.toString(nums));
  }
  
  public void display ()
  {
  BufferedReader input;
  BufferedReader input2;
  int counter = 0;
  try
  {
      input = new BufferedReader (new FileReader ("A7-1.txt"));
  while (input.readLine() != null)
  {
    counter++;
  }
  input.close();
  }
  catch (Exception e)
  {}
  
  ArrayList<String> studentMarks = new ArrayList<String>(counter);
  try
  {
  input2 = new BufferedReader (new FileReader ("A7-1.txt"));
  for (int i = 0; i < counter; i++)
  {
    studentMarks.add (input2.readLine());
  }
  input2.close();
  } 
  catch (Exception e)
  {}
  for (int i = 0; i < studentMarks.size();i+=2)
  {
      System.out.print (studentMarks.get (i));
      System.out.print ("     ");
      System.out.println (studentMarks.get(i+1));
  }
  }
  public static void main (String[]args)
  {
    StudentMarksA test = new StudentMarksA ();
    test.testy ();
  }
}