import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BottomPanel extends JPanel {
    BottomPanel(){
        this.setLayout(new GridLayout(6, 4, 3, 3));
        //no background
        this.setOpaque(false);
        //border
        Border emptyBorder = BorderFactory.createEmptyBorder(3, 3, 3, 3);
        this.setBorder(emptyBorder);
        //buttons
        this.add(new NumberButton(Calculator.BUTTON_ID_PERCENT, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_CE, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_C, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_DEL, NumberButton.TYPE_SPECIAL));

        this.add(new NumberButton(Calculator.BUTTON_ID_1X, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_X2, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_SQRT2, NumberButton.TYPE_SPECIAL));
        this.add(new NumberButton(Calculator.BUTTON_ID_DIVIDE, NumberButton.TYPE_SPECIAL));

        this.add(new NumberButton(Calculator.BUTTON_ID_7, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_8, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_9, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_MULTIPLY, NumberButton.TYPE_SPECIAL));

        this.add(new NumberButton(Calculator.BUTTON_ID_4, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_5, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_6, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_SUBTRACT, NumberButton.TYPE_SPECIAL));

        this.add(new NumberButton(Calculator.BUTTON_ID_1, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_2, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_3, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_SUM, NumberButton.TYPE_SPECIAL));

        this.add(new NumberButton(Calculator.BUTTON_ID_CHANGE, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_0, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_DECIMAL, NumberButton.TYPE_DEFAULT));
        this.add(new NumberButton(Calculator.BUTTON_ID_EQUALS, NumberButton.TYPE_EQUALS));


    }
}
