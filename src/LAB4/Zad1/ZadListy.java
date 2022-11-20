package LAB4.Zad1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ZadListy extends JFrame {
    private JPanel mainPanel;
    private JButton toRightButton;
    private JButton allToRightButton;
    private JButton toLeftButton;
    private JButton allToLeftButton;
    private JList list1;
    private JList list2;

    String[] elementsArr = {"Audi", "BMW", "Toyota", "Fiat", "Opel"};
    public static List<String> elemList1 = new ArrayList<>();
    public static List<String> elemList2 = new ArrayList<>();


    public static void main(String[] args) {
        ZadListy example = new ZadListy();
        example.setVisible(true);
    }

    public ZadListy() {
        super("Zadanie 1");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        elemList1.addAll(List.of(elementsArr));
        createList();


        toRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = list1.getSelectedIndex();
                elemList2.add(elemList1.get(index));
                elemList1.remove(index);
                createList();
            }
        });

        toLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = list2.getSelectedIndex();
                elemList1.add(elemList2.get(index));
                elemList2.remove(index);
                createList();
            }
        });

        allToRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                elemList2.addAll(elemList1);
                elemList1.clear();
                createList();
            }
        });

        allToLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                elemList1.addAll(elemList2);
                elemList2.clear();
                createList();
            }
        });
    }

    public void createList() {
        list1.setListData(elemList1.toArray());
        list2.setListData(elemList2.toArray());
    }
}
