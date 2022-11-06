package LAB2.Zad2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectAndLogin extends JFrame {
    private JPanel JPanel0;
    private JRadioButton janKowalskiRadioButton;
    private JRadioButton robertKowalRadioButton;
    private JRadioButton pawełKowalczykRadioButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    String username1 = "jk001";
    String password1 = "admin001";

    String username2 = "rk002";
    String password2 = "admin002";

    String username3 = "pk003";
    String password3 = "admin003";

    public static void main(String[] args) {
        SelectAndLogin app1 = new SelectAndLogin();
        app1.setVisible(true);
    }

    public SelectAndLogin() {
        super("Login App");
        this.setContentPane(JPanel0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,250);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (janKowalskiRadioButton.isSelected()) {
                    if (textField1.getText().equals(username1) && String.valueOf(passwordField1.getPassword()).equals(password1)) {
                        JOptionPane.showMessageDialog(null,"Login successful!");
                    }
                    else JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
                }
                else if (robertKowalRadioButton.isSelected()) {
                    if (textField1.getText().equals(username2) && String.valueOf(passwordField1.getPassword()).equals(password2)) {
                        JOptionPane.showMessageDialog(null,"Login successful!");
                    }
                    else JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
                }
                else if (pawełKowalczykRadioButton.isSelected()) {
                    if (textField1.getText().equals(username3) && String.valueOf(passwordField1.getPassword()).equals(password3)) {
                        JOptionPane.showMessageDialog(null,"Login successful!");
                    }
                    else JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
                }
            }
        });
    }
}
