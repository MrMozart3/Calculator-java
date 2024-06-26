import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class ActionData{
    double value;
    boolean shouldBePrinted;
    int operation;
    int firstDecimal;
    ActionData(double value, boolean shouldBePrinted, int firstDecimal){
        this.value = value;
        this.shouldBePrinted = shouldBePrinted;
        this.operation = -1;
        this.firstDecimal = firstDecimal;
    }
}
public class Calculator {
    public static String PrintOptimized(double value){
        boolean negative = false;
        NumberFormat formatter = new DecimalFormat("#0000000000.0000000");
        String initial = formatter.format(value);
        if(initial.charAt(0) == '-') {
            negative = true;
            initial = initial.substring(1);
        }

        if(initial.length() > 18){
            return String.valueOf(value);
        }

        for(int i = 0; i < 7; i++){
            if(initial.charAt(initial.length() - 1) == '0'){
                initial = initial.substring(0, initial.length() - 1);
                if(i == 7 - 1){
                    initial = initial.substring(0, initial.length() - 1);
                }
            }
            else break;
        }

        for(int i = 0; i < 9; i++){
            if(initial.charAt(0) == '0'){
                initial = initial.substring(1);
            }
            else break;
        }

        if(negative){
            return "-" + initial;
        }
        return initial;
    }
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
    private int firstDecimal = -1, secondDecimal = -1;
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
                if (OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstDecimal++;
                    }
                } else {
                    secondNumber *= 10;
                }
                break;
            case Calculator.BUTTON_ID_1:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal);
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 1;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 1;
                }
                break;
            case Calculator.BUTTON_ID_2:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 2;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 2;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 2;
                }
                break;
            case Calculator.BUTTON_ID_3:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 3;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 3;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 3;
                }
                break;
            case Calculator.BUTTON_ID_4:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 4;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 4;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 4;
                }
                break;
            case Calculator.BUTTON_ID_5:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 5;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 5;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 5;
                }
                break;
            case Calculator.BUTTON_ID_6:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 6;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 6;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 6;
                }
                break;
            case Calculator.BUTTON_ID_7:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 7;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 7;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 7;
                }
                break;
            case Calculator.BUTTON_ID_8:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 8;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 8;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 8;
                }
                break;
            case Calculator.BUTTON_ID_9:
                if(OPERATION == BUTTON_NONE) {
                    if(firstDecimal >= 0){
                        firstNumber += Math.pow(0.1, ++firstDecimal) * 9;
                    }
                    else {
                        firstNumber *= 10;
                        firstNumber += 9;
                    }
                }
                else{
                    secondNumber *= 10;
                    secondNumber += 9;
                }
                break;
            case Calculator.BUTTON_ID_PERCENT:
                if(OPERATION == BUTTON_NONE){
                    OPERATION = BUTTON_ID_PERCENT;
                }
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
                    if(firstDecimal > 0){
                        String text = PrintOptimized(firstNumber);
                        if(text.indexOf('e') == -1 && text.indexOf('E') == -1){
                            text = text.substring(0, text.length() - 1);
                            text = text.replace(',', '.');
                            firstNumber = Double.parseDouble(text);
                            text = PrintOptimized(firstNumber);
                            int found = text.indexOf(',');
                            if(found == -1){
                                firstDecimal = -1;
                                break;
                            }
                            text = text.replace(',', '.');
                            firstDecimal = text.length() - found - 1;
                            firstNumber = Double.parseDouble(text);
                        }
                        else{
                            firstDecimal = -1;
                            firstNumber = -1;
                        }
                    }
                    else{
                        firstNumber -= firstNumber % 10;
                        firstNumber /= 10;
                    }
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
                else{
                    secondNumber = 1 / secondNumber;
                }
                break;
            case Calculator.BUTTON_ID_X2:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= firstNumber;
                }
                else{
                    secondNumber *= secondNumber;
                }
                break;
            case Calculator.BUTTON_ID_SQRT2:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber = Math.sqrt(firstNumber);
                }
                else{
                    secondNumber = Math.sqrt(secondNumber);
                }
                break;
            case Calculator.BUTTON_ID_DIVIDE:
                OPERATION = BUTTON_ID_DIVIDE;
                break;
            case Calculator.BUTTON_ID_MULTIPLY:
                OPERATION = BUTTON_ID_MULTIPLY;
                break;
            case Calculator.BUTTON_ID_SUBTRACT:
                OPERATION = BUTTON_ID_SUBTRACT;
                break;
            case Calculator.BUTTON_ID_SUM:
                OPERATION = BUTTON_ID_SUM;
                break;
            case Calculator.BUTTON_ID_EQUALS:
                if(OPERATION != BUTTON_NONE) {
                    firstNumber = Calculate(OPERATION);
                    secondNumber = 0;
                    OPERATION = BUTTON_NONE;

                    String text = PrintOptimized(firstNumber);
                    int found = text.indexOf(',');
                    text = text.replace(',', '.');
                    firstDecimal = text.length() - found - 1;
                    firstNumber = Double.parseDouble(text);
                }

                break;
            case Calculator.BUTTON_ID_CHANGE:
                if(OPERATION == BUTTON_NONE) {
                    firstNumber *= -1;
                }
                else{
                    secondNumber *= -1;
                }
                break;
            case Calculator.BUTTON_ID_DECIMAL:
                if(OPERATION == BUTTON_NONE) {
                    firstDecimal = 0;
                }
                else{
                    secondDecimal = 0;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Button_ID);
        }
        ActionData mainData;
        ActionData secondData;
        if(OPERATION == BUTTON_NONE){
            mainData = new ActionData(firstNumber, true, firstDecimal);
            secondData = new ActionData(secondNumber, false, secondDecimal);
        }
        else if(OPERATION == BUTTON_ID_PERCENT){
            mainData = new ActionData(firstNumber, true, firstDecimal);
            secondData = new ActionData(secondNumber, false, firstDecimal);
            mainData.operation = OPERATION;
            OPERATION = BUTTON_NONE;
        }
        else{
            mainData = new ActionData(secondNumber, true, secondDecimal);
            secondData = new ActionData(firstNumber, true, firstDecimal);
            secondData.operation = OPERATION;
        }
        MainValuePanel.listener.actionPerformed(new ActionEvent(mainData, ActionEvent.ACTION_PERFORMED, "change_text"));
        HelperValuePanel.listener.actionPerformed(new ActionEvent(secondData, ActionEvent.ACTION_PERFORMED, "change_text"));
        System.out.println(firstNumber + " -> " + firstDecimal +  " | " + secondNumber + " -> " + secondDecimal + " | " + OPERATION);
    }
}

