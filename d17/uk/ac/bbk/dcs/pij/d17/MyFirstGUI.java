package uk.ac.bbk.dcs.pij.d17;

import java.awt.*;
import javax.swing.*;

/**
 * This class provides a small example of a program using a Swing GUI.
 */
public class MyFirstGUI {

    // instance variables for all the GUI components that may
    // be needed for one of the ActionListeners to do its job
    private JLabel instructionLabel, outputLabel;
    private JTextField inputTextField;
    private JButton button; // might also be a local variable

    // some constants to configure the GUI (avoid magic numbers)
    private static final int THE_WINDOW_WIDTH = 800;
    private static final int THE_WINDOW_HEIGHT = 300;
    private static final int THE_COLUMN_WIDTH = 20;

    /**
     * Constructs all the components for our GUI, puts them into
     * a suitably configured JFrame, and makes the JFrame visible.
     */
    public MyFirstGUI() {
        // set up all the components of the GUI
        this.instructionLabel = new JLabel("Please enter something to put to upper case.");
        this.outputLabel = new JLabel(); // empty at first
        this.inputTextField = new JTextField(THE_COLUMN_WIDTH); // inputs can be longer!
        this.inputTextField.addActionListener((ae) -> {
            // the functionality is very simple, so in this small example
            // it is directly present in the code for the ActionListener
            String s = this.inputTextField.getText();
            this.outputLabel.setText(s + " in upper case: " + s.toUpperCase());
        });

        this.button = new JButton("Hello, Swing!");
        this.button.addActionListener((ae) -> {
            // different event handler for our button: it has functionality, too!
            this.outputLabel.setText("Greetings to Birkbeck from the GUI!");
        });

        // everything will be shown in a JFrame (it's like a window)
        JFrame jFrame = new JFrame("Hello, World!");
        jFrame.setLayout(new FlowLayout()); // sensible "default choice"
        jFrame.setSize(THE_WINDOW_WIDTH, THE_WINDOW_HEIGHT); // vary the constants for your needs

        // when the window closes, the program should terminate
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // now put the components into the JFrame in the desired order
        jFrame.add(this.instructionLabel);
        jFrame.add(this.inputTextField);
        jFrame.add(this.button);
        jFrame.add(this.outputLabel);

        // retrieve the current font...
        Font oldFont = UIManager.getFont("Label.font");
        // ...and make it twice as large (note the cast to float!)
        Font newFont = oldFont.deriveFont((float) (oldFont.getSize()*2));
        this.instructionLabel.setFont(newFont);
        this.outputLabel.setFont(newFont);
        this.inputTextField.setFont(newFont);
        this.button.setFont(newFont);

        // actually show the JFrame
        jFrame.setVisible(true);
    }

    /**
     * Runs the Swing GUI for our example.
     */
    public static void main(String[] args) {
        // use a lambda expression for the code to run by the GUI thread
        SwingUtilities.invokeLater(() -> new MyFirstGUI());
    }
}
