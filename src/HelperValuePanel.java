import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelperValuePanel extends JPanel {
    public static ActionListener listener;
    JLabel helperText;
    HelperValuePanel(String defaultText){
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        this.setOpaque(false);

        helperText = new JLabel(defaultText);
        helperText.setFont(new Font("Arial", Font.ITALIC, 15));
        helperText.setForeground(Color.WHITE);


        this.add(helperText, BorderLayout.EAST);

        listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("change_text")){
                    ActionData actionData = (ActionData) e.getSource();
                    String text;
                    if(actionData.shouldBePrinted){
                        text = Calculator.PrintOptimized(actionData.text, 7);
                        if(actionData.operation == 17){
                            text += " /";
                        }
                        else if(actionData.operation == 18){
                            text += " x";
                        }
                        else if(actionData.operation == 19){
                            text += " -";
                        }
                        else if(actionData.operation == 20){
                            text += " +";
                        }
                    }
                    else{
                        text = " ";
                    }
                    ChangeText(text);
                }
            }
        };
    }
    void ChangeText(String text){
        helperText.setText(text);
    }
}
