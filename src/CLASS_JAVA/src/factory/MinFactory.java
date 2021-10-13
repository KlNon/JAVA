package CLASS_JAVA.src.factory;

public class MinFactory extends OperatorFactory{
    @Override
    public Operator createOperator() {
        return new Min();
    }
}
