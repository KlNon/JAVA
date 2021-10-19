package CLASS_JAVA.Class_8;

import javax.swing.*;

public class Demo extends JInternalFrame {
    private static Demo demo;
    public Demo(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable){
        super(title, resizable, closable, maximizable, iconifiable);
    }
    public static Demo create(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable){
        if(demo==null)
        {
            demo=new Demo(title, resizable, closable, maximizable, iconifiable);
        }
        return demo;
    }
}
