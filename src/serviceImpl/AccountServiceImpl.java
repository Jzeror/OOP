package serviceImpl;
import service.AccountService;
import javax.swing.JOptionPane;
import domain.Account;

public class AccountServiceImpl implements AccountService{
	Account[] list;
	int count;
	
	public AccountServiceImpl() {
		 list = new Account[10000];
		 count = 0;
	}
	
	@Override
	public void addList(Account account) {
		list[count++] = account;  //0때리고 그다음 1로 넘어감. 이렇게 써도 됨
	}
	@Override
	public Account[] list() {
		return list;
	}
	@Override
	public Account createAccount(String name, String uid, String pass) {
		return new Account(JOptionPane.showInputDialog("성명?"), JOptionPane.showInputDialog("인뱅 아이디?"),
				JOptionPane.showInputDialog("비밀번호?"));
	}
	@Override
	public int deposit(int restMoney, String money) {
		
		return 0;
	}

	@Override
	public int withdraw(String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		/*Account[] arr = list();*/
		String result = "";
		for(int i=0; i<count;i++) {
			result+= list()[i].toString();
		}
		return result;
	}
}
