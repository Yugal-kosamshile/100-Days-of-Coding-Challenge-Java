package Day 93;

import javax.swing.*;

public class BasicSwingApp {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Basic Swing Application");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);

        // Add label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
