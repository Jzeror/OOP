package ui;
/**
 비트뱅크
 기본통장(or마이너스통장)
 계좌번호: 123-123-123
 이름: 홍길동
 생성일: 2018년 6월 10일
 (입금유무 묻기)잔액: 1000 원
 ------------------------------
  비트뱅크
 마이너스통장
 계좌번호: 123-123-123
 이름: 홍길동
 생성일: 2018년 6월 10일
 (대출유무 묻기)잔액: -100 원
 **/
import javax.swing.JOptionPane;
import domain.Account;
enum Butt1 {
	종료, 통장만들기;
}

public class AccountMain {
	public static void main(String[] args) {
		Butt1[] buttons = { Butt1.종료, Butt1.통장만들기 };
		Account ac=null;
		while (true) {
			Butt1 select = (Butt1) JOptionPane.showInputDialog(null, // frame
					"MENU", // frame title
					"SELECT  MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			);
			switch (select) {
			case 종료:
				return;
			case 통장만들기:
				ac=new Account();
ac.setName(JOptionPane.showInputDialog("성명?"));
ac.setUid(JOptionPane.showInputDialog("인뱅 아이디?"));
ac.setPass(JOptionPane.showInputDialog("비밀번호?"));
ac.setCreateDate();
ac.setAccountNo();
ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("초기 예치금액?")));
				
JOptionPane.showMessageDialog(null, ac.toString());
break;
			}
		}
	}
}
