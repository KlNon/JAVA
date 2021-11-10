package CLASS_JAVA.Step2.Class_2.behavior.Swim;

public class NoSwim implements Swim{
    @Override
    public void act() {
        System.out.println("不能游泳");
    }
}