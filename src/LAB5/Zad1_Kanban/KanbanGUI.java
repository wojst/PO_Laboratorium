package LAB5.Zad1_Kanban;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KanbanGUI extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JList toDoList;
    private JList inProgressList;
    private JList doneList;
    private JTextField informacjeOProgramieTextField;
    private JButton backButton;
    private JButton closeButton;
    private JButton addNewTaskButton;
    private JButton toRightButton1;
    private JButton toLeftButton1;
    private JButton toRightButton2;
    private JButton toLeftButton2;



    public static void main(String[] args) {
        KanbanGUI example1 = new KanbanGUI();
        example1.setVisible(true);
    }

    public KanbanGUI() {
        super("Kanban");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);

        DefaultListModel model1 = new DefaultListModel();
        DefaultListModel model2 = new DefaultListModel();
        DefaultListModel model3 = new DefaultListModel();
        toDoList.setModel(model1);
        inProgressList.setModel(model2);
        doneList.setModel(model3);
        model1.addElement("task1");
        model1.addElement("task2");
        model1.addElement("task3");
        model2.addElement("task4");
        model3.addElement("task5");
        model3.addElement("task6");
        model3.addElement("task7");


        toRightButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = toDoList.getSelectedIndex();
                model2.addElement(model1.get(index));
                model1.removeElement(model1.get(index));

            }
        });

        toRightButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = inProgressList.getSelectedIndex();
                model3.addElement(model2.get(index));
                model2.removeElement(model2.get(index));
            }
        });

        toLeftButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = doneList.getSelectedIndex();
                model2.addElement(model3.get(index));
                model3.removeElement(model3.get(index));
            }
        });

        toLeftButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = inProgressList.getSelectedIndex();
                model1.addElement(model2.get(index));
                model2.removeElement(model2.get(index));
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(0);
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        addNewTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddForm editForm = new AddForm();
            }
        });
    }
}
