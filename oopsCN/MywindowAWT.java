import java.awt.*;
public class MywindowAWT{
	public static void main(String[] str){
		Frame f= new Frame("Simple AWT window");
		Label l= new Label("Hello, AWT");
		l.setBackground(Color.GREEN);
		l.setBounds(100,100,300,30);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
}