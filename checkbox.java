import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckRadioExample extends JFrame implements ActionListener {
    JCheckBox java, python;
    JRadioButton male, female;
    JButton button;
    JLabel result;

    CheckRadioExample() {
        setTitle("CheckBox and Radio Button");
        setSize(400, 300);
        setLayout(new FlowLayout());

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        button = new JButton("Submit");
        result = new JLabel("");

        button.addActionListener(this);

        add(new JLabel("Select Language: "));
        add(java);
        add(python);

        add(new JLabel("Select Gender: "));
        add(male);
        add(female);

        add(button);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String language = "";
        if (java.isSelected()) {
            language += "Java ";
        }
        if (python.isSelected()) {
            language += "Python";
        }

        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        result.setText("Languages: " + language + " | Gender: " + gender);
    }

    public static void main(String[] args) {
        new CheckRadioExample();
    }
}
