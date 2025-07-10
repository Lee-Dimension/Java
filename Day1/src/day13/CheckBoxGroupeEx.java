package day13;

import java.awt.*;

public class CheckBoxGroupeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("Frame");
		Panel p = new Panel();
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox radio1 = new Checkbox("라디오1",group, false);
		Checkbox radio2 = new Checkbox("라디오2",group, false);
		Checkbox radio3 = new Checkbox("라디오3",group, true);
		
		p.add(radio1);
		p.add(radio2);
		p.add(radio3);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);		
	}
}
