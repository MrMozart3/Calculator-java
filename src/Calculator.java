import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static ActionListener listener;
    public static final int BUTTON_ID_0 = 0;
    public static final int BUTTON_ID_1 = 1;
    public static final int BUTTON_ID_2 = 2;
    public static final int BUTTON_ID_3 = 3;
    public static final int BUTTON_ID_4 = 4;
    public static final int BUTTON_ID_5 = 5;
    public static final int BUTTON_ID_6 = 6;
    public static final int BUTTON_ID_7 = 7;
    public static final int BUTTON_ID_8 = 8;
    public static final int BUTTON_ID_9 = 9;
    public static final int BUTTON_ID_PERCENT = 10;
    public static final int BUTTON_ID_CE = 11;
    public static final int BUTTON_ID_C = 12;
    public static final int BUTTON_ID_DEL = 13;
    public static final int BUTTON_ID_1X = 14;
    public static final int BUTTON_ID_X2 = 15;
    public static final int BUTTON_ID_SQRT2 = 16;
    public static final int BUTTON_ID_DIVIDE = 17;
    public static final int BUTTON_ID_MULTIPLY = 18;
    public static final int BUTTON_ID_SUBTRACT = 19;
    public static final int BUTTON_ID_SUM = 20;
    public static final int BUTTON_ID_EQUALS = 21;
    public static final int BUTTON_ID_DECIMAL = 22;
    public static final int BUTTON_ID_CHANGE = 23;
    private static final int STATE_NUM = 0;
    private static final int STATE_OP = 0;
    Calculator(){
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton)e.getSource();
                String buttonName = button.getName();
                int hyphenIndex = buttonName.indexOf('-');
                if(hyphenIndex != -1) {
                    if(buttonName.substring(0, hyphenIndex).equals("numbutton")){
                        ButtonClicked(Integer.parseInt(buttonName.substring(hyphenIndex + 1)));
                    }
                }
            }
        };
    }
    private int state;
    private double sum = 0;
    private String currentText = "";
    public void ButtonClicked(int Button_ID)
    {
        System.out.println(Button_ID);
        switch(Button_ID){
            case Calculator.BUTTON_ID_0:
                state = STATE_NUM;
                if(!currentText.equals("0")){
                    currentText += "0";
                }
                break;
            case Calculator.BUTTON_ID_1:
                state = STATE_NUM;
                currentText += "1";
                break;
            case Calculator.BUTTON_ID_2:
                state = STATE_NUM;
                currentText += "2";
                break;
            case Calculator.BUTTON_ID_3:
                
                break;
            case Calculator.BUTTON_ID_4:
                
                break;
            case Calculator.BUTTON_ID_5:
                
                break;
            case Calculator.BUTTON_ID_6:
                
                break;
            case Calculator.BUTTON_ID_7:
                
                break;
            case Calculator.BUTTON_ID_8:
                
                break;
            case Calculator.BUTTON_ID_9:
                
                break;
            case Calculator.BUTTON_ID_PERCENT:
                
                break;
            case Calculator.BUTTON_ID_CE:
                ;
                break;
            case Calculator.BUTTON_ID_C:
                
                break;
            case Calculator.BUTTON_ID_DEL:
                break;
            case Calculator.BUTTON_ID_1X:
                break;
            case Calculator.BUTTON_ID_X2:
                break;
            case Calculator.BUTTON_ID_SQRT2:
                break;
            case Calculator.BUTTON_ID_DIVIDE:
                
                break;
            case Calculator.BUTTON_ID_MULTIPLY:
                
                break;
            case Calculator.BUTTON_ID_SUBTRACT:
                
                break;
            case Calculator.BUTTON_ID_SUM:
                
                break;
            case Calculator.BUTTON_ID_EQUALS:
                
                break;
            case Calculator.BUTTON_ID_CHANGE:
                break;
            case Calculator.BUTTON_ID_DECIMAL:
                
                break;

        }
        TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, String.valueOf(Button_ID)));
    }
}
