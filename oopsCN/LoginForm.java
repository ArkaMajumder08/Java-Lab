import java.awt.*;

public class LoginForm extends Frame {
    LoginForm() {
        Label l1 = new Label("Username:");
        Label l2 = new Label("Password:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t2.setEchoChar('*');

        Button b = new Button("Login");

        l1.setBounds(50, 50, 80, 30);
        t1.setBounds(150, 50, 100, 30);
        l2.setBounds(50, 100, 80, 30);
        t2.setBounds(150, 100, 100, 30);
        b.setBounds(100, 150, 80, 30);

        add(l1); add(t1); add(l2); add(t2); add(b);

        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}