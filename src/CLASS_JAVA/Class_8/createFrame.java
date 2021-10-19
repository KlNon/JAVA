package CLASS_JAVA.Class_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

public class createFrame extends JFrame implements ActionListener {
    private static Demo demo;
    Container container=this.getContentPane();

    public createFrame() {
        super("主窗体");
        container.setLayout(new BorderLayout());
        JButton button = new JButton("单击创建一个内部窗体");
        button.addActionListener(this);
        container.add(button, BorderLayout.SOUTH);
        this.setSize(new Dimension(500, 500));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("come on");
        demo = Demo.create("子窗体", true, true, true, true);
        demo.setSize(new Dimension(300, 300));
        demo.setVisible(true);
        JDesktopPane jDesktopPane = new JDesktopPane();
        container.add(jDesktopPane);
        jDesktopPane.add(demo);
        try {
            demo.setSelected(true);
        } catch (PropertyVetoException e1) {
            e1.printStackTrace();
        }

    }
}
