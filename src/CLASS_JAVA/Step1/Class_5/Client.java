package CLASS_JAVA.Step1.Class_5;


import CLASS_JAVA.Step1.Class_5.Colors.Black;
import CLASS_JAVA.Step1.Class_5.Colors.Red;
import CLASS_JAVA.Step1.Class_5.Size.LargePen;
import CLASS_JAVA.Step1.Class_5.Size.MiddlePen;
import CLASS_JAVA.Step1.Class_5.Size.SmallPen;

public class Client {
    public static void main(String[] args){
        Color color = new Red();
        Pen pen = new LargePen();
        pen.setColor(color);
        pen.painting();
        color = new Black();
        pen = new MiddlePen();
        pen.setColor(color);
        pen.painting();
        pen = new SmallPen();
        pen.setColor(color);
        pen.painting();
    }
}
