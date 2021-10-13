package CLASS_JAVA.src.colorpen;

public class SmallPen extends Pen{
    @Override
    public void panting() {
        System.out.println("小笔 画 "+color.getColorName());
    }
}
