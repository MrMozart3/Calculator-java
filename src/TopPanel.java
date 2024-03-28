import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TopPanel extends JPanel {
    public static ActionListener TopPanelListener;
    JLabel topLabel;
    JLabel botLabel;

    TopPanel() {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setOpaque(true);

        topLabel = new JLabel(" ");
        topLabel.setForeground(Color.GRAY);

        botLabel = new JLabel(" ");
        botLabel.setBackground(Color.GREEN);
        botLabel.setHorizontalAlignment(JLabel.RIGHT);
        botLabel.setFont(new Font("Arial", Font.PLAIN, 200));

        this.add(topLabel, BorderLayout.PAGE_END);
        this.add(botLabel, BorderLayout.PAGE_END);


        TopPanelListener = new ActionListener() {
            /*
                                    "abc"
                 a - 1 - botLabel   b - 1 - Show    c - text
                 a - 2 - topLabel   b - 2 - Hide    c - text
            */
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = e.getActionCommand();
                if(data.charAt(0) == '1'){
                    if(data.charAt(1) == '1'){
                        botLabel.setText(data.substring(2));
                    }
                    else if(data.charAt(1) == '2'){
                        botLabel.setText(" ");
                    }
                }
                else if(data.charAt(0) == '2'){
                    if(data.charAt(1) == '1'){
                        topLabel.setText(data.substring(2));
                    }
                    else if(data.charAt(1) == '2'){
                        topLabel.setText(" ");
                    }
                }
            }
        };
    }
}
