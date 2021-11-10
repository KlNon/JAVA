package CLASS_JAVA.Step2.Class_2.behavior.fly;

public class NoFly implements Fly{
    @Override
    public void act() {
        System.out.println("不能飞");
    }
}
