package CLASS_JAVA.Step2.Class_6;

public class BlackBorderDecorator extends ComponentDecotator{
    public BlackBorderDecorator(Component component){
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorderDecorator();
        super.display();
    }

    public void setBlackBorderDecorator(){
        System.out.println("为构件增加黑色边框!");
    }
}
