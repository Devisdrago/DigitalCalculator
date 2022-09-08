import javax.swing.*;

public class Calc extends JFrame {

    private JPanel panel;
    private JButton equalsButton;
    private JButton backspaceButton;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton divideButton;
    private JButton a4Button;
    private JButton a6Button;
    private JButton multiplyButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton minusButton;
    private JButton clearButton1;
    private JButton a0Button;
    private JButton dotButton;
    private JButton plusButton;
    private JTextField textField1;
    private char mathOperator;


    public Calc() {

        var ref = new Object() {
            Double total = 0d;
        };

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(panel);


        a1Button.addActionListener(e -> textField1.setText(textField1.getText() + a1Button.getText()));
        a2Button.addActionListener(e -> textField1.setText(textField1.getText() + a2Button.getText()));
        a3Button.addActionListener(e -> textField1.setText(textField1.getText() + a3Button.getText()));
        a4Button.addActionListener(e -> textField1.setText(textField1.getText() + a4Button.getText()));
        a5Button.addActionListener(e -> textField1.setText(textField1.getText() + a5Button.getText()));
        a6Button.addActionListener(e -> textField1.setText(textField1.getText() + a6Button.getText()));
        a7Button.addActionListener(e -> textField1.setText(textField1.getText() + a7Button.getText()));
        a8Button.addActionListener(e -> textField1.setText(textField1.getText() + a8Button.getText()));
        a9Button.addActionListener(e -> textField1.setText(textField1.getText() + a9Button.getText()));
        a0Button.addActionListener(e -> textField1.setText(textField1.getText() + a0Button.getText()));
        dotButton.addActionListener(e -> textField1.setText(textField1.getText() + dotButton.getText()));

        plusButton.addActionListener(e -> {
            ref.total = ref.total + Double.parseDouble(textField1.getText());
            textField1.setText(null);
            mathOperator = '+';
        });

        minusButton.addActionListener((e -> {
            ref.total = Double.parseDouble(textField1.getText()) - ref.total;
            textField1.setText(null);
            mathOperator = '-';
        }));

        multiplyButton.addActionListener(e -> {
            ref.total = 1d;
            ref.total = ref.total * Double.parseDouble(textField1.getText());
            textField1.setText(null);
            mathOperator = '*';
        });

        divideButton.addActionListener(e -> {
            ref.total = 1d;
            ref.total = ref.total * Double.parseDouble(textField1.getText());
            textField1.setText(null);
            mathOperator = '/';

        });

        equalsButton.addActionListener(e -> {

            if (mathOperator == '+') {

                textField1.setText(Double.toString(ref.total + Double.parseDouble(textField1.getText())));
                ref.total = 0d;
            } else if (mathOperator == '-') {
                textField1.setText(Double.toString(ref.total - Double.parseDouble(textField1.getText())));
                ref.total = 0d;
            } else if (mathOperator == '/') {
                textField1.setText(Double.toString(ref.total / Double.parseDouble(textField1.getText())));
                ref.total = 0d;
            } else if (mathOperator == '*') {
                textField1.setText(Double.toString(ref.total * Double.parseDouble(textField1.getText())));
                ref.total = 0d;
            }

        });

        clearButton1.addActionListener(e -> {
            textField1.setText(null);
            ref.total = 0d;
        });


        backspaceButton.addActionListener(e -> {
            
            int input = textField1.getText().length();
            if(input > 0){
                textField1.setText(textField1.getText().substring(0,input-1));
            }
        });

    }


}





