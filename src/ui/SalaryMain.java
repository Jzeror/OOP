package ui;
/**
 //다형성 .. 인스턴스를 하나만 사용해서 재활용하는 것. 단 상속에서만 가능
 //생성자에 부서, 이름, sal 을 반드시 받아야 객체가 생성
 //되도록 해주세요.
 //김길동 , 100 -> 김인턴 100만원 지급
 //김길동, 100 -> 김직원 110만원 지금
 //김길동, 100 -> 김이사 1100만원 지급
 * */
import javax.swing.JOptionPane;
import domain.*;

enum SalaryButt{
	EXIT,
	INTERNSHIP,
	EMPLOYEE,
	BOARD ;
}
public class SalaryMain {
	public static void main(String[] args) {
		SalaryButt[] buttons = { SalaryButt.EXIT, SalaryButt.INTERNSHIP, SalaryButt.EMPLOYEE, SalaryButt.BOARD };
		Salary s=null;
		while(true) {
			SalaryButt select = (SalaryButt) JOptionPane.showInputDialog(null, // frame
					"MENU", // frame title
					"SELECT  MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			);	
			switch(select) {
			case EXIT : 
				return;
			case INTERNSHIP : 
				JOptionPane.showMessageDialog(null,new Salary(
						JOptionPane.showInputDialog("이름?"),
						JOptionPane.showInputDialog("월급?")
						).toString());
				break;
			case EMPLOYEE :
				JOptionPane.showMessageDialog(null,new StaffSalary(
						JOptionPane.showInputDialog("이름?"),
						JOptionPane.showInputDialog("월급?") //변환도 클래스로
						).toString());
				break;
			case BOARD :
				JOptionPane.showMessageDialog(null,new OwnerSalary(
						JOptionPane.showInputDialog("이름?"),
					JOptionPane.showInputDialog("월급?")
						).toString());
				break;
			}
		}
	}
}
