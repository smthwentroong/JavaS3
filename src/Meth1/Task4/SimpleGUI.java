package Meth1.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame {

    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JPanel[] pnl = new JPanel[9];
    private static int m = 0;
    private static int r = 0;
    private static String l = "N/A";
    private static String w = "DRAW";

    public SimpleGUI() {

        setLayout(new GridLayout(3,3));

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        JLabel lb1 = new JLabel("Result: 0x0");
        pnl[1].add(lb1);
        pnl[3].add(btn1);
        JLabel lb2 = new JLabel("Last Scorer: N/A");
        pnl[4].add(lb2);
        pnl[5].add(btn2);
        JLabel lb3 = new JLabel("Winner: Draw");
        pnl[7].add(lb3);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    m++;
                    l = "AC Milan";
                    if (m > r) {
                        w = "AC Milan";
                    }
                    else if (m < r) {
                        w = "Real Madrid";
                    }
                    else {
                        w = "Draw";
                    }
                    lb1.setText("Result: " + m + "x" + r);
                    lb2.setText("Last Scorer: " + l);
                    lb3.setText("Winner: " + w);
                }
                catch (Exception exp) {

                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    r++;
                    l = "Real Madrid";
                    if (m > r) {
                        w = "AC Milan";
                    }
                    else if (m < r) {
                        w = "Real Madrid";
                    }
                    else {
                        w = "Draw";
                    }
                    lb1.setText("Result: " + m + "x" + r);
                    lb2.setText("Last Scorer: " + l);
                    lb3.setText("Winner: " + w);
                }
                catch (Exception exp) {

                }
            }
        });
        setSize(600,600);
    }

    public static void main(String[] args) {
        new SimpleGUI().setVisible(true);
    }
}
