package calculator;

import javax.swing.*;

public class Calculator extends JFrame {
    private JTextField EquationTextField;
    private boolean isCalculated;
    private String sign = "";
    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
        initComponents();
    }
    private void initComponents(){
        setTitle("Calculator");
        setLayout(null); // Set layout manager to null for absolute positioning


        EquationTextField = new JTextField();
        EquationTextField.setText("");
        EquationTextField.setName("EquationTextField");
        EquationTextField.setBounds(10, 20, 230, 30);
        add(EquationTextField);

        JButton Seven = new JButton("7");
        Seven.setName("Seven");
        Seven.setBounds(10, 50, 50, 50);
        Seven.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "7");
        });
        add(Seven);

        JButton Eight = new JButton("8");
        Eight.setName("Eight");
        Eight.setBounds(70, 50, 50, 50);
        Eight.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "8");
        });
        add(Eight);

        JButton Nine = new JButton("9");
        Nine.setName("Nine");
        Nine.setBounds(130, 50, 50, 50);
        Nine.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "9");
        });
        add(Nine);

        JButton Divide = new JButton("/");
        Divide.setName("Divide");
        Divide.setBounds(190, 50, 50, 50);
        Divide.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "/");
        });
        add(Divide);

        JButton Four = new JButton("4");
        Four.setName("Four");
        Four.setBounds(10, 110, 50, 50);
        Four.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "4");
        });
        add(Four);

        JButton Five = new JButton("5");
        Five.setName("Five");
        Five.setBounds(70, 110, 50, 50);
        Five.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "5");
        });
        add(Five);

        JButton Six = new JButton("6");
        Six.setName("Six");
        Six.setBounds(130, 110, 50, 50);
        Six.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "6");
        });
        add(Six);

        JButton Multiply = new JButton("x");
        Multiply.setName("Multiply");
        Multiply.setBounds(190, 110, 50, 50);
        Multiply.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "x");
        });
        add(Multiply);

        JButton One = new JButton("1");
        One.setName("One");
        One.setBounds(10, 170, 50, 50);
        One.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "1");
        });
        add(One);

        JButton Two = new JButton("2");
        Two.setName("Two");
        Two.setBounds(70, 170, 50, 50);
        Two.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "2");
        });
        add(Two);

        JButton Three = new JButton("3");
        Three.setName("Three");
        Three.setBounds(130, 170, 50, 50);
        Three.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "3");
        });
        add(Three);

        JButton Add = new JButton("+");
        Add.setName("Add");
        Add.setBounds(190, 170, 50, 50);
        Add.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "+");
        });
        add(Add);

        JButton Zero = new JButton("0");
        Zero.setName("Zero");
        Zero.setBounds(70, 230, 50, 50);
        Zero.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "0");
        });
        add(Zero);

        JButton Subtract = new JButton("-");
        Subtract.setName("Subtract");
        Subtract.setBounds(190, 230, 50, 50);
        Subtract.addActionListener(e -> {
            EquationTextField.setText(EquationTextField.getText() + "-");
        });
        add(Subtract);

        JButton Equals = new JButton("=");
        Equals.setName("Equals");
        Equals.setBounds(130, 230, 50, 50);
        Equals.addActionListener(e -> {
            if (!isCalculated) {
                String equation = EquationTextField.getText();
                if (equation.contains("+")){
                    sign = "+";
                    String[] parts = equation.split("\\Q" + sign + "\\E");

                    try {
                        int firstNumber = Integer.parseInt(parts[0]);
                        int secondNumber = Integer.parseInt(parts[1]);
                        int result = firstNumber + secondNumber;
                        EquationTextField.setText(equation + "=" + result);
                    } catch (NumberFormatException ex) {
                        try {
                            float firstNumber = Float.parseFloat(parts[0]);
                            float secondNumber = Float.parseFloat(parts[1]);
                            float result = firstNumber + secondNumber;
                            EquationTextField.setText(equation + " = " + result);
                        } catch (NumberFormatException ex2) {
                            EquationTextField.setText("Invalid equation");
                        }
                    }
                } else if (equation.contains("-")){
                    sign = "-";
                    String[] parts = equation.split("\\Q" + sign + "\\E");

                    try {
                        int firstNumber = Integer.parseInt(parts[0]);
                        int secondNumber = Integer.parseInt(parts[1]);
                        int result = firstNumber - secondNumber;
                        EquationTextField.setText(equation + "=" + result);
                    } catch (NumberFormatException ex) {
                        try {
                            float firstNumber = Float.parseFloat(parts[0]);
                            float secondNumber = Float.parseFloat(parts[1]);
                            float result = firstNumber - secondNumber;
                            EquationTextField.setText(equation + " = " + result);
                        } catch (NumberFormatException ex2) {
                            EquationTextField.setText("Invalid equation");
                        }
                    }
                } else if (equation.contains("/")){
                    sign = "/";
                    String[] parts = equation.split("\\Q" + sign + "\\E");

                    try {
                        float firstNumber = Float.parseFloat(parts[0]);
                        float secondNumber = Float.parseFloat(parts[1]);
                        float result = firstNumber / secondNumber;
                        EquationTextField.setText(equation + "=" + result);
                    } catch (NumberFormatException ex) {
                        EquationTextField.setText("Invalid equation");
                    }
                } else if (equation.contains("x")){
                    sign = "x";
                    String[] parts = equation.split("\\Q" + sign + "\\E");

                    try {
                        int firstNumber = Integer.parseInt(parts[0]);
                        int secondNumber = Integer.parseInt(parts[1]);
                        int result = firstNumber * secondNumber;
                        EquationTextField.setText(equation + "=" + result);
                    } catch (NumberFormatException ex) {
                        try {
                            float firstNumber = Float.parseFloat(parts[0]);
                            float secondNumber = Float.parseFloat(parts[1]);
                            float result = firstNumber * secondNumber;
                            EquationTextField.setText(equation + " = " + result);
                        } catch (NumberFormatException ex2) {
                            EquationTextField.setText("Invalid equation");
                        }
                    }
                }
            }
        });
        add(Equals);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 200);
        setVisible(true);


    }
}
