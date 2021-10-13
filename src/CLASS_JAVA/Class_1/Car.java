package CLASS_JAVA.Class_1;

abstract class Car {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract void Move();
}
