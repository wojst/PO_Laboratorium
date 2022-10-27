package LAB2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioGUI extends JFrame {
    private JRadioButton lgRadioButton;
    private JRadioButton appleRadioButton;
    private JRadioButton samsungRadioButton;
    private JButton showmeButton;
    private JPanel JPanel0;
    private JLabel logoLabel;

    private ImageIcon iconSamsung = new ImageIcon(getClass().getResource("samsunglogo.png"));
    private ImageIcon iconLG = new ImageIcon(getClass().getResource("lglogo.png"));
    private ImageIcon iconApple = new ImageIcon(getClass().getResource("applelogo.png"));


    public static void main(String[] args) {
        RadioGUI example1 = new RadioGUI();
        example1.setVisible(true);
    }

    public RadioGUI() {
        super("RadioGUI app test");
        this.setContentPane(this.JPanel0);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        showmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (appleRadioButton.isSelected()) logoLabel.setIcon(iconApple);
                else if (samsungRadioButton.isSelected()) logoLabel.setIcon(iconSamsung);
                else if (lgRadioButton.isSelected()) logoLabel.setIcon(iconLG);
                else JOptionPane.showMessageDialog(null,"Nic nie wybrano");
            }
        });
    }
}
