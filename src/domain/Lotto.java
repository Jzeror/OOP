package domain;

/**
 로또볼 추첨
 1~45 까지 랜덤숫자
 볼갯수는 총 6개
 //중복 불허
 출력은 [5, 23, 40, 19, 22, 27]
 * */
/**
 * 메인 얼마치를 구입하십니까? 5200
 */
public class Lotto {
	int ballCon, money;
	int[] ball = new int[6];
	String result;

	public void setBallCon() {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (ball[i] == ball[j]) {
					setBall();
					i--;
				}
			}
		}
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setBall() {
		for (int i = 0; i <= 5; i++) {
			ball[i] = (int) (Math.random() * 50);
			if (ball[i] <= 1 || ball[i] >= 45) {
				i--;
			}
		}
	}

	public void setResult() {
		result = "";
		for (int i = 0; i < 6; i++) {
			result += ball[i] + " | ";
		}
	}

	public int getBallCon() {
		return ballCon;
	}

	public String getResult() {

		return result;
	}

	public int getMoney() {
		return money;
	}

	public String toString() {

		return String.format("%s", result);
	}

}
