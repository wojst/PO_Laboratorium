package LAB1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZadDom extends JFrame {
    private JPanel Panel1;
    private JTextField textField1;
    private JLabel wprowadzLabel2;
    private JLabel wprowadzLabel1;
    private JTextField textField2;
    private JButton dodajButton;
    private JButton odejmijButton;
    private JButton pomnozButton;
    private JButton podzielButton;
    private JLabel wynikLabel;

    double liczba1, liczba2;
    double wynik;

    public static void main(String[] args) {
        ZadDom k1 = new ZadDom();
        k1.setVisible(true);
    }

    public ZadDom() {
        super("Uproszczony Kalkulator");
        this.setContentPane(this.Panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.pack();

        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                liczba1 = Double.parseDouble(textField1.getText());
                liczba2 = Double.parseDouble(textField2.getText());
                wynik = liczba1 + liczba2;
                wynikLabel.setText("Wynik: " + String.valueOf(wynik));
            }
        });
        odejmijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                liczba1 = Double.parseDouble(textField1.getText());
                liczba2 = Double.parseDouble(textField2.getText());
                wynik = liczba1 - liczba2;
                wynikLabel.setText("Wynik: " + String.valueOf(wynik));
            }
        });
        pomnozButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                liczba1 = Double.parseDouble(textField1.getText());
                liczba2 = Double.parseDouble(textField2.getText());
                wynik = liczba1 * liczba2;
                wynikLabel.setText("Wynik: " + String.valueOf(wynik));
            }
        });
        podzielButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                liczba1 = Double.parseDouble(textField1.getText());
                liczba2 = Double.parseDouble(textField2.getText());
                wynik = liczba1 / liczba2;
                wynikLabel.setText("Wynik: " + wynik);
            }
        });
    }

}
