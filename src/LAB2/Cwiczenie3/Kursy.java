package LAB2.Cwiczenie3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Kursy extends JFrame {
    private JPanel mainPanel;
    private JCheckBox javaCheckBox;
    private JCheckBox csharpCheckBox;
    private JCheckBox cplusplusCheckBox;
    private JCheckBox pythonCheckBox;
    private JButton okButton;

    double suma = 0;
    double javaCena = 3500;
    double csharpCena = 3000;
    double cplusplusCena = 4000;
    double pythonCena = 5000;


    public static void main(String[] args) {
        Kursy example1 = new Kursy();
        example1.setVisible(true);



    }

    public Kursy() {
        super("Aplikacja do wybierania kursów programowania");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,250);


        ArrayList<String> wybraneJezyki = new ArrayList<String>();


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Wybrano: " + wybraneJezyki + "\nRazem do zapłaty: " + suma + "PLN");
            }
        });

        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (javaCheckBox.isSelected()) {
                    wybraneJezyki.add("Java " + javaCena + "PLN");
                    suma += javaCena;
                }
            }
        });
        csharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (csharpCheckBox.isSelected()) {
                    wybraneJezyki.add("C# " + csharpCena + "PLN");
                    suma += csharpCena;
                }
            }
        });
        cplusplusCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (cplusplusCheckBox.isSelected()) {
                    wybraneJezyki.add("C++ " + cplusplusCena + "PLN");
                    suma += cplusplusCena;
                }
            }
        });
        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (pythonCheckBox.isSelected()) {
                    wybraneJezyki.add("Python " + pythonCena + "PLN");
                    suma += pythonCena;
                }
            }
        });
    }




}
