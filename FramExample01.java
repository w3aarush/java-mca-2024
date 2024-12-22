/*
============================================================================
Q. WAP to design a frame by using awt package with label textbox and button?
============================================================================
*/
import java.awt.*;
class MyFrame extends Frame
{
	Label l1; TextField t1; Button b1;
	MyFrame()
	{
		setSize(400,400);
		setTitle("My first AWT Frame");
		l1 = new Label("Welcome to AWT Frame");
		t1 = new TextField(20);
		b1 = new Button("Click Me");
		l1.setBounds(20, 50, 300, 30);
		add(l1);
		t1.setBounds(20, 50, 400, 30);
		add(t1);
		b1.setBounds(200, 100, 100, 30);
		add(b1);
		setLayout(null);
		setVisible(true);

	}
}

class FrameExample01 {
	public static void main(String[] args) {
		new MyFrame();
	}
}