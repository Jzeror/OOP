package domain;

public class GalaxyPhone extends IPhone {
	private String size,data;
	public static final String BRAND="삼성",KIND="갤럭시노트";
	public void setData(String data) {
		switch(data) {
		case "1": this.data="문자를 보냈다.";break;
		case "2": this.data="전화를 했다.";break;
		case "3": this.data="카톡을 보냈다.";break;
		}
		}
	public void setSize() {
		size="6";
	}	
	public void setPotable() {
		
	}
	public String getSize() {
		return size;
	}
	public String getData() {
		return data;
	}
	// 홍길동에게 010번호로 삼성 제품 6인치 갤럭시노트폰을 사용해서
	// 이동가능한 상태로 안녕이라고 카톡를 전송했다.
	public String toString() {
		setSize();
		super.setPortable(true);
		return String.format("%s에게 %s 번호로 %s제품 %s인치 %s을 사용해서 %s한 상태로 %s이라고 %s.", super.getName(), super.getPhoneNum(),
				BRAND, size, KIND, super.getMove(), super.getCall(), data);
	}
}
