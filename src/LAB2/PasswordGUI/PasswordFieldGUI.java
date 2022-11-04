package LAB2.PasswordGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFieldGUI extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel JPanel0;
    private JLabel feedbackLabel;

    private String username = "admin";
    private String password = "admin123";

    public static void main(String[] args) {
        PasswordFieldGUI example1 = new PasswordFieldGUI();
        example1.setVisible(true);
    }

    public PasswordFieldGUI() {
        super("Password Test");
        this.setContentPane(JPanel0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);



        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField1.getText().equals(username) && String.valueOf(passwordField1.getPassword()).equals(password)) {
                    JOptionPane.showMessageDialog(null,"Log in successful");
                }
                else JOptionPane.showMessageDialog(null,"Username or password is wrong");

                feedbackLabel.setText("Username: " + textField1.getText() + ", Password: " + String.valueOf(passwordField1.getPassword()) );
            }

        });
    }
}
