import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToDoListApp extends JFrame implements ActionListener {
    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JTextField taskInputField;
    private JButton addTaskButton, removeTaskButton, markCompleteButton;

    public ToDoListApp() {
        setTitle("To-Do List Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        taskInputField = new JTextField(20);
        addTaskButton = new JButton("Add Task");
        removeTaskButton = new JButton("Remove Task");
        markCompleteButton = new JButton("Mark Complete");

        // Add action listeners
        addTaskButton.addActionListener(this);
        removeTaskButton.addActionListener(this);
        markCompleteButton.addActionListener(this);

        // Layout setup
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskInputField);
        inputPanel.add(addTaskButton);

        JPanel controlPanel = new JPanel();
        controlPanel.add(removeTaskButton);
        controlPanel.add(markCompleteButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addTaskButton) {
            String task = taskInputField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskInputField.setText("");
            }
        } else if (e.getSource() == removeTaskButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        } else if (e.getSource() == markCompleteButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                String task = listModel.get(selectedIndex);
                if (!task.startsWith("<html><strike>")) {
                    listModel.set(selectedIndex, "<html><strike>" + task + "</strike></html>");
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoListApp::new);
    }
}
