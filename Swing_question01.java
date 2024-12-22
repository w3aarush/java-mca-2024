import java.awt.event.*;
import javax.swing.*;

// Class representing the main application
class MyApp {
	// GUI components: JFrame, JLabels, JTextField, JButton
	JFrame f1;
	JLabel l1, l2;
	JTextField t1;
	JButton b1;

	// Constructor to initialize the GUI components and behavior
	MyApp() {
		// Initialize the main application window
		f1 = new JFrame();
		f1.setSize(600, 200); // Set the size of the JFrame
		f1.setLayout(null);  // Use absolute positioning for components
		f1.setTitle("My First App"); // Set the title of the JFrame

		// Add a label prompting the user to enter their name
		l1 = new JLabel("Enter your name");
		l1.setBounds(20, 20, 200, 30); // Set position and size of the label
		f1.add(l1); // Add the label to the JFrame

		// Add a label to display the result
		l2 = new JLabel("");
		l2.setBounds(20, 60, 300, 30); // Set position and size of the label
		f1.add(l2); // Add the label to the JFrame

		// Add a text field for user input
		t1 = new JTextField(10); // Create a text field with a specified column size
		t1.setBounds(300, 20, 100, 30); // Set position and size of the text field
		f1.add(t1); // Add the text field to the JFrame

		// Add a button to trigger the action
		b1 = new JButton("Show"); // Create a button with the label "Show"
		b1.setBounds(100, 100, 100, 30); // Set position and size of the button
		f1.add(b1); // Add the button to the JFrame

		// Add an action listener to handle button clicks
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the text entered in the text field
				String name = t1.getText();
				// Update the label with the entered text
				l2.setText("I am " + name);
			}
		});

		// Make the JFrame visible
		f1.setVisible(true);
	}
}

// Main class to run the application
class Swing_question01 {
    public static void main(String[] args) {
        // Instantiate the application, initializing all components
        new MyApp();
    }
}
