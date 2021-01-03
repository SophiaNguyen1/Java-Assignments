public class Bank_Account //Bank_Account class
{
    //global instance variables
    public long acct_num; //accout number
    private double balance; //remaining balance
    private String type; //type of account
    private float interest_rate; //interest rate 
    
    /*
     * This method is the class constructor. It allocates memory for the Bank_Account object. 
     * It takes in arguments for the account number, balance, type, and interest. It sets values for the instance variables. 
     */
    public Bank_Account (long acct, double bal, String ty, float interest) //account number, balance, type, and interest arguments
    {
        acct_num = acct; //sets acct_num to acct
        balance = bal; //sets balance to bal
        type = ty; //sets type to ty
        interest_rate = interest; //sets interest_rate to interest 
    }


    /*
     * This method is the getBalance return method. It returns the balance in the account.  
     */
    public double getBalance ()
    {
      return balance; //returns the balance in the account
    }
    
    /*
     * This method is the getType return method. It returns the type of the account. 
     */
    public String getType ()
    {
      return type; //returns the account type 
    }
    
    /*
     * This method is the deposit method. It takes an argument for the amount of money to deposit. 
     * It adds the amount of money to the account balance. 
     */
    public void deposit (double amt) //amount of money to deposit argument 
    {
      balance += amt; //adds the amount of money to the balance 
    }
    
    /*
     * This method is the withdrawal return method. It takes an argument for the amount of money to withdraw. 
     * If the balance is greater or equal to the amount of money, it subtracts the amount of money from the account balance and returns true. 
     * If the balance is less than the amount of money the user wishes to withdraw, it does not withdraw anything and returns false. 
     */
    public boolean withdrawal (double amt) //amount of money to withdraw argument 
    {
      //if the balance is greater than or equal to the amount
      if (balance >= amt)
      {
        //subtracts amount of money from the balance
        balance -= amt;
        //returns true because the withdrawal was successful
        return true;
      }
      //if the balance is less than the amount 
      else 
      {
        //does not withdrawal any money and returns false because the withdrawal was unsuccessful
        return false; 
      }
    }
    
    /*
     * This method is the applyInterest method. It increases the balance by the interest rate. 
     */
    public void applyInterest ()
    {
      balance += balance * interest_rate; //increases balance by the interest rate 
    }
    
    /*
     * This method is the main method. It creates Bank_Account objects and calls the instance methods.
     */
    public static void main (String [] args)
    {
      //creates 2 Bank_Account objects and passes in arguments for the account number, balance, type, and interest rate 
      Bank_Account acc1 = new Bank_Account (452466524, 1000, "savings", (float)0.02); //creates first Bank_Account object named acc1
      Bank_Account acc2 = new Bank_Account (713426427, 5000, "chequing", (float)0.01); //creates second Bank_Account object named acc2
      //calls each instance method for acc1  
      acc1.deposit (100); //calls deposit for acc1 and passes in 100 as the deposit amount
      acc1.applyInterest (); //calls applyInterest for acc1 
      acc1.withdrawal (50); //calls withdrawal for acc1 and passes in 50 as the withdrawal amount
      acc1.getBalance (); //calls getBalance for acc1
      acc1.getType (); //calls getType for acc1 
      //calls each instance method for acc2  
      acc2.deposit (500); //calls deposit for acc2 and passes in 500 as the deposit amount
      acc2.applyInterest (); //calls applyInterest for acc2 
      acc2.withdrawal (150); //calls withdrawal for acc2 and passes in 150 as the withdrawal amount
      acc2.getBalance (); //calls getBalance for acc2
      acc2.getType (); //calls getType for acc2 
    }
}
