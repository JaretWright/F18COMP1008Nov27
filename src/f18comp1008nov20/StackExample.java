package f18comp1008nov20;

/**
 *
 * @author jwright
 */
public class StackExample {
    public static void main(String[] args)
    {
        firstMethod();
        Thread.dumpStack();
    }
    
    public static void firstMethod()
    {
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod()
    {
        Thread.dumpStack();
    }
}
