package LAB4.ListaKursow;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaKursow extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton opłaćKursButton;
    private JButton wyjścieButton;
    private JPanel mainPanel;
    private JTree tree1;


    public static void main(String[] args) {
        ListaKursow example1 = new ListaKursow();
        example1.setVisible(true);

    }

    public ListaKursow() {
        super("Lista kursow");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.createUIComponents(); // wywolanie metody z definiowanym JTree

        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();
                textField1.setText(root.getUserObject().toString());
                String select = root.getUserObject().toString();
                if (select.equals("C++")) textField2.setText("1234");
                else if (select.equals("C#")) textField2.setText("134");
                else if (select.equals("Java")) textField2.setText("12134");
                else if (select.equals("Python")) textField2.setText("1151234");
                else if (select.equals("ASP.NET")) textField2.setText("123234");
                else if (select.equals("C")) textField2.setText("12");

                else if (select.equals("Photoshop")) textField2.setText("4212");
                else if (select.equals("Corel")) textField2.setText("312");
                else if (select.equals("AutoCAD")) textField2.setText("112");
                else if (select.equals("InDesign")) textField2.setText("1211");
            }
        });
        opłaćKursButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy"); //root

        //poziom1
        DefaultMutableTreeNode Kprog = new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode p1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode p2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode p3 = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode p4 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode p5 = new DefaultMutableTreeNode("ASP.NET");
        DefaultMutableTreeNode p6 = new DefaultMutableTreeNode("C");

        Kprog.add(p1);
        Kprog.add(p2);
        Kprog.add(p3);
        Kprog.add(p4);
        Kprog.add(p5);
        Kprog.add(p6);

        //poziom2
        DefaultMutableTreeNode Kgrafika = new DefaultMutableTreeNode("Grafika");
        DefaultMutableTreeNode g1 = new DefaultMutableTreeNode("Photoshop");
        DefaultMutableTreeNode g2 = new DefaultMutableTreeNode("Corel");
        DefaultMutableTreeNode g3 = new DefaultMutableTreeNode("AutoCAD");
        DefaultMutableTreeNode g4 = new DefaultMutableTreeNode("InDesing");


        Kgrafika.add(g1);
        Kgrafika.add(g2);
        Kgrafika.add(g3);
        Kgrafika.add(g4);


        //dodanie root

        root.add(Kprog);
        root.add(Kgrafika);

        DefaultTreeModel myModel = new DefaultTreeModel(root);
        //tree1.setModel(myModel);
        tree1 = new JTree(myModel);
    }
}
