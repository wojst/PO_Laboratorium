package LAB5.Zad1_Kanban;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class AddForm extends JFrame {
    private JPanel mainPanel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JPanel PanelCalendar;

    public static void main(String[] args) {
        AddForm example2 = new AddForm();

    }

    public AddForm() {
        super("Add form");
        this.setVisible(true);
        this.setContentPane(mainPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);



    }
}
