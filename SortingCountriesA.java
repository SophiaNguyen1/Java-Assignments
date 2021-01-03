import java.awt.*;
import java.io.*;

public class SortingCountriesA 
{
  public SortingCountriesA()
  {}
  public void displayCountries (String fileName)
  {
  String[] countryNames;
  String[] capitalCities;
  String[] area;
  String[] population;
  
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
  countryNames = new String [counter];
  capitalCities = new String [counter];
  area = new String [counter];
  population = new String [counter];
  
  try
  {
  input2 = new BufferedReader (new FileReader (fileName));
  for (int i = 0; i < counter; i++)
  {
    String[] temp = input2.readLine().split(" ");
    if (temp.length == 4)
    {
      countryNames [i] = temp [0]; 
      capitalCities [i] = temp [1];
      area [i] =  temp [2];
      population [i] = temp [3];
    }
    else
    {
      if (temp[0].equals ("Andorra")||temp[0].equals ("Brunei"))
      {
        countryNames [i] = temp [0]; 
        capitalCities [i] = temp [1] + " " + temp [2] + " " + temp [3];
        area [i] =  temp [4];
        population [i] = temp [5];
      }
      else if (temp[0].equals ("Antigua")||temp[0].equals ("Papua")||temp[1].equals ("Arab"))
      {
        countryNames [i] = temp [0] + " " + temp[1] + " " + temp [2]; 
        capitalCities [i] = temp [3] + " " + temp[4];
        area [i] =  temp [5];
        population [i] = temp [6];
      }
      else if (temp[0].equals ("Congo,") && temp[1].equals ("Republic")||temp[0].equals ("Bosnia")||temp[0].equals ("Central")||temp[0].equals ("Trinidad"))
      {
        countryNames [i] = temp [0] + " " + temp[1] + " " + temp [2]; 
        capitalCities [i] = temp [3];
        area [i] =  temp [4];
        population [i] = temp [5];
      }
      else if (temp[0].equals ("Congo,") && temp[1].equals ("Democratic")||temp[1].equals ("Vincent"))
      {
        countryNames [i] = temp [0] + " " + temp[1] + " " + temp [2]+" " + temp[3] + " " + temp[4]; 
        capitalCities [i] = temp [5];
        area [i] =  temp [6];
        population [i] = temp [7];
      }
      else if (temp[0].equals("Korea,")||temp[0].equals ("Cape")||temp[0].equals ("East")||temp[0].equals ("Equatorial")||temp[1].equals ("d'Ivoire") || temp[0].equals ("Czech")||temp[0].equals ("Burkina")||temp[0].equals("Marshall")||temp[0].equals("Myanmar")||temp[1].equals("Zealand")||temp[1].equals("Lucia")||temp[0].equals("Saudi")||temp[0].equals("Sierra")||temp[0].equals("Solomon")||temp[1].equals("Africa")||temp[0].equals("Sri")||temp[1].equals("Kingdom"))
      {
        countryNames [i] = temp [0] + " " + temp [1]; 
        capitalCities [i] = temp [2];
        area [i] =  temp [3];
        population [i] = temp [4];
      }
      else if (temp[0].equals ("Bolivia")||temp[0].equals ("Belarus")||temp[0].equals ("Argentina")||temp[0].equals ("Cambodia")||temp[0].equals("Ethiopia")||temp[0].equals("Grenada")||temp[0].equals("Guatemala")||temp[0].equals("India")||temp[0].equals("Kuwait")||temp[0].equals("Malaysia")||temp[0].equals("Mauritius")||temp[0].equals("Mexico")||temp[0].equals("Mongolia")||temp[0].equals("Panama")||temp[0].equals("Ukraine"))
      {
        countryNames [i] = temp [0]; 
        capitalCities [i] = temp [1] + " " + temp[2];
        area [i] =  temp [3];
        population [i] = temp [4];
      }
     

      else if (temp[0].equals ("Costa") || temp[0].equals ("Dominican")||temp[0].equals ("El")||temp[1].equals ("Marino")||temp[1].equals ("States"))
      {
        countryNames [i] = temp [0] + " " + temp[1]; 
        capitalCities [i] = temp [2] + " " + temp [3];
        area [i] =  temp [4];
        population [i] = temp [5];
      }
      else if (temp[1].equals ("Kitts"))
      {
        countryNames [i] = temp [0] + " " + temp[1]+" " + temp[2] + " " + temp[3]; 
        capitalCities [i] = temp [4];
        area [i] =  temp [5];
        population [i] = temp [6];
      }
      else if (temp[0].equals ("São"))
      {
        countryNames [i] = temp [0] + " " + temp[1]+" " + temp[2] + " " + temp[3]; 
        capitalCities [i] = temp [4]+" " + temp[5];
        area [i] =  temp [6];
        population [i] = temp [7];
      }

      else if (temp[0].equals ("Vatican")||temp[0].equals("Western"))
      {
      countryNames [i] = temp [0] + " " + temp[1]; 
      capitalCities [i] = " ";
      area [i] =  temp [4];
      population [i] = temp [5];
      }
      else if (temp[0].equals ("Comoros")||temp[0].equals ("Chad"))
      {
        countryNames [i] = temp [0]; 
      capitalCities [i] = temp[2];
      area [i] =  temp [3];
      population [i] = temp [4];
      }
      
    }
  }
  input2.close();
  }
  catch (IOException e)
  {
  }
  
  for (int i = 0; i < countryNames.length; i++)
  {
    if (countryNames[i].length()<=10)
    {
    System.out.print (countryNames[i] + "\t\t\t\t");
    }
    else if (countryNames[i].equals ("Congo, Democratic Republic of the"))
    {
      System.out.print (countryNames[i] + "\t");
    }
    else if (countryNames[i].length()>=21)
    {
      System.out.print (countryNames[i] + "\t\t");
    }
    else 
    {
      System.out.print (countryNames[i] + "\t\t\t");
    }
    if (capitalCities[i].length()<=10)
    {
      System.out.print (capitalCities[i] + "\t\t\t\t");
    }
    else if (capitalCities[i].length()>=21)
    {
      System.out.print (capitalCities[i] + "\t\t");
    }
    else 
    {
      System.out.print (capitalCities[i] + "\t\t\t");
    }

    System.out.print (area[i] + "\t\t\t");
    System.out.println (population[i] + "\t\t\t");
  }
  }
  
  public static void main (String[]args) 
  {
    SortingCountriesA test = new SortingCountriesA ();
    test.displayCountries("Countries-Population.txt");
  }
}
