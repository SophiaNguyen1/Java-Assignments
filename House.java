public class House //House class
{
    //global instance variables
    private int street_num; //street number
    private String street; //street name 
    private String city; //city 
    private String province; //province 
    private String postal_code; //postal code 
    private double size; //size in square metres 
    private boolean detached; //detached or not 
    private int stories; //number of stories 
    
    /*
     * This method is the class constructor. It allocates memory for the House object. 
     * It takes in street number, street, city, province, postal code, size, detached, and stories arguments, and sets values for the instance variables. 
     */
    public House (int n, String s, String c, String pv, String p, double si, boolean d, int l) //street number, street, city, province, postal code, size, detached, and stories arguments 
    {
        street_num = n; //sets street number to n 
        street = s; //sets street to s 
        city = c; //sets city to c 
        province = pv; //sets province to pv 
        postal_code = p; //sets postal code to p 
        size = si; //sets size to si
        detached = d; //sets detached to d 
        stories = l; //sets stories to l 
    }


    /*
     * This method is the displayAddress method. It displays the address of the House object in an appropriate format. 
     */
    public void displayAddress ()
    {
      System.out.println (street_num + " " + street); //prints street number and street
      System.out.println (city + "," + province); //prints city and province
      System.out.println (postal_code); //prints postal code 
    }
    
    /*
     * This method is the main method. It creates new House objects and calls the instance method. 
     */
    public static void main (String [] args)
    {
      //creates 5 house objects and passes in arguments for the street number, street name, city, province, postal code, size, detached, and stories, into the constructor
      House h1 = new House (1956, "Stone", "Toronto", "Ontario", "M3N 1S2", 5000, false, 2); //creates first House object named h1
      House h2 = new House (3585, "Creek", "Toronto", "Ontario", "M8N 5V4", 2600, false, 2);//creates first House object named h2
      House h3 = new House (1349, "Weston", "Toronto", "Ontario", "M5S 8K5", 3000, true, 2);//creates first House object named h3
      House h4 = new House (2576, "Jane", "Toronto", "Ontario", "M1N 2F6", 4000, false, 2);//creates first House object named h4
      House h5 = new House (6752, "Sheppard", "Toronto", "Ontario", "M6F 9V3", 6000, false, 3);//creates first House object named h5
      //displays addresses
      h1.displayAddress (); //calls displayAddress for h1
      h2.displayAddress (); //calls displayAddress for h2
      h3.displayAddress (); //calls displayAddress for h3
      h4.displayAddress (); //calls displayAddress for h4
      h5.displayAddress (); //calls displayAddress for h5
    }
}
