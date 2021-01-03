public class ExponentRecursion
{
public static void main(String args[])
{
//The initial call to method power supplying two
//arguments, 2 as the base and 4 as the exponent
System.out.println( "The answer is " + power(2,-4));
}
static int power(int base , int exponent)
{
//check to see if base case hase been reached, exponent is 0
if(exponent < 1)
return 1;
else
//return the value of 2 multiplied by a recursive call to
//power with a continually diminishing value of exponent
return base * power(base, exponent - 1);
}
}