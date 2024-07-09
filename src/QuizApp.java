import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QuizApp extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    JLabel label;
    JRadioButton[] radioButtons = new JRadioButton[4];
    JButton btnNext;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int[] m = new int[10];

    QuizApp(String s) {
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext = new JButton("Next");
        btnNext.addActionListener(this);
        add(btnNext);
        set();
        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 200, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (check()) {
            count++;
        }
        current++;
        set();
        if (current == 9) {
            btnNext.setText("Result");
        }
        if (current == 10) {
            JOptionPane.showMessageDialog(this, "Correct answers: " + count);
            System.exit(0);
        }
    }

    void set() {
        bg.clearSelection(); // Ensure that no radio button is selected initially

        if (current == 0) {
            label.setText("Question 1: What is the result of 10 % 3 in Java?");
            radioButtons[0].setText("3");
            radioButtons[1].setText("1");
            radioButtons[2].setText("0");
            radioButtons[3].setText("10");
        } else if (current == 1) {
            label.setText("Question 2: What is the keyword used to implement inheritance in Java?");
            radioButtons[0].setText("extends");
            radioButtons[1].setText("implements");
            radioButtons[2].setText("inherit");
            radioButtons[3].setText("extends/implements");
        } 
        // Add more questions similarly
        else if (current == 2) {
            label.setText("Question 3: Which of these is used to execute Java programs?");
            radioButtons[0].setText("JVM");
            radioButtons[1].setText("JRE");
            radioButtons[2].setText("JDK");
            radioButtons[3].setText("JAR");
        } else if (current == 3) {
            label.setText("Question 4: What is the intermediate representation of Java code after compilation?");
            radioButtons[0].setText("Bytecode");
            radioButtons[1].setText("Source code");
            radioButtons[2].setText("Machine code");
            radioButtons[3].setText("Binary code");
        } else if (current == 4) {
            label.setText("Question 5: What is the default access modifier in Java?");
            radioButtons[0].setText("public");
            radioButtons[1].setText("protected");
            radioButtons[2].setText("default");
            radioButtons[3].setText("private");
        } else if (current == 5) {
            label.setText("Question 6: Which of these is a class in Java Collections Framework?");
            radioButtons[0].setText("List");
            radioButtons[1].setText("Map");
            radioButtons[2].setText("ArrayList");
            radioButtons[3].setText("Set");
        } else if (current == 6) {
            label.setText("Question 7: Which of these is a reference data type in Java?");
            radioButtons[0].setText("int");
            radioButtons[1].setText("String");
            radioButtons[2].setText("boolean");
            radioButtons[3].setText("char");
        } else if (current == 7) {
            label.setText("Question 8: Which keyword is used to prevent inheritance in Java?");
            radioButtons[0].setText("Synchronized");
            radioButtons[1].setText("Static");
            radioButtons[2].setText("Final");
            radioButtons[3].setText("Transient");
        } else if (current == 8) {
            label.setText("Question 9: Which type of exceptions must be declared in the method signature?");
            radioButtons[0].setText("Checked");
            radioButtons[1].setText("Unchecked");
            radioButtons[2].setText("Runtime");
            radioButtons[3].setText("Compile-time");
        } else if (current == 9) {
            label.setText("Question 10: Which keyword is used to refer to the immediate parent class object?");
            radioButtons[0].setText("Super");
            radioButtons[1].setText("This");
            radioButtons[2].setText("New");
            radioButtons[3].setText("Instance");
        }
    }

    boolean check() {
        if (current == 0) {
            return (radioButtons[2].isSelected());
        }
        if (current == 1) {
            return (radioButtons[1].isSelected());
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[2].isSelected());
        }
        if (current == 5) {
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[2].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
        }
        if (current == 9) {
            return (radioButtons[0].isSelected());
        }
        // Add more checks for additional questions
        // ...
        return false;
    }

    public static void main(String[] args) {
        new QuizApp("Simple Quiz Application");
    }
}
