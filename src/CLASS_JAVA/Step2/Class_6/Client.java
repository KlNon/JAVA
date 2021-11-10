package CLASS_JAVA.Step2.Class_6;

public class Client {
    public static void main(String[] args) {
        Component component,componentSB;
        component=new Window();
        componentSB= new ScrollBarDecorator(component);
        componentSB.display();
    }
}
