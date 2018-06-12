package domain;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	/*
	 * public final static String WITHDRAW_SUCCESS="출금성공"; public final static
	 * String WITHDRAW_FAIL="잔액부족"; public final static String
	 * DEPOSIT_SUCCESS="입금성공";
	 */
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, accountType, createDate, accountNo;
	int[] arr = {1,2,3,4,5,6,7,8,9};
	

	// 통장 123-345-678 의 형태가 되도록 코딩
	// 블로그에서 오늘 날짜 뽑는 로직
	public void setName(String name) {
		this.name = name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setCreateDate() {

	}

	public void setAccountNo() {

		for(int s=0;s<1;s++) {
			int a=(int)(Math.random()*1000);
		if(a<100) {s--;}	
		}
		}


	public void setMoney(int money) {
		this.money = money;
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

	public String toString() {
		return String.format("%s\n" + "%s\n" + "계좌번호 : %s \n" + "이름 : %s \n" + "생성일 : %s \n" + "잔액 : %d", BANK_NAME,
				ACCOUNT_TYPE, accountNo, name, createDate, money);
	}
}
