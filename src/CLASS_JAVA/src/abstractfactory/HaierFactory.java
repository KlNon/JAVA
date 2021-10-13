package CLASS_JAVA.src.abstractfactory;

public class HaierFactory extends ProductFactory{
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public AirCondition createAir() {
        return new HaierAir();
    }
}
