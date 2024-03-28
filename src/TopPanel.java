import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TopPanel extends JPanel {
    public static ActionListener TopPanelListener;
    JLabel currentLabel;
    TopPanel(){
        this.setLayout(new GridLayout(2, 1, 3, 3));
        this.setOpaque(false);

        currentLabel = new JLabel("test");
        currentLabel.setForeground(Color.WHITE);
        this.add(currentLabel);



        TopPanelListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateText(e.getActionCommand());
            }
        };
    }

    private void updateText(String Text) {
        currentLabel.setText(Text);
    }
}
