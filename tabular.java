import javax.swing.*;
public class TableExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("student Details");
        String columns[] = {"Roll No", "Name", "Course"};
        String data[][] = {
            {"101", "Anu", "BCA"},
            {"102", "Rahul", "BCA"},
            {"103", "Meera", "Bsc CS"},
            {"104", "Arun", "BCA"}
        };
        JTable table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(400, 250);
        // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
```[cite: 1]

---

### Program - 31
**create an application for implementing popup menu, checkbox and radio buttons**[cite: 2]

```java
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
        JMenuItem item1 = new JMenuItem("open");
        JMenuItem item2 = new JMenuItem("Exit");
        pm.add(item1);
        pm.add(item2);
        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    pm.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        item2.addActionListener(e -> System.exit(0));
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleSwing();
    }
}
```[cite: 2, 3]

---

### Program - 35
**CheckRadioExample**[cite: 4]

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckRadioExample extends JFrame implements ActionListener {
    JCheckBox java, python;
    JRadioButton male, female;
    JButton button;
    JLabel result;

    CheckRadioExample() {
        setTitle("check box and Radio Button");
        setSize(400, 300);
        setLayout(new FlowLayout());
        java = new JCheckBox("java");
        python = new JCheckBox("python");
        male = new JRadioButton("male");
        female = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        button = new JButton("Submit");
        result = new JLabel(" ");
        button.addActionListener(this);
        add(new JLabel("Select Language"));
        add(java);
        add(python);
        add(new JLabel("Select Gender"));
        add(male);
        add(female);
        add(button);
        add(result);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String language = " ";
        if (java.isSelected())
            language += "java ";
        if (python.isSelected())
            language += "python ";
        String gender = " ";
        if (male.isSelected())
            gender = "Male";
        else if (female.isSelected())
            gender = "female";
        result.setText("Languages: " + language + "| gender: " + gender);
    }

    public static void main(String[] args) {
        new CheckRadioExample();
    }
}
```[cite: 4, 5]

---

### Program - 27
**Exception handling**[cite: 6]

```java
import java.util.Scanner;

class EvenAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no. of elements");
            int n = sc.nextInt();
            int[] num = new int[n];
            System.out.println("Enter "+n+" numbers");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (num[i] % 2 == 0) {
                    sum += num[i];
                    count++;
                }
            }
            int avg = sum / count;
            System.out.println("Average of Even numbers: " + avg);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception No Even Number Found.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of Bounds Exception ");
        }
        finally {
            System.out.println("Program Execution Completed.");
        }
    }
}
```[cite: 6, 7]
