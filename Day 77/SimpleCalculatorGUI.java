import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private double firstNum = 0;
    private double secondNum = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9.]")) {
            if (isOperatorClicked) {
                display.setText("");
                isOperatorClicked = false;
            }
            display.setText(display.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            firstNum = Double.parseDouble(display.getText());
            operator = command;
            isOperatorClicked = true;
        } else if (command.equals("=")) {
            secondNum = Double.parseDouble(display.getText());
            double result = calculateResult(firstNum, secondNum, operator);
            display.setText(String.valueOf(result));
            isOperatorClicked = true;
        }
    }

    private double calculateResult(double first, double second, String operator) {
        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> second != 0 ? first / second : Double.NaN;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculatorGUI::new);
    }
}
