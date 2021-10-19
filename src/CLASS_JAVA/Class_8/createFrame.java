package CLASS_JAVA.Class_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

public class createFrame extends JFrame implements ActionListener {
    private static Demo demo;
    Container container=this.getContentPane();//初始化一个容器

    public createFrame() {
        super("主窗体");
        container.setLayout(new BorderLayout());
        JButton button = new JButton("单击创建一个内部窗体");
        button.addActionListener(this);//当用户按下按钮时，将运行actionPerformed()中的程序
        container.add(button, BorderLayout.SOUTH);//往容器中添加按钮
        this.setSize(new Dimension(500, 500));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//设置点击右上角X是否结束进程
    }

    @Override
    public void actionPerformed(ActionEvent e) {//监听器反应
        demo = Demo.create("子窗体", true, true, true, true);
        demo.setSize(new Dimension(300, 300));//大小
        demo.setVisible(true);
        JDesktopPane jDesktopPane = new JDesktopPane();//依附于上层组件而出现
        container.add(jDesktopPane);//往容器中添加Pane
        jDesktopPane.add(demo);//在子窗体中添加demo,即JInternalFrame
        try {
            demo.setSelected(true);
        } catch (PropertyVetoException e1) {
            e1.printStackTrace();
        }

    }
}
