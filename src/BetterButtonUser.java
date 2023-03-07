
/**
 *
 * @author NAME
 */

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.*;

public class BetterButtonUser {

    public static void main(String[] args) throws Exception {
        new BetterButtonUser();
    }

    public BetterButtonUser() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(0, 1));
        JButton ethanButton = new JButton("Ethan");
        ethanButton.setFont(new Font("Cooper", Font.PLAIN, 21));
        frame.add(ethanButton);
        for (int i = 0; i < 10; i++) {

            frame.add(new SuperBetterButton("Risk"));
            frame.add(new BetterButton("Monopoly"));
        }

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class BetterButton2 extends JButton implements ActionListener {

        static int allNum = 1;

        public BetterButton2(String text, Font font) {
            super(text);
            this.setFont(font);
            this.setText((allNum++) + ") " + text);
            this.addActionListener(this);
        }

        public BetterButton2(String text) {
            this(text, new Font("Cooper", Font.PLAIN, 21));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(this.getText()+"wekrjweojkrwl");
        }

    }

}
