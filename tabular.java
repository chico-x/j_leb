import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Details");
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
