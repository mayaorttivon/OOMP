public class IllegalLength extends Exception{

    public IllegalLength(String className, double min, double max)
    {
        super( className + " Length should be no less than " + min + " and no more than " + max);
    }
    public IllegalLength(String msg)
    {
        super(msg);
    }

}
