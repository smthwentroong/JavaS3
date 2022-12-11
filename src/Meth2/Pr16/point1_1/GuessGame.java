package Meth2.Pr16.point1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame extends JFrame{
    public GuessGame(){
        super("Угадайка");
        setSize(300,100);
        setLayout(new BorderLayout());

        JTextField userInput = new JTextField();
        add(userInput,BorderLayout.CENTER);

        JButton userButton = new JButton("TRY");
        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer val = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userInput.getText().toString() == "") return;
                if (userInput.getText().toString().equals(val.toString())){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Угадал",
                            "Угадал",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else if(counter[0] == 2){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Проиграл",
                            "Проиграл",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else{
                    counter[0]++;
                    if (Integer.parseInt(userInput.getText().toString()) > val){
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Меньше",
                                "Меньше",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Больше",
                                "Больше",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessGame().setVisible(true);
    }

}
