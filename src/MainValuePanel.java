import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainValuePanel extends JPanel {
    public static ActionListener listener;
    JLabel mainText;
    MainValuePanel(String defaultText){
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        this.setOpaque(false);

        mainText = new JLabel(defaultText);
        mainText.setFont(new Font("Arial", Font.BOLD, 30));
        mainText.setForeground(Color.WHITE);


        this.add(mainText, BorderLayout.EAST);

        listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("change_text")){
                    ActionData actionData = (ActionData) e.getSource();
                    String text;
                    if(actionData.shouldBePrinted){
                        if(actionData.operation == Calculator.BUTTON_ID_PERCENT){
                            text = Calculator.PrintOptimized(actionData.value * 100);
                            text += "%";
                        }
                        else {
                            text = Calculator.PrintOptimized(actionData.value);
                        }
                    }
                    else{
                        text = "";
                    }
                    ChangeText(text);
                }
            }
        };
    }
    void ChangeText(String text){
        mainText.setText(text);
    }
}
