package service;
import domain.Account; //Account만 써서 .. 다른것도 쓰게 되면 *

public interface AccountService {
	public Account createAccount(String name, String uid, String pass); //Account 가서 복사해오기
	public void addList(Account account);
	public Account[] list();
	public   int deposit(int restMoney, String money);	
	public   int withdraw(String money);
	public  String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult();
}
