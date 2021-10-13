package CLASS_JAVA.src.abstractfactory;

public class Test {
    public static void main(String[] args){
        ProductFactory factory = new HaierFactory();
        AirCondition ac = factory.createAir();
        factory = new TCLFactory();
        TV TV = factory.createTV();
        ac.working();
        TV.playing();
    }
}
