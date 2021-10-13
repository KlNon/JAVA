package CLASS_JAVA.src.factory;

public class MulFactory extends OperatorFactory{
    @Override
    public Operator createOperator() {
        return new Mul();
    }
}
