/**
 *
 * @author NAME
 */

import java.awt.Color;
import java.util.*;
import java.lang.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TraversingArrayLists {
    public static void main(String[] args) throws Exception {
        ArrayList<Color> colors=new ArrayList<Color>();
        for (int i = 0; i < 10; i++) {
            colors.add(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
        }
        //print out all colors that have more blue than red
        for (Color color : colors) {
            if(color.getBlue()>color.getRed())
                System.out.println(color+"    " + color.getBlue() +"    "+color.getRed());
        }
        //remove all colors where there is more green than red
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).getGreen() > colors.get(i).getRed())  
                colors.remove(colors.get(i--));
        }
        
        System.out.println("++++++++++++++++");
        JPanel panel=new JPanel();
        for (int i = 0; i < colors.size(); i++) {
            JButton button=new JButton(""+i);
            button.setBackground(colors.get(i));
            panel.add(button);
            System.out.println(colors.get(i));
        }
        JOptionPane.showMessageDialog(null, panel);
    }

}
