import java.awt.*;
public class AwtEx2 extends Frame
{
	Button b1,b2;
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2;
	Panel p;
	public AwtEx2()
	{
		setTitle("First frame");
		setBackground(Color.GRAY);//f.setBackground(ne Color(40,60,90));
		setLayout(null);
		setSize(400,300);
		l1=new Label("Mini Calculator");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(150,60,100,20);
		add(l1);
		p=new Panel();
		p.setLayout(null);
		p.setBackground(Color.GREEN);
		p.setBounds(60,100,280,140);
		add(p);
		l2=new Label("Enter 1st No.");
		l2.setBounds(50,20,80,20);
		p.add(l2);
		tf1=new TextField();
		tf1.setForeground(Color.BLUE);
		tf1.setBounds(150,20,50,20);
		p.add(tf1);
		l3=new Label("Enter 2nd No");
		l3.setBounds(50,60,80,20);
		p.add(l3);
		tf2=new TextField();
		tf2.setForeground(Color.BLUE);
		tf2.setBounds(150,60,50,20);
		p.add(tf2);
		b1=new Button("+");
		b1.setBounds(50,100,40,30);
		p.add(b1);
		b2=new Button("clear");
		b2.setBounds(70,150,100,20);
		p.add(b2);
		l4=new Label("Answer=");
		add(l4);
		l5=new Label("----------------");
		l5.setBounds(180,150,100,20);
		add(l5);
	}
		public static void main(String s[])
		{
			new AwtEx2().setVisible(true);
		}
}
		
		