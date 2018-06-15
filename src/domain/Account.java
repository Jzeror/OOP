package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, accountType, createDate, accountNo;
	
	public Account(String name, String uid, String pass) {
		
		this.name= name;
		this.uid=uid;
		this.pass=pass;
		setAccountType(ACCOUNT_TYPE);
		setCreateDate();
		setAccountNo();
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setCreateDate() {
		/*Date date = new Date();*/
	/*	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");*/
		this.createDate = 
				new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	public void setAccountNo() {
		accountNo="";
		for(int i= 0 ; i<9 ; i++) {
			accountNo += String.valueOf((int) (Math.random() *10));
			if(i==2||i==5) {accountNo+="-";}
		}
	}

	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	
	public void setMoney(int money) {
		this.money = money; //여기 +=의 기능을 AcoountService로 보냄
	}

	public void setDeposit(int deposit) {
		
		this.money+=deposit; 
		
	}
	public void setWithdraw(int withdraw) {
		this.money+=-withdraw;
		}
	public String getName() {
		return name;
	}

	public String getUid() {
		return uid;
	}

	public String getPass() {
		return pass;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getMoney() {
		return money;
	}
public String getAccountType() {
	return accountType;
}

	public String toString() {
		return String.format("%s\n" + "%s\n" + "계좌번호 : %s \n" + "이름 : %s \n" + "생성일 : %s \n" + "잔액 : %d원", BANK_NAME,
				accountType, accountNo, name, createDate, money);
	}

}

