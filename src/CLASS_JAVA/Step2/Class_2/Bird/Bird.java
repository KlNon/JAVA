package CLASS_JAVA.Step2.Class_2.Bird;

import CLASS_JAVA.Step2.Class_2.behavior.behavior;

public abstract class Bird {
    abstract public void show();
    public void setBehavior(behavior behavior){
        behavior.act();
    }
}
