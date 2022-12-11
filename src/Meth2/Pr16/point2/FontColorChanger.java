package Meth2.Pr16.point2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontColorChanger extends JFrame {

    public FontColorChanger(){
        super("TextArea");
        setSize(200,200);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuColors = new JMenu("Colors");
        JMenu jMenuFonts = new JMenu("Fonts");

        JMenuItem jMenuItemBlue = new JMenuItem("Blue");
        JMenuItem jMenuItemRed = new JMenuItem("Red");
        JMenuItem jMenuItemBlack = new JMenuItem("Black");

        JMenuItem jMenuItemTimes = new JMenuItem("Times New Roman");
        JMenuItem jMenuItemSans = new JMenuItem("MS Sans Serif");
        JMenuItem jMenuItemCourier = new JMenuItem("Courier New");

        jMenuColors.add(jMenuItemRed);
        jMenuColors.add(jMenuItemBlue);
        jMenuColors.add(jMenuItemBlack);

        jMenuFonts.add(jMenuItemTimes);
        jMenuFonts.add(jMenuItemSans);
        jMenuFonts.add(jMenuItemCourier);

        jMenuBar.add(jMenuColors);
        jMenuBar.add(jMenuFonts);

        this.setJMenuBar(jMenuBar);
        this.add(textArea,BorderLayout.CENTER);

        jMenuItemRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        jMenuItemBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.blue);
            }
        });

        jMenuItemBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.black);
            }
        });

        jMenuItemTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemTimes.getText(),Font.BOLD, 16));
            }
        });

        jMenuItemCourier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemCourier.getText(),Font.BOLD, 16));
            }
        });

        jMenuItemSans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(jMenuItemSans.getText(),Font.BOLD, 16));;
            }
        });

    }

    public static void main(String[] args) {
        new FontColorChanger().setVisible(true);
    }

}