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
import domain.MinusAccount;

enum Butt1 {
	종료, 통장만들기, 입금, 출금;
}

public class AccountMain {
	public static void main(String[] args) {
		Butt1[] buttons = { Butt1.종료, Butt1.통장만들기, Butt1.입금, Butt1.출금 };
		Account ac = null;
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
				switch (JOptionPane.showInputDialog("1.입출금통장 2.마이너스통장")) {
				case "1":
					ac = new Account(JOptionPane.showInputDialog("성명?"), JOptionPane.showInputDialog("인뱅 아이디?"),
							JOptionPane.showInputDialog("비밀번호?"));
					ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("초기 예치금액?")));
					JOptionPane.showMessageDialog(null, ac.toString());
					break;
				case "2":
					ac = new MinusAccount(JOptionPane.showInputDialog("성명?"), JOptionPane.showInputDialog("인뱅 아이디?"),
							JOptionPane.showInputDialog("비밀번호?"));
					((MinusAccount) ac).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도?")));
					JOptionPane.showMessageDialog(null, ac.toString());
					break;
				}
			case 입금:
				int a = Integer.parseInt(JOptionPane.showInputDialog("입금하실 금액?"));
				if (a < 0) {
					JOptionPane.showMessageDialog(null, "잘못된 입력");
					return;
				}
				ac.setMoney(a);
				JOptionPane.showMessageDialog(null, "입금성공\n 잔액 :" + ac.getMoney());
				break;
			case 출금:
				int withdraw=0;
				if (((MinusAccount) ac).getLimit() != 0) {
					withdraw= Integer.parseInt(JOptionPane.showInputDialog("출금하실 금액?"));
			if(withdraw <((MinusAccount) ac).getLimit()+ac.getMoney() ) {
				ac.setWithdraw(withdraw);
				ac.getMoney();//출금 성공
			}else {
				//출금 불가능
			}
				} else {
					
				}
				JOptionPane.showMessageDialog(null, "출금성공\n 잔액 :" + ac.getMoney());
				break;
			}
		}
	}
}
