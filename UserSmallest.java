
/**
 * This Class finds the lowest number entered by a user. The user chooses the amount of numbers.
 * @aut (Marcus Graves) 
 */
import java.util.Scanner;
public class Smallest
{
    // instance variables 
    private int values;
    private int number;
    private int smallest;
    public void getValues()
    { 
        System.out.print("Enter the number of integer values to compare: ");
        //Gets input for amount of numbers to use.
        Scanner input = new Scanner(System.in);
        values = input.nextInt();
        
        for( int i=1; i<= values; i++)
        {
            //Asks user for values.
            System.out.printf( "Enter an integer for value %d: ", i);
            number =input.nextInt();
        
            if( i==1)
                //Sets smallest number to variable smallest.
                smallest = number;
                else if(number < smallest)
                smallest = number;
       }
        System.out.printf( "The smallest integer is %d\n\n", smallest );
    }
}
