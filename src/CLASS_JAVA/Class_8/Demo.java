package CLASS_JAVA.Class_8;

import javax.swing.*;

public class Demo extends JInternalFrame {//JInternalFrame 支持在 JFrame 窗口内部显示一个完整的子窗口，并提供了许多本机窗体功能的轻量级对象，包括拖动、关闭、变成图标、调整大小、标题显示和支持菜单栏等。
    //在实际使用中，通常将 JInternalFrame 添加到 JDesktopPane 中，由其来维护和显示 JInternalFrame。
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
