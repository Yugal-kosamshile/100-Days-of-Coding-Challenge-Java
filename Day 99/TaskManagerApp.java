import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManagerApp {
    private JFrame frame;
    private JTextField taskInputField;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private List<String> tasks;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TaskManagerApp window = new TaskManagerApp();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TaskManagerApp() {
        tasks = new ArrayList<>();
        initialize();
        loadTasks();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new FlowLayout());

        taskInputField = new JTextField();
        panel.add(taskInputField);
        taskInputField.setColumns(20);

        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(e -> addTask());
        panel.add(addButton);

        JButton saveButton = new JButton("Save Tasks");
        saveButton.addActionListener(e -> saveTasks());
        panel.add(saveButton);

        JButton loadButton = new JButton("Load Tasks");
        loadButton.addActionListener(e -> loadTasks());
        panel.add(loadButton);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JButton completeButton = new JButton("Mark Complete");
        completeButton.addActionListener(e -> markComplete());
        frame.getContentPane().add(completeButton, BorderLayout.SOUTH);

        JButton deleteButton = new JButton("Delete Task");
        deleteButton.addActionListener(e -> deleteTask());
        frame.getContentPane().add(deleteButton, BorderLayout.WEST);
    }

    private void addTask() {
        String task = taskInputField.getText().trim();
        if (!task.isEmpty()) {
            tasks.add(task);
            listModel.addElement(task);
            taskInputField.setText("");
        }
    }

    private void markComplete() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            String task = listModel.getElementAt(selectedIndex);
            listModel.set(selectedIndex, task + " (Completed)");
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
            listModel.remove(selectedIndex);
        }
    }

    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(frame, "Tasks saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadTasks() {
        tasks.clear();
        listModel.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String task;
            while ((task = reader.readLine()) != null) {
                tasks.add(task);
                listModel.addElement(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
