package training.swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.*;

public class SimpleFrame {
    static JTextField field;

    public static void main(String[] args) {
        JLabel label = new JLabel("Information");
        JButton button = new JButton("OK");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                text+="q";
                field.setText(text);

            }
        });

        field = new JTextField("Hey", 20);



        JFrame frame = new JFrame();
        frame.setTitle("Java frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(button);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension dim = new Dimension(200, 200);
        frame.setMinimumSize(dim);
        frame.pack(); // kalkuluje wyswietlanie elementów
        frame.setVisible(true);
    }

}
