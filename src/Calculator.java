import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static ActionListener listener;
    public static final int BUTTON_NONE = -1;
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
    private static final int STATE_OP = 1;
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
    private double firstNumber = 0;
    private double secondNumber = 0;
    private int OPERATION = BUTTON_NONE;
    private double Calculate(int Operation_ID){
        return switch (Operation_ID) {
            case Calculator.BUTTON_ID_DIVIDE -> firstNumber / secondNumber;
            case Calculator.BUTTON_ID_MULTIPLY -> firstNumber * secondNumber;
            case Calculator.BUTTON_ID_SUBTRACT -> firstNumber - secondNumber;
            case Calculator.BUTTON_ID_SUM -> firstNumber + secondNumber;
            default -> secondNumber;
        };
    }
    public void ButtonClicked(int Button_ID)
    {
        switch(Button_ID){
            case Calculator.BUTTON_ID_0:
                if(OPERATION == BUTTON_NONE) firstNumber *= 10;
                else if(OPERATION != BUTTON_ID_EQUALS) secondNumber *= 10;
                break;
            case Calculator.BUTTON_ID_1:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 1;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 1;
                }
                break;
            case Calculator.BUTTON_ID_2:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 2;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 2;
                }
                break;
            case Calculator.BUTTON_ID_3:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 3;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 3;
                }
                break;
            case Calculator.BUTTON_ID_4:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 4;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 4;
                }
                break;
            case Calculator.BUTTON_ID_5:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 5;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 5;
                }
                break;
            case Calculator.BUTTON_ID_6:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 6;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 6;
                }
                break;
            case Calculator.BUTTON_ID_7:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 7;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 7;
                }
                break;
            case Calculator.BUTTON_ID_8:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 8;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 8;
                }
                break;
            case Calculator.BUTTON_ID_9:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= 10;
                    firstNumber += 9;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= 10;
                    secondNumber += 9;
                }
                break;
            case Calculator.BUTTON_ID_PERCENT:
                
                break;
            case Calculator.BUTTON_ID_CE:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber = 0;
                }
                else{
                    secondNumber = 0;
                }
                break;
            case Calculator.BUTTON_ID_C:
                firstNumber = 0;
                secondNumber = 0;
                OPERATION = BUTTON_NONE;
                break;
            case Calculator.BUTTON_ID_DEL:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber /= 10;
                    firstNumber = Math.floor(firstNumber);
                }
                else{
                    secondNumber /= 10;
                    secondNumber = Math.floor(secondNumber);
                }
                break;
            case Calculator.BUTTON_ID_1X:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber = 1 / firstNumber;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber = 1 / secondNumber;
                }
                break;
            case Calculator.BUTTON_ID_X2:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= firstNumber;
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber *= secondNumber;
                }
                break;
            case Calculator.BUTTON_ID_SQRT2:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber = Math.sqrt(firstNumber);
                }
                else if(OPERATION != BUTTON_ID_EQUALS){
                    secondNumber = Math.sqrt(secondNumber);
                }
                break;
            case Calculator.BUTTON_ID_DIVIDE:
                if(OPERATION == BUTTON_ID_EQUALS){
                    firstNumber = secondNumber;
                    secondNumber = 0;
                }
                OPERATION = BUTTON_ID_DIVIDE;
                break;
            case Calculator.BUTTON_ID_MULTIPLY:
                if(OPERATION == BUTTON_ID_EQUALS){
                    firstNumber = secondNumber;
                    secondNumber = 0;
                }
                OPERATION = BUTTON_ID_MULTIPLY;
                break;
            case Calculator.BUTTON_ID_SUBTRACT:
                if(OPERATION == BUTTON_ID_EQUALS){
                    firstNumber = secondNumber;
                    secondNumber = 0;
                }
                OPERATION = BUTTON_ID_SUBTRACT;
                break;
            case Calculator.BUTTON_ID_SUM:
                if(OPERATION == BUTTON_ID_EQUALS){
                    firstNumber = secondNumber;
                    secondNumber = 0;
                }
                OPERATION = BUTTON_ID_SUM;
                break;
            case Calculator.BUTTON_ID_EQUALS:
                secondNumber = Calculate(OPERATION);
                OPERATION = BUTTON_ID_EQUALS;
                break;
            case Calculator.BUTTON_ID_CHANGE:
                break;
            case Calculator.BUTTON_ID_DECIMAL:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Button_ID);
        }
        if(OPERATION == BUTTON_NONE){
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "11" + firstNumber));
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "22" + secondNumber));
        }
        else if(OPERATION != BUTTON_ID_EQUALS){
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "21" + firstNumber));
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "11" + secondNumber));
        }
        else{
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "11" + secondNumber));
            TopPanel.TopPanelListener.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "22" + firstNumber));
        }
        System.out.println(firstNumber + " " + OPERATION + " " + secondNumber);
    }
}
