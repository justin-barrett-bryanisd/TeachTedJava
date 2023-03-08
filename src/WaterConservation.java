import javax.swing.*;
import java.awt.*;

public class WaterConservation
{
    public static void main(String[] args)
    {
        StartScreen startScreen = new StartScreen();
        startScreen.setVisible(true);
    }

}

class StartScreen extends JFrame
{
    StartScreen()
    {
        setSize(320, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Water Conservation Tips");
        title.setBounds(35, 10, 250, 30);
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        add(title);

        JLabel description = new JLabel("It's important that we all do our part to use less water. " +
                "Click through this app for tips for conservation ideas.");
        description.setBounds(40, 70, 240, 90);
        add(description);
    }
}