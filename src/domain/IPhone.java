package domain;

public class IPhone extends CellPhone{
	private String data;
	public static final String BRAND="애플", KIND="IPhone";	
	
	public void setData(String data) {
		this.data=(Integer.parseInt(data)==1)?"문자를 전송했다" :"전화를 보냈다" ;
		}
	public void setPotable() {
		
	}
	public String getData() {
		return data; 
	}
public String toString() {
//홍길동에게 010번호로 애플 제품 아이폰을 사용해서
//스마트폰이기 때문에 이동가능한 상태로 안녕이라고 문자를 전송했다.
	super.setPortable(true);
	return String.format(
			"%s에게 %s로 %s제품 %s을 사용해서 %s 상태로 %s이라고 %s "
			,super.getName(),super.getPhoneNum(),BRAND,KIND,super.getMove(),super.getCall(),data);
}
}
