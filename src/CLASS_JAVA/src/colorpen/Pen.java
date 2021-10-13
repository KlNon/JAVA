package CLASS_JAVA.src.colorpen;

public abstract class Pen {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void panting();
}
