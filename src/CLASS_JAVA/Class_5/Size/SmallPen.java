package CLASS_JAVA.Class_5.Size;

import CLASS_JAVA.Class_5.Pen;

public class SmallPen extends Pen {
    @Override
    public void getSize() {
        System.out.println("小号笔"+getColor());
    }
    @Override
    public void painting() {
        System.out.println("画出了小号"+getColor()+"线条");
    }
}