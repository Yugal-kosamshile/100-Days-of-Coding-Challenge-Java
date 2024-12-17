
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class NoteApp {
    private JFrame frame;
    private JTextArea textArea;
    private DefaultListModel<String> noteListModel;
    private JList<String> noteList;
    private ArrayList<String> notes;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NoteApp().createUI());
    }

    public NoteApp() {
        notes = new ArrayList<>();
        loadNotesFromFile();
    }

    private void createUI() {
        frame = new JFrame("Simple Note-Taking App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textArea = new JTextArea();
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        noteListModel = new DefaultListModel<>();
        noteList = new JList<>(noteListModel);
        panel.add(new JScrollPane(noteList), BorderLayout.WEST);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add Note");
        JButton deleteButton = new JButton("Delete Note");
        JButton saveButton = new JButton("Save Notes");

        addButton.addActionListener(e -> addNote());
        deleteButton.addActionListener(e -> deleteNote());
        saveButton.addActionListener(e -> saveNotesToFile());

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(saveButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
    }

    private void addNote() {
        String note = textArea.getText();
        if (!note.isEmpty()) {
            notes.add(note);
            noteListModel.addElement(note);
            textArea.setText("");
        }
    }

    private void deleteNote() {
        int selectedIndex = noteList.getSelectedIndex();
        if (selectedIndex != -1) {
            notes.remove(selectedIndex);
            noteListModel.remove(selectedIndex);
        }
    }

    private void saveNotesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"))) {
            for (String note : notes) {
                writer.write(note);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(frame, "Notes saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error saving notes.");
        }
    }

    private void loadNotesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
                noteListModel.addElement(line);
            }
        } catch (IOException e) {
            // No notes file exists yet, so ignore the error
        }
    }
}
