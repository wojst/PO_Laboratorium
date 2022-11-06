package LAB2.PasswordCheckerGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordCheckerGUI extends JFrame {
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton OKButton;
    private JPanel JPanel0;

    private String pswrd = "codejava";

    public static void main(String[] args) {
        PasswordCheckerGUI checker1 = new PasswordCheckerGUI();
        checker1.setVisible(true);
    }

    public PasswordCheckerGUI() {
        super("Password Check App");
        this.setContentPane(JPanel0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,150);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                 if (String.valueOf(passwordField1.getPassword()).equals(pswrd)
                        && String.valueOf(passwordField2.getPassword()).equals(pswrd)) {
                    JOptionPane.showMessageDialog(null,"Congratulations! Password is correct");
                }
                else if (String.valueOf(passwordField1.getPassword()).equals(String.valueOf(passwordField2.getPassword()))) {
                    JOptionPane.showMessageDialog(null,"Wrong password");
                }
                else JOptionPane.showMessageDialog(null,"Passwords don't match!");
            }
        });
    }
}
