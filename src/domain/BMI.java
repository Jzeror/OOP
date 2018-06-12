package domain;

public class BMI {
	// 메인메소드를 걸어버리면 ui패키지의 Main에서 얘를 가져다 쓰지 못하게 됨.
	String name, result;
	double height, weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		double a = weight / ((height / 100) * (height / 100));
		if (a < 18.5) {
			result = "저체중";
		} else if (a < 23) {
			result = "정상";
		} else if (a < 25) {
			result = "비만 전단계";
		} else if (a < 30) {
			result = "1단계 비만";
		} else if (a < 35) {
			result = "2단계 비만";
		} else {
			result = "3단계 비만";
		}
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("%s  |  %f  |  %f  |  %s", name,height,weight,result);
	}
}
