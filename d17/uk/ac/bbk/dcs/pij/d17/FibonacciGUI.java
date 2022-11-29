package uk.ac.bbk.dcs.pij.d17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This class provides a small example of a program using a Swing GUI.
 */
public class FibonacciGUI {

    // instance variables for all the GUI components that may
    // be needed for one of the ActionListeners to do its job
    private JLabel instructionLabel, outputLabel;
    private JTextField inputTextField;
    private JButton button; // might also be a local variable
    private JList<String> algoList;


    // some constants to configure the GUI (avoid magic numbers)
    private static final int THE_WINDOW_WIDTH = 800;
    private static final int THE_WINDOW_HEIGHT = 300;
    private static final int THE_COLUMN_WIDTH = 20;
    private static final String[] ALGORITHMS = {
            "recursive direct",
            "recursive with memo",
            "iterative" };

    /**
     * Constructs all the components for our GUI, puts them into
     * a suitably configured JFrame, and makes the JFrame visible.
     */
    public FibonacciGUI() {
        ActionListener inputListener = (ae) -> {
            String input = this.inputTextField.getText();
            int n;
            try {
                n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                this.outputLabel.setText(input + " is not an int!");
                return;
            }
            if (n < 1) {
                this.outputLabel.setText(input + " is not a positive number!");
                return;
            }
            int algoIndex = this.algoList.getSelectedIndex();
            int result;
            switch (algoIndex) {
                case 0:
                    result = FibSimple.fib(n);
                    break;
                case 1:
                    result = (new Fibonacci()).fib(n);
                    break;
                case 2:
                    result = FibLoop.fibIterative(n);
                    break;
                default:
                    throw new RuntimeException("Unexpected index!");
            }
            String output = "Algorithm " + ALGORITHMS[algoIndex]
                    + " says fib(" + n + ") = " + result;
            this.outputLabel.setText(output);
        };
        // set up all the components of the GUI
        this.instructionLabel = new JLabel("Please enter a positive integer!");
        this.outputLabel = new JLabel(); // empty at first
        this.inputTextField = new JTextField(THE_COLUMN_WIDTH); // inputs can be longer!
        this.inputTextField.addActionListener(inputListener);

        this.algoList = new JList<>(ALGORITHMS);

        this.button = new JButton("Check!");
        this.button.addActionListener(inputListener);

        // everything will be shown in a JFrame (it's like a window)
        JFrame jFrame = new JFrame("Palindrome Checker");
        jFrame.setLayout(new FlowLayout()); // sensible "default choice"
        jFrame.setSize(THE_WINDOW_WIDTH, THE_WINDOW_HEIGHT); // vary the constants for your needs

        // when the window closes, the program should terminate
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // now put the components into the JFrame in the desired order
        jFrame.add(this.instructionLabel);
        jFrame.add(this.algoList);
        jFrame.add(this.inputTextField);
        jFrame.add(this.button);
        jFrame.add(this.outputLabel);

        // retrieve the current font...
        Font oldFont = UIManager.getFont("Label.font");
        // ...and make it twice as large (note the cast to float!)
        Font newFont = oldFont.deriveFont((float) (oldFont.getSize()*2));
        this.instructionLabel.setFont(newFont);
        this.algoList.setFont(newFont);
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
        SwingUtilities.invokeLater(() -> new FibonacciGUI());
    }
}
