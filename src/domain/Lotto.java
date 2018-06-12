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
	int ball1, ball2, ball3, ball4, ball5, ball6, money;
	String result;

	public void setMoney(int money) {
		this.money = money;
	}

	public void setBall1() {
		for (int i = 0; i <= 0; i++) {
			ball1 = (int) (Math.random() * 50);
			if (ball1 >= 1 && ball1 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setBall2() {
		for (int i = 0; i <= 0; i++) {
			ball2 = (int) (Math.random() * 50);
			if (ball2 >= 1 && ball2 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setBall3() {
		for (int i = 0; i <= 0; i++) {
			ball3 = (int) (Math.random() * 50);
			if (ball3 >= 1 && ball3 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setBall4() {
		for (int i = 0; i <= 0; i++) {
			ball4 = (int) (Math.random() * 50);
			if (ball4 >= 1 && ball4 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setBall5() {
		for (int i = 0; i <= 0; i++) {
			ball5 = (int) (Math.random() * 50);
			if (ball5 >= 1 && ball5 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setBall6() {
		for (int i = 0; i <= 0; i++) {
			ball6 = (int) (Math.random() * 50);
			if (ball6 >= 1 && ball6 <= 45) {
				i++;
			} else {
				i--;
			}
		}
	}

	public void setResult() {

	}

	public int getMoney() {

		return money;
	}

	public int getBall1() {

		return ball1;
	}

	public int getBall2() {

		return ball2;
	}

	public int getBall3() {

		return ball3;
	}

	public int getBall4() {

		return ball4;
	}

	public int getBall5() {

		return ball5;
	}

	public int getBall6() {

		return ball6;
	}

	public String getResult() {
		return result;
	}

	public String toString() {

		return String.format("%d | %d | %d | %d | %d | %d", ball1, ball2, ball3, ball4, ball5, ball6);
	}

}
