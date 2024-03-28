import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberButton extends JButton {
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_SPECIAL = 1;
    public static final int TYPE_EQUALS = 2;
    private static final int TYPE_HOVER = 3;
    ImageIcon ScaleIcon(ImageIcon icon, int scale){
        Image image = icon.getImage(); // transform it
        Image newimg = image.getScaledInstance(scale, scale,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        return new ImageIcon(newimg);  // transform it back
    }
    private void ChangeBackground(int Type){
        switch (Type){
            case TYPE_DEFAULT:
                this.setBackground(new Color(0x595959));
                break;
            case TYPE_SPECIAL:
                this.setBackground(new Color(0x2D2D2D));
                break;
            case TYPE_EQUALS:
                this.setBackground(new Color(0x67B9FF));
                break;
            case TYPE_HOVER:
                this.setBackground(new Color(0x7E7E7E));
                break;
            default :
                System.out.println("Wrong Type, ERROR");
        }
    }
    private void ChangeText(int Button_ID){
        switch(Button_ID){
            case Calculator.BUTTON_ID_0:
                this.setText("0");
                break;
            case Calculator.BUTTON_ID_1:
                this.setText("1");
                break;
            case Calculator.BUTTON_ID_2:
                this.setText("2");
                break;
            case Calculator.BUTTON_ID_3:
                this.setText("3");
                break;
            case Calculator.BUTTON_ID_4:
                this.setText("4");
                break;
            case Calculator.BUTTON_ID_5:
                this.setText("5");
                break;
            case Calculator.BUTTON_ID_6:
                this.setText("6");
                break;
            case Calculator.BUTTON_ID_7:
                this.setText("7");
                break;
            case Calculator.BUTTON_ID_8:
                this.setText("8");
                break;
            case Calculator.BUTTON_ID_9:
                this.setText("9");
                break;
            case Calculator.BUTTON_ID_PERCENT:
                this.setText("%");
                break;
            case Calculator.BUTTON_ID_CE:
                this.setText("CE");
                break;
            case Calculator.BUTTON_ID_C:
                this.setText("C");
                break;
            case Calculator.BUTTON_ID_DEL:
                ImageIcon tempImage = new ImageIcon("Assets/BUTTON_DEL.png");
                this.setIcon(ScaleIcon(tempImage, 35));
                break;
            case Calculator.BUTTON_ID_1X:
                this.setText("1/x");
                break;
            case Calculator.BUTTON_ID_X2:
                this.setText("x^2");
                break;
            case Calculator.BUTTON_ID_SQRT2:
                this.setText("sqrt(x)");
                break;
            case Calculator.BUTTON_ID_DIVIDE:
                this.setText("/");
                break;
            case Calculator.BUTTON_ID_MULTIPLY:
                this.setText("x");
                break;
            case Calculator.BUTTON_ID_SUBTRACT:
                this.setText("-");
                break;
            case Calculator.BUTTON_ID_SUM:
                this.setText("+");
                break;
            case Calculator.BUTTON_ID_EQUALS:
                this.setText("=");
                break;
            case Calculator.BUTTON_ID_CHANGE:
                this.setText("+/-");
                break;
            case Calculator.BUTTON_ID_DECIMAL:
                this.setText(",");
                break;

        }
    }
    NumberButton(int Button_ID, int Type){
        //start
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        //background color
        ChangeBackground(Type);
        //text
        ChangeText(Button_ID);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Arial", Font.PLAIN, 22));
        //custom id
        this.setName(String.valueOf(Button_ID));
        //listeners
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                ChangeBackground(TYPE_HOVER);
            }
            @Override
            public void mouseExited(MouseEvent e){
                ChangeBackground(Type);
            }
        });
    }
}
