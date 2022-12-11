package Meth2.Pr12.point2;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class TestAnim  extends JFrame{

    public TestAnim() throws Exception {

        super("Animation");
        setLayout(new BorderLayout());
        setSize(1920, 1080);
        this.getContentPane().setBackground( Color.white );


        Image[] frames = {
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(1).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(2).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(3).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(4).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(5).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(6).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(7).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(8).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(9).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(10).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(11).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(12).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(13).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(14).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(15).png")),
                ImageIO.read(new File("C:/Users/hitro/Java2/src/Meth2/Pr12/point2/image/fr(16).png"))

        };

        BufferedImage img = null;

        JToggleButton btn = new JToggleButton("Start");
        btn.setBackground(Color.white);
        btn.setForeground(Color.gray);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel jp = new JPanel(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(frames[0]));
        add(label, BorderLayout.CENTER);
        jp.add(btn, BorderLayout.CENTER);
        add(jp, BorderLayout.NORTH);

        ActionListener animate = new ActionListener() {

            public int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                label.setIcon(new ImageIcon(frames[index]));
            }
        };
        final Timer timer = new Timer(25, animate);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start();
                    btn.setForeground(Color.gray);
                } else {
                    btn.setText("Start");
                    timer.stop();
                    btn.setForeground(Color.gray);
                }

            }
        });
        UIManager.put("ToggleButton.select", Color.white);
        SwingUtilities.updateComponentTreeUI(btn);
    }

    public static void main(String[] args) throws Exception {
        new TestAnim().setVisible(true);
    }
}