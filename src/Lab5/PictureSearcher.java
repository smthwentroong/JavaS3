package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PictureSearcher extends JFrame {
    JPanel pan = new JPanel();
    ImageIcon img;
    String path;
    public PictureSearcher() {
        setTitle("File Monitor:D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JTextField textF = new JTextField(13);
        textF.setForeground(Color.BLACK);
        textF.setFont(new Font("Sans-serif",Font.BOLD,20));
        this.add(textF);
        JButton search = new JButton("Поиск");
        this.add(search);
        this.setSize(400, 500);
        this.setVisible(true);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    path = textF.getText();
                    display(path);

                } catch (Exception ex) {
                }
            }
        });
    }

    public void display(String p) {
        if (pan != null) {
            pan.setVisible(false);
            this.getContentPane().remove(pan);
        }
        img = new ImageIcon(p);
        pan = new JPanel();
        pan.add(new JLabel(img));
        this.add(pan);
        this.revalidate();
    }

    public static void main(String[] args) {
        PictureSearcher frame = new PictureSearcher();
    }
}
