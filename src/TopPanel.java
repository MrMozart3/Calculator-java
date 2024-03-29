import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TopPanel extends JPanel {
    public static ActionListener TopPanelListener;
    JLabel topLabel;
    JLabel midLabel;
    JLabel botLabel;

    TopPanel() {
        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setOpaque(false);

        MainValuePanel mainValuePanel = new MainValuePanel("");
        HelperValuePanel helperValuePanel = new HelperValuePanel("");

        this.add(helperValuePanel);
        this.add(mainValuePanel);
    }
}
