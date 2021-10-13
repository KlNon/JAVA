package CLASS_JAVA.Class_2;

public class MyException extends Exception{
    public MyException()
    {
        super();
    }
    public MyException(String str)
    {
        super(str);
    }
    public MyException(String str,Throwable cause)
    {
        super(str,cause);
    }
    public MyException(Throwable cause)
    {
        super(cause);
    }

}
