package CLASS_JAVA.Class_5.Size;

import CLASS_JAVA.Class_5.Pen;

public class LargePen extends Pen {
    @Override
    public void getSize() {
        System.out.println("大号笔");
    }

    @Override
    public void painting() {
        System.out.println("画出了粗号"+getColor()+"线条");
    }
}
