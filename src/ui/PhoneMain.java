package ui;
//버튼 0.통화종료 

//1.집전화기

import javax.swing.JOptionPane;
import domain.*;

enum Butt {
	EXIT, TELEPHONE, CELLPHONE, IPHONE, GALAXYPHONE;
}

public class PhoneMain {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.TELEPHONE, Butt.CELLPHONE, Butt.IPHONE, Butt.GALAXYPHONE };
		Phone phone = null;

		while (true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"MENU", // frame title
					"SELECT CALL MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			); 
			switch (select) {
			case EXIT:
				return;
			case TELEPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("집전화번호?"));
				phone.setCall(JOptionPane.showInputDialog("용건?"));
				JOptionPane.showMessageDialog(null, phone.toString());
			case CELLPHONE:
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("집전화번호?"));
				phone.setCall(JOptionPane.showInputDialog("용건?"));

				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case IPHONE:
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("집전화번호?"));
				phone.setCall(JOptionPane.showInputDialog("용건?"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("1.문자 2.전화"));

				JOptionPane.showMessageDialog(null, phone.toString());

			case GALAXYPHONE:
				phone = new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("이름?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("집전화번호?"));
				phone.setCall(JOptionPane.showInputDialog("용건?"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("1.문자 2.전화 3.카톡"));
				JOptionPane.showMessageDialog(null, phone.toString());
			default:
				break;
			}
		}
	}
}
