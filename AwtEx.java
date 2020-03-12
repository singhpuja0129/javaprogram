import java.awt.*;
public class AwtEx
{
	Frame f;
	Button b;
	Label l;
	TextField tf;
	public AwtEx()
	{
		f=new Frame("First Frame");
		//f.setTitle("First Frame");
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		l=new Label("Hello Incapp");
		l.setBounds(40,50,80,20);
		f.add(l);
		tf=new TextField();
		tf.setBounds(40,100,100,20);
		f.add(tf);
		b=new Button("Ok");
		b.setBounds(40,150,40,40);
		f.add(b);
	}
		public static void main(String args[])
		{
			new AwtEx();
		}
}