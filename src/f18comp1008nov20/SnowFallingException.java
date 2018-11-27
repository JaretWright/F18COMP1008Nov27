package f18comp1008nov20;

/**
 *
 * @author jwright
 */
public class SnowFallingException extends RuntimeException{
    
    //no argument constructor
    public SnowFallingException()
    {
        super("too much snow to code today...");
    }
    
    //constructor that accepts a message
    public SnowFallingException(String message)
    {
        super(message);
    }
    
    //constructor that accepts a throwable (or another exception) as input
    public SnowFallingException(Throwable throwable){
        super(throwable);
    }
    
    //constructor that accepts a throwable and a message as input
    public SnowFallingException(String message, Throwable throwable){
        super(message,throwable);
    }
    
}
