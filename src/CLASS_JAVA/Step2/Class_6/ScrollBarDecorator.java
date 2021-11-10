package CLASS_JAVA.Step2.Class_6;

public class ScrollBarDecorator extends ComponentDecotator{
    public ScrollBarDecorator(Component component){
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条!");
    }
}
