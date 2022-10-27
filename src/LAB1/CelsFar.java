package LAB1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsFar extends JFrame {
    private JLabel LabelC;
    private JLabel LabelWynikF;
    private JTextField textField1;
    private JButton obliczButton;
    private JPanel Panel1;

    double poZmianieF, tempC;

    public static void main(String[] args) {
        CelsFar p1 = new CelsFar();
        p1.setVisible(true);
    }

    public CelsFar() {
        super("Zmiana Celsjusz na Fahrenheit");
        this.setContentPane(this.Panel1); // wyswietla na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempC = Double.parseDouble(textField1.getText());
                poZmianieF = tempC * 9/5 + 32;
                LabelWynikF.setText(LabelWynikF.getText() + " " + String.valueOf(poZmianieF));
            }
        });
    }
}
