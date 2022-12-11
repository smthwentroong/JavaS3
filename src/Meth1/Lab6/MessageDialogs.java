package Meth1.Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyPane extends JOptionPane {
    private static boolean cursored;
    private static JFrame MD;
    private static JPanel pan;

    public static void showMessageDialog(Component parentComponent, String message) {
        MD = new JFrame();
        MD.setLocationRelativeTo(parentComponent);
        MD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MD.setSize(200,200);
        pan = new JPanel();
        pan.setLayout(new BorderLayout());
        pan.add(new JLabel(message,SwingConstants.CENTER), BorderLayout.CENTER);
        MD.add(pan);
        MD.setVisible(true);
    }

    public static void setCursored() {
        cursored = false;
    }

    public static void closeMessage() {
        MD.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cursored = false;
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        if (cursored == false) {
            pan.removeAll();
            MD.removeAll();
            MD.setVisible(false);
            MD = null;
        }
    }
}

public class MessageDialogs extends JFrame {

    JPanel pan = new JPanel();
    public MessageDialogs() {

        pan.setLayout(new BorderLayout());

        JPanel Cntr = new JPanel();
        Cntr.add(new JLabel("CENTER", SwingConstants.CENTER));
        Cntr.setSize(300,200);
        Cntr.setBorder(BorderFactory.createLineBorder(Color.black));
        Cntr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                MyPane.setCursored();
                MyPane.showMessageDialog(null, "ЦЕНТР");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                MyPane.closeMessage();
            }
        });

        JPanel Nrth = new JPanel();
        Nrth.add(new JLabel("NORTH" , SwingConstants.CENTER));
        Nrth.setSize(300,200);
        Nrth.setBorder(BorderFactory.createLineBorder(Color.black));
        Nrth.addMouseListener(new MouseListener() {
            boolean entered = false;
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                MyPane.setCursored();
                MyPane.showMessageDialog(null, "СЕВЕР");

            }
            @Override
            public void mouseExited(MouseEvent e) {
                MyPane.closeMessage();
            }
        });

        JPanel Soth = new JPanel();
        Soth.add(new JLabel("SOUTH", SwingConstants.CENTER));
        Soth.setSize(300,200);
        Soth.setBorder(BorderFactory.createLineBorder(Color.black));
        Soth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                MyPane.setCursored();
                MyPane.showMessageDialog(null, "ЮГ");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                MyPane.closeMessage();
            }
        });

        JPanel West = new JPanel();
        West.add(new JLabel("WEST", SwingConstants.CENTER));
        West.setSize(300,200);
        West.setBorder(BorderFactory.createLineBorder(Color.black));
        West.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                MyPane.setCursored();
                MyPane.showMessageDialog(null, "ЗАПАД");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                MyPane.closeMessage();
            }
        });

        JPanel East = new JPanel();
        East.add(new JLabel("EAST", SwingConstants.CENTER));
        East.setSize(300,200);
        East.setBorder(BorderFactory.createLineBorder(Color.black));
        East.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                MyPane.setCursored();
                MyPane.showMessageDialog(null, "ВОСТОК");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                MyPane.closeMessage();
            }
        });

        pan.add(Cntr, BorderLayout.CENTER);
        pan.add(Nrth, BorderLayout.NORTH);
        pan.add(Soth, BorderLayout.SOUTH);
        pan.add(West, BorderLayout.WEST);
        pan.add(East, BorderLayout.EAST);
        this.add(pan);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600 ,400);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new MessageDialogs();
    }
}
