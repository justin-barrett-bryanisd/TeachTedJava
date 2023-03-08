
/**
 *
 * @author NAME
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
            BetterButton b1=new BetterButton("Monopoly");
            b1.setBackground(new Color(125,200,23)); 
            frame.add(b1);
        }

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   

}
