import javax.swing.*;
import java.awt.*;

public class CalcWindow extends JFrame{
    CalcWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(350, 550));
        this.setLayout(new GridBagLayout());
        this.getContentPane().setBackground(new Color(0x323233));
        this.setLocationRelativeTo(null);
        //grid bag layout with constraints
        TopPanel topPanel = new TopPanel();
        BottomPanel bottomPanel = new BottomPanel();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.4;
        this.add(topPanel, gbc);
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(bottomPanel, gbc);

        this.setVisible(true);
    }
}
