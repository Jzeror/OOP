package domain;

public class Grade {
	int kor, eng, math, total, avg;
	String name, grade;

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal() {
		total = kor + eng + math;
	}

	public void setAvg() {
		avg = total / 3;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade() {
		switch (avg / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			break;
		}
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public int getAvg() {
		return avg;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public String toString() {
		return String.format("이름: %s, 총점: %d, 평균: %d, 등급:%s", name, total, avg, grade);

	}
}
