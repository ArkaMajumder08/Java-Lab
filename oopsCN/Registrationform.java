import java.awt.*;

public class Registrationform extends Frame {
    Registrationform() {
        Label name = new Label("Name:");
        Label email = new Label("Email:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        Checkbox male = new Checkbox("Male");
        Checkbox female = new Checkbox("Female");

        Button submit = new Button("Submit");

        name.setBounds(50,50,80,30);
        t1.setBounds(150,50,100,30);
        email.setBounds(50,100,80,30);
        t2.setBounds(150,100,100,30);
        male.setBounds(50,150,60,30);
        female.setBounds(120,150,70,30);
        submit.setBounds(100,200,80,30);

        add(name); add(t1); add(email); add(t2);
        add(male); add(female); add(submit);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Registrationform();
    }
}