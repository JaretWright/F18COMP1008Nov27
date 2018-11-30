package f18comp1008nov20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class DivideZeroExceptionHandling {
    
    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    
    public static void main(String[] args)
    {
        boolean continueAsking=true;
        
        do{
            try{
                Scanner keyboard = new Scanner(System.in);

                //prompt the user for the numerator
                System.out.print("Enter a numerator: ");
                int numerator = keyboard.nextInt();

                //prompt the user for the denominator
                System.out.print("Enter a denominator: ");
                int denominator = keyboard.nextInt();

                //call the quotient method and display the result returned
                System.out.printf("%d/%d=%d%n", numerator, denominator, 
                                                quotient(numerator,denominator));
                continueAsking = false;   //if we made it to here, we had valid inputs
            }
            catch(InputMismatchException e)
            {
                System.out.println("You need to enter an integer numerically");
            }
            catch(ArithmeticException e)
            {
                System.out.printf("There was a mathetical error: %s%n", e.getMessage());
            }
            catch(Exception e)
            {
                System.out.println("There was an error: "+e.getMessage());
            }
            finally
            {
                System.out.println("\nthis code will always execute before the method"
                        + "closes...even if an exception was thrown");
            }
        } while(continueAsking);
        
    }
}
