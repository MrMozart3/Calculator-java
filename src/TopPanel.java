import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {
    JLabel CurrentNumber;
    TopPanel(){
        this.setLayout(new GridLayout(2, 1, 3, 3));
        CurrentNumber = new JLabel();
        //no background
        this.setOpaque(false);
    }
    public static void UpdateText(String Text){

    }
}
