package CLASS_JAVA.Step2.Class_6;

public class ComponentDecotator extends Component{
    private Component component;

    public ComponentDecotator(Component component)
    {
        this.component=component;
    }
    @Override
    public void display() {
        component.display();
    }
}
