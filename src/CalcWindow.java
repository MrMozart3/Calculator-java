import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CalcWindow extends JFrame{
    private void reRender(TopPanel topPanel, BottomPanel bottomPanel){
        int totalHeight = getContentPane().getHeight();
        int topPanelHeight = (int) (totalHeight * 0.2);
        int bottomPanelHeight = totalHeight - topPanelHeight;
        topPanel.setPreferredSize(new Dimension(getContentPane().getWidth(), topPanelHeight));
        bottomPanel.setPreferredSize(new Dimension(getContentPane().getWidth(), bottomPanelHeight));
        revalidate();
        repaint();
    }
    CalcWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(400, 600));
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(0x323233));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //grid bag layout with constraints
        TopPanel topPanel = new TopPanel();
        add(topPanel, BorderLayout.NORTH);

        BottomPanel bottomPanel = new BottomPanel();
        add(bottomPanel, BorderLayout.CENTER);


        reRender(topPanel, bottomPanel);


        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                reRender(topPanel, bottomPanel);
            }
        });

        this.setVisible(true);
    }
}
