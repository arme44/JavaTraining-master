package training.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class CalculatorSwingApp /*implements ActionListener */ {

    JFrame frame;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton zero;
    private JButton delete;
    private JButton point;
    private JButton plus;
    private JButton minus;
    private JButton result;
    private JButton multiply;
    private JButton divide;
    private JLabel printResult;


    public static void main(String[] args) {

        CalculatorSwingApp app = new CalculatorSwingApp();
        app.runApp();

    }

    private void runApp() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        initComponents();
       // initListenersConverter();
        assembleView(frame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }


    private void assembleView(JFrame frame) {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(0, 4, 5, 5));

        panel.add(printResult, BorderLayout.NORTH);
        grid.add(seven);
        grid.add(eight);
        grid.add(nine);
        grid.add(plus);
        grid.add(four);
        grid.add(five);
        grid.add(six);
        grid.add(minus);
        grid.add(one);
        grid.add(two);
        grid.add(three);
        grid.add(multiply);
        grid.add(delete);
        grid.add(zero);
        grid.add(point);
        grid.add(divide);
        panel.add(grid);
        panel.add(result, BorderLayout.SOUTH);
        frame.setContentPane(panel);


    }



/*    private void initListenersConverter() {

        from.addActionListener(this);
        to.addActionListener(this);
         input.addFocusListener(this);


    }*/

    private void initComponents() {

        printResult = new JLabel("Result:", 10);
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        multiply = new JButton("x");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        delete = new JButton("C");
        zero = new JButton("0");
        point = new JButton(".");
        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        result = new JButton("=");
    }



  /*  @Override
    public void actionPerformed(ActionEvent e) {

    }*/
}
