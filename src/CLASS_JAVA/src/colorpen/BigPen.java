package CLASS_JAVA.src.colorpen;

public class BigPen extends Pen{
    @Override
    public void panting() {
        System.out.println("大笔 画 "+color.getColorName());
    }
}
