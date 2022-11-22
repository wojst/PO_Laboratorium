package LAB4.Edytor;

import LAB3.ComboBoxGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EdytorTekstu extends JFrame {
    private JComboBox comboBox1;
    private JButton bButton;
    private JButton zButton;
    private JButton iButton;
    private JButton pButton;
    private JTextArea textArea1;
    private JPanel mainPanel;

    boolean booItalic = false;
    boolean booBold = false;


    public static void main(String[] args) {
        EdytorTekstu ex1 = new EdytorTekstu();
        ex1.setVisible(true);
    }

    public EdytorTekstu() {
        super("Combo app");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);


        createComboBox();

        textArea1.setBackground(Color.gray);
        textArea1.setForeground(Color.BLACK);
        textArea1.setLineWrap(true);

        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (booBold == false && booItalic == false) {
                    boldON();
                    booBold = true;
                }
                else if (booBold == true && booItalic == false) {
                    boldOFF();
                    booBold = false;
                }
                else if (booBold == false && booItalic == true) {
                    boldItalicON();
                    booBold = true;
                }
                else if (booBold == true && booItalic == true) {
                    boldOFFitalicON();
                    booBold = false;
                }

            }
        });

        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (booBold == false && booItalic == false) {
                    italicON();
                    booItalic = true;
                }
                else if (booBold == true && booItalic == false) {
                    boldItalicON();
                    booItalic = true;
                }
                else if (booBold = false && booItalic == true) {
                    italicOFF();
                    booItalic = false;
                }
                else if (booBold == true && booItalic == true) {
                    boldONitalicOFF();
                    booItalic = false;
                }
            }
        });
    }

    public void createComboBox () {

        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"czarny", "czerwony", "zielony", "żółty", "niebieski", "rózowy"}));
    }

    public void boldON() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.BOLD, textArea1.getFont().getSize()));
    }

    public void boldOFF() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.PLAIN, textArea1.getFont().getSize()));
    }

    public void italicON() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.ITALIC, textArea1.getFont().getSize()));
    }

    public void italicOFF() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.PLAIN, textArea1.getFont().getSize()));
    }

    public void boldItalicON() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.ITALIC+Font.BOLD, textArea1.getFont().getSize()));
    }

    public void boldONitalicOFF() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.PLAIN+Font.BOLD, textArea1.getFont().getSize()));
    }

    public void boldOFFitalicON() {
        textArea1.setFont(new Font(textArea1.getFont().getName(), Font.PLAIN+Font.ITALIC, textArea1.getFont().getSize()));
    }
}
