package CLASS_JAVA.src.factory;

public class Add implements Operator {
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue+rvalue;
    }
}
