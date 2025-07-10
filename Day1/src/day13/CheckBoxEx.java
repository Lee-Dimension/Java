package day13;

import java.awt.*;

public class CheckBoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("Frame");
		Panel p = new Panel();
		
		Checkbox checkbox1=new Checkbox();
		Checkbox checkbox2=new Checkbox("Button2",true);
		Checkbox checkbox3=new Checkbox("Button3");
		
		p.add(checkbox1);
		p.add(checkbox2);
		p.add(checkbox3);
		
		f.add(p);
		f.setSize(300,100);
		f.setVisible(true);
		
	}

}
