package domain;

public class MinusAccount extends Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "마이너스통장";
	public int limit; // 대출한도

	public MinusAccount(String name, String uid, String pass) {
		super(name, uid, pass);
		setAccountType(ACCOUNT_TYPE);
		}
	// 이거는 굳이 안써도 되지만 쓰는게 좋다
																	//내 자신에서 ACCOUNT_TYPE가 있기에 바로 내려오긴 하겠지만
																	// 시스템 내부에 기본통장이 찍혀있기 때문
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {
		return String.format("%s\n" + "%s\n" + "계좌번호 : %s \n" + "이름 : %s \n" + "생성일 : %s \n" + "잔액 : %d원\n"+"한도 : %d원", BANK_NAME,
				accountType, accountNo, name, createDate, money, limit);
	}
}
