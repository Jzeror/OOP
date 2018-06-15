package domain;

public class StaffSalary extends Salary{
	public static final String DEPT= "정직원";
	protected int bonus; //10%

public StaffSalary(String name, String sal) {
	super(name,sal);
	setDept(DEPT);
	setBonus();
}
public void setBonus() {
bonus=sal/10;
}
public void setDept(String dept) {
	this.dept = dept.substring(1,3);
}
public String getDept() {
	return dept;
}
public int getBonus() {
	return bonus;
}
public String toString() {
	return String.format("%s%s에게 %d원을 지급",name,dept,sal+bonus);
}

}
