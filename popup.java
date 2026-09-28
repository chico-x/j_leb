import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleSwing extends JFrame {
    SimpleSwing() {
        setTitle("Swing Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox cb = new JCheckBox("Java");
        add(cb);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(r1);
        add(r2);

        JPopupMenu pm = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem("Exit");
        pm.add(item1);
        pm.add(item2);

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        item2.addActionListener(e -> System.exit(0));
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleSwing();
    }
}
