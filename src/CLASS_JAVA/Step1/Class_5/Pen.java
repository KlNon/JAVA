package CLASS_JAVA.Step1.Class_5;

abstract public class Pen {
    private Color color;

    abstract public void getSize();
    abstract public void painting();
    public String getColor() {
        return color.getColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
