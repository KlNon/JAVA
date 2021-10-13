package CLASS_JAVA.src.colorpen;

public class Test {
    public static void main(String[] args){
        Color color = new Red();
        Pen pen = new BigPen();
        pen.setColor(color);
        pen.panting();
        color = new Black();
        pen = new MiddlePen();
        pen.setColor(color);
        pen.panting();
    }
}
