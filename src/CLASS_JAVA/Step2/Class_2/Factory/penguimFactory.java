package CLASS_JAVA.Step2.Class_2.Factory;

import CLASS_JAVA.Step2.Class_2.Bird.Bird;
import CLASS_JAVA.Step2.Class_2.Bird.penguim;

public class penguimFactory implements BirdFactory{
    @Override
    public Bird createBird() {
        return new penguim();
    }
}
