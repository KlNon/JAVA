package CLASS_JAVA.src.abstractfactory;

public class TCLFactory extends ProductFactory{
    @Override
    public TV createTV() {
        return new TCLTV();
    }

    @Override
    public AirCondition createAir() {
        return new TCLAir();
    }
}
