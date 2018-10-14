package training.swing.Calculator;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame calcFrame = new JFrame("Calculator Pro");

        calcFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calcFrame.add(new CalculatorPanel());

        Dimension minDimension = new Dimension(200, 200);
        calcFrame.setMinimumSize(minDimension);
        calcFrame.pack();
        calcFrame.setVisible(true);
    }

}