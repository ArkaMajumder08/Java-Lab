import java.awt.*;
import java.awt.event.*;

public class AWTCalculator extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div;

    AWTCalculator() {
        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        result.setBounds(50,150,100,30);

        add.setBounds(200,50,50,30);
        sub.setBounds(200,100,50,30);
        mul.setBounds(200,150,50,30);
        div.setBounds(200,200,50,30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        add(t1); add(t2); add(result);
        add(add); add(sub); add(mul); add(div);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int res = 0;

        if(e.getSource() == add) res = a + b;
        if(e.getSource() == sub) res = a - b;
        if(e.getSource() == mul) res = a * b;
        if(e.getSource() == div) res = a / b;

        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}