package training.swing.Calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorPanel extends JPanel implements ActionListener {
    private final String CLEAR = "C";
    private JTextField display;
    private String operation = "";
    private Logger logger = Logger.getLogger(CalculatorPanel.class.getSimpleName());

    CalculatorPanel() {
        initLayout();
        initComponents();
    }

    private void initLayout() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        display = new JTextField(20);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.CENTER);
        add(display, BorderLayout.NORTH);

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(4, 4, 5, 5));

        String operations =
                "789/"
                        + "456*"
                        + "123-"
                        + "C0.+";

        for (int it = 0; it < operations.length(); it++) {
            JButton button = new JButton(String.valueOf(operations.charAt(it)));
            button.setPreferredSize(new Dimension(50, 50));
            button.addActionListener(this);
            button.setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
            panelForButtons.add(button);
        }

        add(panelForButtons, BorderLayout.CENTER);

        JButton summarize = new JButton("=");
        summarize.addActionListener(this);
        add(summarize, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String prev = display.getText();
        String sign = e.getActionCommand();

        logger.log(Level.INFO, String.format("INN PREV: %s, SIGN: %s, OPER: %s", prev, sign, operation));

        if (CLEAR.equals(sign)) {
            display.setText("");
            prev = "";
        } else if (Character.isDigit(sign.charAt(0)) || ".".equals(sign)) {
            display.setText(prev.concat(sign));
        } else if ("=".equals(sign)) {
            double result = getResultForCurrentArguments(prev);
            display.setText(String.format("%.10f", result));
            prev = "";
            operation = "";
        } else {
            if ("".equals(operation)) {
                operation = sign;
                display.setText(prev + " " + sign + " ");
            } else {
                double result = getResultForCurrentArguments(prev);
                operation = sign;
                display.setText(String.format("%.10f %s ", result, operation));
            }
        }


        logger.log(Level.INFO, String.format("OUT DISP: %s, SIGN: %s, OPER: %s", display.getText(), sign, operation));
    }

    private double getResultForCurrentArguments(String prev) {
        String regx = new StringBuilder().append("\\").append(operation).toString();
        String[] args = prev.split(regx);
        Double arg1 = Double.parseDouble(args[0]);
        Double arg2 = Double.parseDouble(args[1]);
        return performOperation(arg1, arg2, operation);
    }

    private double performOperation(double arg1, double arg2, String operation) {
        switch (operation) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "/":
                return arg1 / arg2;
            case "*":
                return arg1 * arg2;
        }
        return 0.0;
    }

}