package ui;

import javax.swing.JOptionPane;
import domain.BMI; //같은 자바라서 java.은 쓸 필요 없음.
import domain.Grade;
import domain.Salary;
import domain.Lotto;

public class Main {
	public static void main(String[] args) {
		BMI bmi =null; //건물은 안짓고 공간만 존재 . 전체 집합체에 값을 전달할 객체 역할.  temp의 역할
		BMI[] arr = new BMI[2]; //전체 집합체
		int count=0; 
		Grade grade=null;
		Grade[] brr=new Grade[2];
		Salary salary=null;
		Salary[] crr=new Salary[2]; 
		Lotto lotto=null;
		Lotto[] drr=new Lotto[5];
		while (true) {
			String flag = JOptionPane.showInputDialog("0.종료\n" + "1.BMI입력 \n" + "2.BMI보기 \n"
					+ "3.성적입력\n"
					+ "4.성적표보기\n"
					+ "5.월급입력\n"
					+ "6.입력보기\n"
					+ "7.로또\n"
					+ "8.보기\n");
			switch (flag) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1":
				bmi=new BMI();//기존의 값을 청소 ....왜지? 입력을 하면 새로 입력이 되는데? 얘를 arr[2]로 합쳐도 되나?
				bmi.setName(JOptionPane.showInputDialog("이름?"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키?")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게?")));
				bmi.setResult(); // 실행하기 위해 적어야함. 입력하는 코드는 없지만
				arr[count]=bmi;
				count++;
				break;
			case "2":
				String output = "";
				for (int i = 0; i < arr.length; i++) {
					output += arr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "3": 
				grade=new Grade();
				grade.setName(JOptionPane.showInputDialog("이름?"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어?")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학?")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				brr[count]=grade;
				count++;				
				break;
			case "4": 
				output = "";
				for (int i = 0; i < brr.length; i++) {
					output += brr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "5":
				salary=new Salary();
				salary.setDept(JOptionPane.showInputDialog("부서?"));
				salary.setName(JOptionPane.showInputDialog("이름?"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉?")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당?")));
				crr[count]=salary;
				count++;
				break;
			case "6":
				output="";
				for(int i=0; i<crr.length; i++) {
					output += crr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "7": 
				lotto=new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 구입?")));
				for(int s=0; s<lotto.getMoney()/1000; s++) {
			
				lotto.setBall1();
				lotto.setBall2();
				lotto.setBall3();
				lotto.setBall4();
				lotto.setBall5();
				lotto.setBall6();
	
			drr[count]=lotto; 
		count++;
				}
				break;
			case "8" : 
				output="";
				for(int i=0; i<lotto.getMoney()/1000; i++) {
					output += drr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
				default:
				
					return;
			}
		}
	}
}
