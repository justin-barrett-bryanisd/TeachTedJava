
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



/**
 *
 * @author jbarrett
 */
public class BetterButton extends JButton implements ActionListener{
    static int allNum=1;
    public BetterButton(String text, Font font){
        super(text);
        this.setFont(font);
        this.setText((allNum++)+") "+text);
        this.addActionListener(this);
    }
    
    public BetterButton(String text){
        this(text, new Font("Curlz MT",Font.PLAIN, 21));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(this.getText()+""+this.toString());
    }
    
    
    
    
}
