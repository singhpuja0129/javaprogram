import java.awt.*;
public class AwtEx1 extends Frame{
	Button b;
	Label l;
	TextField tf;
	public AwtEx1(){
	super("1st frame");
	//setTitle("First Frame");
	setLayout(null);
	setSize(400,400);
	setVisible(true);
	l.setBounds(40,100,100,20);
	add(tf);
	b=new Button("Ok");
	b.setBounds(40,150,40,40);
	add(b);
	}
	public static void main(String args[]){
		new AwtEx1();
	}
}