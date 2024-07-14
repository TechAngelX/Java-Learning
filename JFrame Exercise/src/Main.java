import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Hello, I'm Ricki");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // Set BorderLayout for the frame

        // Create the first panel and add components
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(125, 75)); // Adjusted to fit the height of the frame
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set a layout for the panel
        panel1.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Name");
        panel1.add(label);

        JTextField singleText = new JTextField("Enter Name");
        singleText.setPreferredSize(new Dimension(100, 30)); // Set a preferred size for the text field
        panel1.add(singleText);

        // Create the second panel and add components
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(500, 30)); // Adjusted to fit the height of the frame
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set a layout for the panel
        panel2.setBackground(Color.LIGHT_GRAY);

        JLabel label2 = new JLabel("Age");
        panel2.add(label2);

        JTextField ageText = new JTextField("Enter Age");
        ageText.setPreferredSize(new Dimension(100, 30)); // Set a preferred size for the text field
        panel2.add(ageText);

        // Add panels to the frame with BorderLayout constraints
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);

        // Pack and display the frame
        frame.pack();
        frame.setVisible(true);
    }
}
