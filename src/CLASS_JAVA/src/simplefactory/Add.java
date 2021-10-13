package CLASS_JAVA.src.simplefactory;

public class Add implements Operator{
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue+rvalue;
    }
}
