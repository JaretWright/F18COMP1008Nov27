package f18comp1008nov20;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class ExperimentingWithCustomException {
    public static void main(String[] args)
    {
        System.out.print("How much snow is expected today? ");
        Scanner keyboard = new Scanner(System.in);
        int snowDepth = keyboard.nextInt();
        
        if (snowDepth > 10 && snowDepth <= 20)
            throw new SnowFallingException();
        
        if (snowDepth > 20)
            throw new SnowFallingException("Better buy a snow blower too");
    }
}
