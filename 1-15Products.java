
/**
 * This program calculates the product of odd integers from 1-15.
 * 
 * @author (marcus graves) 
 */
public class Calculate
{
    // instance variables
    private int product = 1;
    
    public Calculate()
    {
        for(int i = 1; i<= 15; i+=2)
        {
            product*= i;
        }
    }

    public void displayCalculation()
    {
       System.out.print(product);
    }
}
